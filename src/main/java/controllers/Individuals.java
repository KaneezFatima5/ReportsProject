package controllers;

import DTOs.IndividualDto;
import Service.IndividualsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/individuals")
public class Individuals {
    private final IndividualsService individualsService;
    public Individuals(IndividualsService individualsService){
        this.individualsService=individualsService;
    }
    public ResponseEntity<?> createIndividual(IndividualDto individualDto){
        return ResponseEntity.ok("individual created successfully");
    }
}
