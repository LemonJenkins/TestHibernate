package RaceProdject;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Races {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Date checkinTime;

    @Column
    private RaceParticipants raceParticipantOne;

    @Column
    private RaceParticipants raceParticipantTwo;

    @Column
    private RaceParticipants winner;

}
