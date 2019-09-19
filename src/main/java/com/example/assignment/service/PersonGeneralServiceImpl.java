package com.example.assignment.service;

import com.example.assignment.model.PersonDetails;
import com.example.assignment.repository.PersonGeneralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonGeneralServiceImpl implements  PersonGeneralService {

    @Autowired
    private PersonGeneralRepository personGeneralRepository;


    public List<PersonDetails> personGeneralInformationList()
    {
       return personGeneralRepository.findByCountryId();
    }

    @Override
    public List<PersonDetails> getListPersonDetails() {
        return personGeneralRepository.findAll();
    }

    @Override
    public List<PersonDetails> findPersonDetailsByStatus(String status) {
        return personGeneralRepository.findPersonDetailsByStatus(status);
    }

    @Override
    public List<PersonDetails> findPersonDetailsByScannedBy(String scannedBy) {
        return personGeneralRepository.findPersonDetailsByScannedBy(scannedBy);
    }
}
