package com.ms.myblog.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class User {

    @Id  //key
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //auto  accrued stategy.
    private Long id;

    @NotEmpty(message = "Username is not available")
    @Size(min = 3,max = 20)
    @Column(nullable =false,length = 20,unique = true)
    private String username;

    private String password;

    @NotEmpty(message = "email is not available")
    @Size(min = 3,max = 50)
    @Column(nullable =false,length = 20,unique = true)
    @Email(message = "Format of email is correct")
    private String email;
    @Column(length = 200)
    private String avatar;   //address of linked

    protected User() {     // do not permit to use outside directly
    }

    public User(String username, String password, String email, String avatar) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.avatar = avatar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
