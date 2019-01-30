/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.springit.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author edwinangar
 */
@Entity
@Data
@NoArgsConstructor
public class Link {
    
    
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;
    @OneToMany(mappedBy = "link")
    private List<Comment> comments=new ArrayList<>();
    
}
