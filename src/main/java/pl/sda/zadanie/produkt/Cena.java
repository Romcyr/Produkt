package pl.sda.zadanie.produkt;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Cena {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private  Long id;
        private double cena;
        private LocalDateTime dataCzasSprzedaży;
        private double ilość;




}
