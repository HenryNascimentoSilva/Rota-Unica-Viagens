package com.rotaunica.viagens.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Excursion {

    @Id
    @UuidGenerator
    private UUID id;
    private String title;
    private String shortDescription;
    private String longDescription;
    private String imageURL;
    private BigDecimal basePrice;
    private String location;
    private LocalDateTime dateAndTime;
    private List<String> includes;
}
