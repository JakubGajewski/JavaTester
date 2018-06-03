package pl.javatester.JavaTester.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.javatester.JavaTester.models.UserModel;
import pl.javatester.JavaTester.models.repositories.QuestionReopository;
import pl.javatester.JavaTester.models.repositories.UserRepository;
import pl.javatester.JavaTester.models.services.UserService;

import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    QuestionReopository questionReopository;
    UserRepository userRepository;
    UserService userService;


    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam("login") String login,
                            @RequestParam("password") String password) {

        Optional<UserModel> exist = userRepository.findByNickAndPassword(login, password);
        if(exist.isPresent()){
            //userService.setLogin(true);
            userService.setUser(exist.get());
            return "index";
        }

        //userService.setBadLoginCounter(userService.getBadLoginCounter() + 1);
        //model.addAttribute("info", "Bad login or password");
        return "bad_password";
    }
}
