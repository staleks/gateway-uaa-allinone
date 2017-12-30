package rs.in.staleksit.evidencija.gateway.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.in.staleksit.evidencija.gateway.security.CustomUser;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    /**
     *
     * Instead of returning the principal directly, we're returning a custom user object
     * that exposes the username and authorities list.
     *
     * This way we bypass the issue https://github.com/spring-projects/spring-boot/issues/5482
     *
     * @param user
     * @return
     */
    @RequestMapping("/user")
    public CustomUser user(Principal user) {
        List<String> authorities = new ArrayList<>();

        //TODO: we should try to avoid casting like this.
        Collection<GrantedAuthority> oauthAuthorities = ((OAuth2Authentication) user).getAuthorities();

        for (GrantedAuthority grantedAuthority : oauthAuthorities) {
            authorities.add(grantedAuthority.getAuthority());
        }

        return new CustomUser(user.getName(), authorities);
    }

}
