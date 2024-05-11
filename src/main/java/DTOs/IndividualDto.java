package DTOs;

import Entities.Audit;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class IndividualDto {
    private int id;
    @NotEmpty
    private int name;
    private int cnic;
    private int age;
    private String TypeOfInd;
}
