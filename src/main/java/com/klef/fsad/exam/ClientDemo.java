package com.klef.fsad.exam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.util.Optional;

@Component
public class ClientDemo implements CommandLineRunner {

    private final HospitalRepository repo;

    public ClientDemo(HospitalRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {

        // Operation I : INSERT
        Hospital h = new Hospital();
        h.setName("KLEF Medical Centre");
        h.setDescription("Super-speciality hospital at KLEF University");
        h.setDate(LocalDate.of(2005, 6, 15));
        h.setStatus("Active");
        h.setLocation("Vaddeswaram, Guntur, AP");
        h.setContactNumber("+91-9000000000");
        h.setHospitalType("Private");
        h.setTotalBeds(500);
        h.setEmail("info@klefmedical.in");

        Hospital saved = repo.save(h);
        System.out.println("\nOperation I  - INSERT SUCCESS");
        System.out.println("Auto-Generated ID = " + saved.getId());

        // Operation II : VIEW BY ID
        System.out.println("\nOperation II - VIEW BY ID");
        Optional<Hospital> result = repo.findById(saved.getId());
        result.ifPresent(System.out::println);
    }
}