package pl.javatester.JavaTester.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.javatester.JavaTester.models.QuestionModel;

import java.util.List;

@Repository
public interface QuestionReopository extends CrudRepository<QuestionModel, Integer> {
//    QuestionModel getOneById(int id);
    QuestionModel findById(int id);
}