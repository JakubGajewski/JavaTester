package pl.javatester.JavaTester.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.javatester.JavaTester.models.QuestionModel;
import pl.javatester.JavaTester.models.UserModel;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Integer> {
    Optional<UserModel> findByNickAndPassword(String nick, String password);
    UserModel findById(int id);
}
