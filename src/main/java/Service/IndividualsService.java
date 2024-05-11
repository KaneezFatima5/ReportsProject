package Service;

import DTOs.IndividualDto;
import Entities.Individuals;
import Repository.IndividualsRepo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class IndividualsService {
    private final IndividualsRepo individualsRepo;
    private final ModelMapper modelMapper;
    public IndividualsService(IndividualsRepo individualsRepo, ModelMapper modelMapper){
        this.individualsRepo=individualsRepo;
        this.modelMapper=modelMapper;
    }
    public Boolean createIndividualM(IndividualDto individualDto){
        Individuals individual=new Individuals();
        individual.setName(individualDto.getName());
        individual.setAge(individualDto.getAge());
        individual.setCnic(individualDto.getCnic());
        individual.setTypeOfInd(individualDto.getTypeOfInd());
        try{
            individualsRepo.save(individual);
        }catch (Exception ex){
            throw new RuntimeException("Can not create individual");
        }


    }
}
