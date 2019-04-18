package com.example.designer2.fragmentsdemo.Model;

public class Posts {
    private int post_id;
    private int category_id;
    private String username;
    private String caption;
    private String title;
    private String description;
    private String createdat;
    private String categorie;
    private String imgUrl;

    public Posts() {
    }

    public Posts(int post_id, int category_id, String username, String caption, String title, String description, String createdat, String categorie, String imgUrl) {
        this.post_id = post_id;
        this.category_id = category_id;
        this.username = username;
        this.caption = caption;
        this.title = title;
        this.description = description;
        this.createdat = createdat;
        this.categorie = categorie;
        this.imgUrl = imgUrl;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedat() {
        return createdat;
    }

    public void setCreatedat(String createdat) {
        this.createdat = createdat;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
