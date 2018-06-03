package pl.javatester.JavaTester.models;

//TODO: Michał

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import pl.javatester.JavaTester.models.repositories.UserRepository;
import javax.persistence.*;

@Entity
@Table(name = "javatestuser")
@Data
@NoArgsConstructor
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nick;
    private String password;
    @Column(name = "user_type")
    private String userType;
    private String answered;

    //TODO - verify
    @Autowired
    UserRepository userRepository;
}
