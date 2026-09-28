package _AD004.demo.controller ;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/test")
    public String test() {
        return "User Controller Working";
    }

    @PostMapping("/register")
    public String registerUser() {
        return "User registered successfully";
    }

    @PostMapping("/login")
    public String loginUser() {
        return "Login successful";
    }
}