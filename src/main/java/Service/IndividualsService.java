package Service;

import DTOs.IndividualDto;
import Entities.Individuals;
import Repository.IndividualsRepo;
import org.hibernate.annotations.NotFound;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class IndividualsService {
    private final IndividualsRepo individualsRepo;
    private final ModelMapper modelMapper;
    public IndividualsService(IndividualsRepo individualsRepo, ModelMapper modelMapper){
        this.individualsRepo=individualsRepo;
        this.modelMapper=modelMapper;
    }
    public Boolean createIndividual(IndividualDto individualDto){
        Individuals individual=new Individuals();
        individual.setName(individualDto.getName());
        individual.setAge(individualDto.getAge());
        individual.setCnic(individualDto.getCnic());
        individual.setTypeOfInd(individualDto.getTypeOfInd());
        try{
            individualsRepo.save(individual);
            return true;
        }catch (Exception ex){
            throw new RuntimeException("Can not create individual");
        }
    }
    public IndividualDto getIndividual(int id){
        Individuals individual=individualsRepo.findById(id).orElseThrow(() -> new RuntimeException("individual not found"));
        IndividualDto individualDto=modelMapper.map(individual, IndividualDto.class);
        return individualDto;
    }
    public List<IndividualDto> getAll(){
        List<Individuals> individuals=this.individualsRepo.findAll();
        List<IndividualDto> individualDtos=individuals.stream().map(x -> this.modelMapper.map(x, IndividualDto.class)).collect(Collectors.toList());
        return individualDtos;
    }
    public String deleteIndividual(int id){
        Individuals individuals=individualsRepo.findById(id).orElseThrow(()-> new RuntimeException("not found"));
        String name=individuals.getName();
        individualsRepo.delete(individuals);
        return name;
    }
}
