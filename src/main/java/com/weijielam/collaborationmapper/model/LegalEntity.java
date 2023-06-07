package com.weijielam.collaborationmapper.model;

import javax.persistence.*;
        
public class LegalEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="type")
    private String type;

    @Column(name="name")
    private String name;

    public LegalEntity(){

    }

    public LegalEntity(Integer id, String type, String name) {
        this.id=id;
        this.type = type;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }


}