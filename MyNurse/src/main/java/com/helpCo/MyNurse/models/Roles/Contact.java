package com.helpCo.MyNurse.models.Roles;

import com.helpCo.MyNurse.models.EContactType;

import javax.persistence.*;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String[] languages;
    @Enumerated(EnumType.STRING)
    private EContactType type;

    public Contact() {}

    public Contact(String name, String email, String[] languages,EContactType type) {
        this.name = name;
        this.email = email;
        this.languages = languages;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public EContactType getType() {
        return type;
    }

    public void setType(EContactType type) {
        this.type = type;
    }
}
