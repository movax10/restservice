package com.interview.restservice.repository;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DataSnapshot {

    @Id
    private Long pk;
    private String name;
    private String description;
    private LocalDateTime updatedTimestamp;
}
