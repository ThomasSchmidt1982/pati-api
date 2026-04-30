package fr.schmidt.patiapi.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "baseEntity_seq")
    @SequenceGenerator(name = "baseEntity_seq", sequenceName = "baseEntity_seq", allocationSize = 1)
    private Long id;

    @Column(nullable = false)
    private String name;


    private String description;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;
}
