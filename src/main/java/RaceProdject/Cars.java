package RaceProdject;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;

public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String mark;

    @Column
    private String model;

    @Column
    private Integer horsePower;

    @Column
    private Long accelerationTo100;

    @Column
    private Integer maxSpeed;
}
