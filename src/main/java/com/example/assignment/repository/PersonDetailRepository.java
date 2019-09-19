package com.example.assignment.repository;

import com.example.assignment.model.PersonDetails;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonDetailRepository extends CrudRepository<PersonDetails, Integer> {

    @Query("FROM person_details WHERE country_id='United States'")
    List<PersonDetails> findByCountryId();
    List<PersonDetails> findAll();
    List<PersonDetails> findPersonDetailsByStatus(String status);
    List<PersonDetails> findPersonDetailsByScannedBy(String scannedBy);
    
}
