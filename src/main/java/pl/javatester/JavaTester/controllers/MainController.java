package pl.javatester.JavaTester.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.javatester.JavaTester.models.QuestionModel;
import pl.javatester.JavaTester.models.repositories.QuestionReopository;
import pl.javatester.JavaTester.models.repositories.UserRepository;

import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    QuestionReopository questionReopository;
    UserRepository userRepository;

    @GetMapping("/")
    @ResponseBody
    public String costam() {
        Optional<QuestionModel> questionModel = questionReopository.findById(7);
        return questionModel.toString();
    }

}
