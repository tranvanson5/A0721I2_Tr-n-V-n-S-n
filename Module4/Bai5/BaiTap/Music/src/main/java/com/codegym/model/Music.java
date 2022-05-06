package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name",nullable = false, columnDefinition = "VARCHAR(50) NOT NULL")
    private String name;
    @Column(name = "name",nullable = false, columnDefinition = "VARCHAR(50) NOT NULL")
    private String singer;
    @Column(name = "name",nullable = false, columnDefinition = "VARCHAR(50) NOT NULL")
    private String type;
    @Column(name = "name",nullable = false, columnDefinition = "VARCHAR(255) NOT NULL")
    private String file;

    public Music() {
    }

    public Music(int id, String name, String singer, String type, String file) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.type = type;
        this.file = file;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
