package pl.coderslab.charity.security;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.charity.CurrentUser;

@Controller
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository, UserService userService) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @GetMapping("/create-user")
    @ResponseBody
    public String createUser() {
        User user = new User();
        user.setName("admin");
        user.setPassword("admin");
        userService.saveUser(user);
        return "admin";
    }
//    @GetMapping("/admin")
//    @ResponseBody
//    public String userInfo(@AuthenticationPrincipal UserDetails customUser) {
//        log.info("customUser class {} " , customUser.getClass());
//        return "You are logged as " + customUser;
//    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin(@AuthenticationPrincipal CurrentUser customUser) {
        User entityUser = customUser.getUser();
        return "Hello " + entityUser.getUsername();
    }

    @GetMapping("/register")
    public String registerForm(Model model) {
        model.addAttribute("user", new User());
        return "/user/register";
    }

    @PostMapping("/register")
    public String registerUser(User user, Model model) {
        String password2 = (String) model.getAttribute("password2");
        if (user.getPassword().equals(password2)) {
            userService.saveUser(user);
        }
        return "/user/login";
    }

}
