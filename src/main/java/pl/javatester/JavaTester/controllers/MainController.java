package pl.javatester.JavaTester.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    //TODO
    @GetMapping("/index")
    public String displayIndex() {
        return "index";
    }

    @GetMapping("/question")
    public String displayQuestion(Model model) {
        model.addAttribute("questionModel", questionReopository.findById(1));
        //Optional<QuestionModel> questionModel = questionReopository.findById(1);
        return "question";
    }

    @PostMapping("/question")
    public String answerQuestion(Model model) {
        model.addAttribute("questionModel", questionReopository.findById(1));
        //Optional<QuestionModel> questionModel = questionReopository.findById(1);
        return "question";
    }
}



