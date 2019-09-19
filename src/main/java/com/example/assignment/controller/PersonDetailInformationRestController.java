package com.example.assignment.controller;

import com.example.assignment.model.PersonDetails;
import com.example.assignment.service.PersonDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonDetailInformationRestController {

   @Autowired
   private PersonDetailService personGeneralService;

   @GetMapping("/getListOfPersonFromUSA")
   public List<PersonDetails> personGeneralInformationList()
   {
      return  personGeneralService.personGeneralInformationList();
   }

   @GetMapping("/getListOfPersonFromStatus/{status}")
   public List<PersonDetails> personDetailsByStatus(@PathVariable  String status)
   {
     return personGeneralService.findPersonDetailsByStatus(status);
   }

   @GetMapping(value="/getListOfPersonalDataFromScanned/{scannedBy}")
   public List<PersonDetails> getPersonDetailsByScannedBy(@PathVariable String scannedBy)
   {
       return personGeneralService.findPersonDetailsByScannedBy(scannedBy);
   }


}
