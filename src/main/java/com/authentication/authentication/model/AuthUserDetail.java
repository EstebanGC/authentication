package com.authentication.authentication.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AuthUserDetail extends User implements UserDetails {

    public AuthUserDetail(User user){
        super(user);
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();

        getRoles().forEach(role -> {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
            role.getPermissions().forEach(permission -> {
                grantedAuthorities.add(new SimpleGrantedAuthority(permission.getName()));
            });
        });

        return grantedAuthorities;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return super.isCredentialNonExpired();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUserName() {
        return super.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return super.isCredentialNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return super.isAccountNonLocked();
    }

    @Override
    public boolean isEnabled() {
        return super.isEnabled();
    }
}
