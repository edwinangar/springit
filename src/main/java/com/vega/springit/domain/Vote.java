/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.springit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author edwinangar
 */
@Entity
@Data
    @NoArgsConstructor
public class Vote {

    @Id
    @GeneratedValue
    
    private Long id;
//    private User user;
//    private Link link;
    private int vote;

}
