package RaceProdject;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class RegisteredUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String nickname;

    @Column
     private Boolean availabilityMachine;

    @Column
    private Integer age;

    @Column
    private String pass;
}
