package controllers;

import DTOs.IndividualDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/individuals")
public class Individuals {
    public ResponseEntity<?> createIndividual(IndividualDto individualDto){
        return ResponseEntity.ok("individual created successfully");
    }
}
