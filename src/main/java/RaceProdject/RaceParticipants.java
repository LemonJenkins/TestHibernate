package RaceProdject;

import javax.persistence.*;

@Entity
@Table
public class RaceParticipants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private RegisteredUsers registeredUser;

    @Column
    private Integer DrivingExpiriens;

    @Column
    private Cars car;

    @Column
    private Races race;

}
