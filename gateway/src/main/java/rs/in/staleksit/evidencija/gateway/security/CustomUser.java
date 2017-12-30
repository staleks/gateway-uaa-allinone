package rs.in.staleksit.evidencija.gateway.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomUser implements UserDetails {

    private String username;
    private String password;
    private List<String> roles;

    /**
     * @param username
     * @param password
     * @param roles
     */
    public CustomUser(String username, String password, List<String> roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    /**
     * @param username
     * @param authorities
     */
    public CustomUser(String username, List<String> authorities) {
        this.username = username;
        this.roles = authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (String roleItem: roles) {
            authorities.add(new GrantedAuthority() {
                @Override
                public String getAuthority() {
                    return roleItem;
                }
            });
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
