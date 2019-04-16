package com.capgemini.parkingApp.dto;

public class UserDto {
    private Long id;
    private String nick;
    private String e_mail;

    public UserDto(Long id, String nick, String e_mail) {
        this.id = id;
        this.nick = nick;
        this.e_mail = e_mail;
    }

    public UserDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }
}
