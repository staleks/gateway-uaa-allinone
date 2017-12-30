package rs.in.staleksit.evidencija.gateway.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.*;

@Component("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService, Serializable {

    private static final Logger LOG = LoggerFactory.getLogger(CustomUserDetailsService.class);

    private Map<String, CustomUser> usersDB = new HashMap<>();

    public CustomUserDetailsService() {
        CustomUser user = new CustomUser("user@evidencija-pos.com", "123", Arrays.asList("USER"));
        usersDB.put(user.getUsername(), user);

        CustomUser admin = new CustomUser("admin@evidencija-pos.com", "admin", Arrays.asList("ADMIN"));
        usersDB.put(admin.getUsername(), admin);

        LOG.info("Number of users: {}", usersDB.size());
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LOG.info("Loading user by username: {}", username);
        CustomUser user = usersDB.get(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return user;
    }

}
