package de.torluoglu.skllsmanager.service;

import de.torluoglu.skllsmanager.model.Person;
import de.torluoglu.skllsmanager.repo.PersonRepo;
import de.torluoglu.skllsmanager.exception.PersonNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService
{
    private final PersonRepo personRepo;

    @Autowired
    public PersonService( final PersonRepo personRepo )
    {
        this.personRepo = personRepo;
    }

    public Person addPerson( final Person person )
    {
        return personRepo.save( person );
    }

    public List<Person> findALlPersons()
    {
        return personRepo.findAll();
    }

    public Person updatePerson( final Person person )
    {
        return personRepo.save( person );
    }

    public Person findPersonById ( final Long id)
    {
        return personRepo.findPersonById( id )
                .orElseThrow( ()-> new PersonNotFoundException( "Person by id: " + id + "was not found!" ));
    }

    public void deletePerson ( final Long id)
    {
        personRepo.deletePersonById( id );
    }
}
