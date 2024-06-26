package controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("reports/")
public class ReportController {
    public ResponseEntity<String> getReports(@RequestParam int reportId){
        return new ResponseEntity("Reports Retrieved Successfully", HttpStatus.OK);
    }
}
