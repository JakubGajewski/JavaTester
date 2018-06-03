package pl.javatester.JavaTester.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "javatestquestion")
@Data
@NoArgsConstructor
public class QuestionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String content;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private int correct;
}