package com.bibliohome.biblioweb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class bibliothecaire {
    @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
    private Long code;
    private String nom;
    private String prenom;
    private String password;

    public Long getCode(){
        return code;
    }
    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public String getPassword(){
        return password;
    }
}
