package de.torluoglu.skllsmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @author Yunus Torluoglu
 * Initialize project skllsmanager
 * 210509/TYN1 added RestController = PersonResource.class, data class = Person.class,
 * JpaRepo = PersonRepo.class, RuntimeException class = PersonNotFoundException
 */

@SpringBootApplication
public class SkllsmanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkllsmanagerApplication.class, args);
    }

}
