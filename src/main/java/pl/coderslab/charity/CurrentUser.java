package pl.coderslab.charity;

import org.springframework.security.core.GrantedAuthority;
import pl.coderslab.charity.security.User;

import java.util.Collection;

public class CurrentUser extends User {

    private final User user;

    public CurrentUser(User user, String username, String password,
                       Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.user = user;
    }

    public User getUser() {
        return user;
    }


}
