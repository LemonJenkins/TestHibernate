package RaceProdject;

import javax.persistence.*;

@Entity
@Table
public class Players {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private RegisteredUsers registeredUser;

    @Column
    private Integer rate;

    @Column
    private Races race;

    @Column
    private RaceParticipants raceParticipant;
}
