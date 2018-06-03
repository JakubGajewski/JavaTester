package pl.javatester.JavaTester.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.javatester.JavaTester.models.repositories.QuestionReopository;
import pl.javatester.JavaTester.models.repositories.UserRepository;
import pl.javatester.JavaTester.models.services.UserService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@Controller
public class MainController {

    @Autowired
    QuestionReopository questionReopository;
    UserRepository userRepository;
    UserService userService;

    //TODO
    @GetMapping("/index")
    public String displayIndex() {
        return "index";
    }

    @GetMapping("/question")
    public String displayQuestion(Model model) {
        int questionId = (int)Math.random()*5;
        List answeredQuestions = new ArrayList<>();
        if (answeredQuestions.size() == 5) {
            return "out_of_question";
        }
        answeredQuestions = Arrays.asList(userService.getUser().getAnswered().split("."));
        while (answeredQuestions.contains(questionId+""))
        {
            questionId = (int)Math.random()*5;
        }
        model.addAttribute("questionModel", questionReopository.findById(questionId));
        //model.addAttribute ("answerForm", new AnswerForm());
        //model.addAttribute("questionModel", questionReopository.findById(1));
        //Optional<QuestionModel> questionModel = questionReopository.findById(1);
        return "question";
    }
//
//    @PostMapping("/question")
//    public String answerQuestion(Model model) {
//        model.addAttribute("questionModel", questionReopository.findById(1));
//        //Optional<QuestionModel> questionModel = questionReopository.findById(1);
//        return "question";
//    }

    //todo: zmienić ustawione na sztywno pytanie na takie, jakie w rzeczywistości padło
    @PostMapping("/question")
    public String answerQuestionXXX(@RequestParam ("chosenAnswer") int chosenAnswer) {
        System.out.println(chosenAnswer);
        if(questionReopository.findById(1).getCorrect() == chosenAnswer) {
            return "DOBRZE";
        }
        else {
            return "ŹLE";
        }
    }
}



