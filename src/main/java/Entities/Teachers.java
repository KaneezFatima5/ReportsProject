package Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@DiscriminatorValue(value = Teachers.TEACHER)
@Entity
public class Teachers extends Individuals {
    public static final String TEACHER="T";
    
}
