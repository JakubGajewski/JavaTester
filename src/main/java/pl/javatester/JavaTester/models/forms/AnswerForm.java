package pl.javatester.JavaTester.models.forms;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AnswerForm {
    private int chosenAnswer;
    private String cyfra;
}
