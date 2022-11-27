package pl.sda.zadanie.produkt;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;

import java.time.LocalDate;
import java.util.Set;
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ProduktMain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(nullable = false)
    private String nazwa;

    @Column(nullable = false)
    private String kategoria;






}
