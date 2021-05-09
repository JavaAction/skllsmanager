package de.torluoglu.skllsmanager.repo;

import de.torluoglu.skllsmanager.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepo extends JpaRepository<Person, Long>
{
    //spring creates the functionality by the given name automatically
    void deletePersonById( final Long id );

    Optional<Person> findPersonById( final Long id );
}
