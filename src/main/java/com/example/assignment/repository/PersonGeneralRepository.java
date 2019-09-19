package com.example.assignment.repository;

import com.example.assignment.model.PersonDetails;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonGeneralRepository extends CrudRepository<PersonDetails, Integer> {

//    @Query("SELECT a.person_detail_id, a.person_general_id,c.email, c.email2, c.first_name, c.last_name ,b.address1, b.address2, b.address3, b.city, b.collateral, b.company_name, b.country_id, b.event_name, b.fax_number, b.job_title, b.note, b.phone_number, b.phone2_number, b.question, b.response, b.scanned_by, b.scanned_date, b.scanned_time, b.state_id, b.status, b.zip FROM person_mapping a, person_details b, person_general_information c WHERE a.person_detail_id=b.person_detail_id and a.person_general_id=c.person_general_id and country_id='United States'")
    @Query("FROM person_details WHERE country_id='United States'")
    List<PersonDetails> findByCountryId();
    List<PersonDetails> findAll();
    List<PersonDetails> findPersonDetailsByStatus(String status);
    List<PersonDetails> findPersonDetailsByScannedBy(String scannedBy);

}
