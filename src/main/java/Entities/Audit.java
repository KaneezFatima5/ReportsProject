package Entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;

@Embeddable
public class Audit {
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;
}
