package com.example.pair4.entities;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {

    USER,
    ADMIN,
    MODERATOR,
    CUSTOMER;

    @Override
    public String getAuthority() {
        return name();
    }
}
