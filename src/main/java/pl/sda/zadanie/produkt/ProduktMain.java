package pl.sda.zadanie.produkt;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

public class ProduktMain {
    @Data
    @Entity
    @AllArgsConstructor
    @NoArgsConstructor
    public class Osoba {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(nullable = false)
        private String nazwa;                                                    // 'imie'                   VARCHAR(255)
        private String kategoria;                                       // 'kierunek_nauczania'     VARCHAR(255)
        private String indeks;
        private LocalDate dataUrodzenia;
}
