package com.example.assignment.service;

import com.example.assignment.model.PersonDetails;
import com.example.assignment.model.PersonGeneralInformation;
import com.example.assignment.repository.PersonDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

@Service
public class PersonDetailServiceImpl implements PersonDetailService {

    @Autowired
    private PersonDetailRepository personDetailRepository;

    private String fileName="D:/Subjects/Java/Samyog/interview-assignment/personDetail.csv";

    @Override
    public void savePersonalDetail(PersonDetails personDetails) {
        personDetailRepository.save(personDetails);
    }

    public List<PersonDetails> personGeneralInformationList()
    {
       return personDetailRepository.findByCountryId();
    }

    @Override
    public List<PersonDetails> getListPersonDetails() {
        return personDetailRepository.findAll();
    }

    @Override
    public List<PersonDetails> findPersonDetailsByStatus(String status) {
        return personDetailRepository.findPersonDetailsByStatus(status);
    }

    @Override
    public List<PersonDetails> findPersonDetailsByScannedBy(String scannedBy) {
        return personDetailRepository.findPersonDetailsByScannedBy(scannedBy);
    }


    public  void savePersonDetailCSV() throws FileNotFoundException {
        File file=new File(fileName);
        Scanner inputStream=new Scanner(file);
        inputStream.next();
        while (inputStream.hasNext())
        {
            String data=inputStream.next();
            System.out.println(data);
            String[] values=data.split(",");
            PersonDetails personDetails=new PersonDetails();
            personDetails.setEventName(values[0]);
            personDetails.setScannedDate(values[1]);
            personDetails.setScannedTime(values[2]);
            personDetails.setCompanyName(values[3]);
            personDetails.setJobTitle(values[4]);
            personDetails.setAddress1(values[5]);
            personDetails.setAddress2(values[6]);
            personDetails.setAddress3(values[7]);
            personDetails.setCity(values[8]);
            personDetails.setStateId(values[9]);
            personDetails.setZip(values[10]);
            personDetails.setCountryId(values[11]);
            personDetails.setPhoneNumber(values[12]);
            personDetails.setPhone2Number(values[13]);
            personDetails.setFaxNumber(values[14]);
            personDetails.setQuestion(values[15]);
            personDetails.setResponse(values[16]);
            personDetails.setNote(values[17]);
            personDetails.setCollateral(values[18]);
            personDetails.setStatus(values[19]);
            personDetails.setScannedBy(values[20]);
            savePersonalDetail(personDetails);
        }
    }





//
//    BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
//     while ((row = csvReader.readLine()) != null) {
//        String[] data = row.split(",");
//        // do something with the data
//     }
//     csvReader.close();

}
