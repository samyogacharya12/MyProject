package com.example.assignment.service;

import com.example.assignment.model.PersonDetails;

import java.io.FileNotFoundException;
import java.util.List;

public interface PersonDetailService {

    void savePersonalDetail(PersonDetails personDetails);
    List<PersonDetails> personGeneralInformationList();
    void savePersonDetailCSV();
    List<PersonDetails> getListPersonDetails();
    List<PersonDetails> findPersonDetailsByStatus(String status);
    List<PersonDetails> findPersonDetailsByScannedBy(String scannedBy);
}
