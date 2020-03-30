package com.ecemokan.usersapp.model;

public class UserModel {

    String login;
    Integer id;
    String htmlUrl;
    String avatarUrl;

    public UserModel(String login, Integer id, String htmlUrl, String avatarUrl) {
        this.login = login;
        this.id = id;
        this.htmlUrl = htmlUrl;
        this.avatarUrl = avatarUrl;
    }

    public String getLogin() {
        return login;
    }

    public Integer getId() {
        return id;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

}
