package pl.javatester.JavaTester.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.javatester.JavaTester.models.QuestionModel;
import pl.javatester.JavaTester.models.UserModel;

public interface UserRepository extends CrudRepository<UserModel, Integer> {
    UserModel findById(int id);
}
