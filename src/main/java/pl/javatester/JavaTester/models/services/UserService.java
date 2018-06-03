package pl.javatester.JavaTester.models.services;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.javatester.JavaTester.models.UserModel;
import pl.javatester.JavaTester.models.repositories.UserRepository;

@Service
public class UserService {

    final
    UserRepository userRepository;

    @Getter @Setter
    private UserModel user;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    //List<String> answeredAnswers = Arrays.asList(userRepository.findById(user.getId()).getAnswered().split("_"));

}
