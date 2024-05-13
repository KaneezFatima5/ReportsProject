package controllers;

import DTOs.IndividualDto;
import Service.IndividualsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/individuals")
public class Individuals {
    private final IndividualsService individualsService;
    public Individuals(IndividualsService individualsService){
        this.individualsService=individualsService;
    }
    public ResponseEntity<?> createIndividual(IndividualDto individualDto){
        Boolean isCreated=individualsService.createIndividual(individualDto);
        return ResponseEntity.ok("individual created successfully");
    }
    public ResponseEntity<IndividualDto> getIndividualById(int id){
        IndividualDto individual= individualsService.getIndividual(id);
        return ResponseEntity.ok(individual);
    }
    public ResponseEntity<List<IndividualDto>> getAllIndividuals(){
        List<IndividualDto> individuals=individualsService.getAll();
        return ResponseEntity.ok(individuals);
    }
    
}
