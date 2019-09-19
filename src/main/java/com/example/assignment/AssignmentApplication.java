package com.example.assignment;

import com.example.assignment.service.PersonDetailService;
import com.example.assignment.service.PersonGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssignmentApplication implements CommandLineRunner {

    @Autowired
    private PersonDetailService personDetailService;

    @Autowired
    private PersonGeneralService personGeneralService;

    public static void main(String[] args)
    {

        SpringApplication.run(AssignmentApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        personDetailService.savePersonDetailCSV();
        personGeneralService.savePersonGeneralCSV();;
    }
}
