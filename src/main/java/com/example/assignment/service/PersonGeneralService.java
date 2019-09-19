package com.example.assignment.service;

import com.example.assignment.model.PersonDetails;

import java.util.List;

public interface PersonGeneralService {

    List<PersonDetails> personGeneralInformationList();
    List<PersonDetails> getListPersonDetails();
    List<PersonDetails> findPersonDetailsByStatus(String status);
    List<PersonDetails> findPersonDetailsByScannedBy(String scannedBy);
}
