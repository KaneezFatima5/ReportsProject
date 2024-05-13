package Entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_of_ind", discriminatorType=DiscriminatorType.STRING)
public class Individuals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty
    private String name;
    private int cnic;
    private int age;
    @Embedded
    private Audit audit;
    @Column(name="type_of_ind", updatable = false, insertable = false)
    private String TypeOfInd;
}
