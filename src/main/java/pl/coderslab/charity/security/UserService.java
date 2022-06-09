package pl.coderslab.charity.security;

import pl.coderslab.charity.security.User;

public interface UserService {

        User findByUserName(String username);
        void saveUser(User user);

}
