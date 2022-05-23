package com.codegym.blog.model;

import org.springframework.web.multipart.MultipartFile;


public class BlogForm {
    private int id;
    private String name;
    private String content;
    private MultipartFile file;

    public BlogForm() {
    }

    public BlogForm(int id, String name, String content, MultipartFile file) {
        this.id = id;
        this.name = name;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
