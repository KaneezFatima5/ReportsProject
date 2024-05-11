package Entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DiscriminatorValue(value = Students.STUDENT)
@Entity
public class Students extends Individuals {
    public static final String STUDENT="S";
}
