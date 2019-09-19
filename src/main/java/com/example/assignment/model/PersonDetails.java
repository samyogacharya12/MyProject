package com.example.assignment.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
@Entity(name="person_details")
@Table(name="person_details")
public class PersonDetails implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="person_detail_id")
    private Integer personDetailId;

    @NotNull
    @Size(max=50)
    @Column(name="event_name")
    private String eventName;

    @Temporal(TemporalType.DATE)
    @Column(name="scanned_date")
    private Date scannedDate;


    @Column(name="scanned_time")
    private Time scannedTime;


    @NotNull
    @Size(max=50)
    @Column(name="company_name")
    private String companyName;

    @Column(name="job_title")
    private String jobTitle;

    @Column(name="address1")
    private String address1;

    @Column(name="address2")
    private String address2;

    @Column(name="address3")
    private String address3;

    @Column(name="city")
    private String city;

    @Column(name="state_id")
    private String stateId;

    @Column(name="zip")
    private String zip;

    @Column(name="country_id")
    private String countryId;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="phone2_number")
    private String phone2Number;

    @Column(name="fax_number")
    private String faxNumber;

    @Column(name="question")
    private String question;

    @Column(name="response")
    private String response;

    @Column(name="note")
    private String note;

    @Column(name="collateral")
    private String collateral;

    @Column(name="status")
    private String status;

    @Column(name="scanned_by")
    private String scannedBy;

//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinTable(name="person_mapping", joinColumns = @JoinColumn(name="person_general_id"), inverseJoinColumns = @JoinColumn(name="person_detail_id"))
//    private PersonGeneralInformation personGeneralInformation;
//
//    public PersonGeneralInformation getPersonGeneralInformation() {
//        return personGeneralInformation;
//    }
//
//    public void setPersonGeneralInformation(PersonGeneralInformation personGeneralInformation) {
//        this.personGeneralInformation = personGeneralInformation;
//    }

    public Integer getPersonDetailId() {
        return personDetailId;
    }

    public void setPersonDetailId(Integer personDetailId) {
        this.personDetailId = personDetailId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getScannedBy() {
        return scannedBy;
    }

    public void setScannedBy(String scannedBy) {
        this.scannedBy = scannedBy;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getScannedDate() {
        return scannedDate;
    }

    public void setScannedDate(Date scannedDate) {
        this.scannedDate = scannedDate;
    }

    public Time getScannedTime() {
        return scannedTime;
    }

    public void setScannedTime(Time scannedTime) {
        this.scannedTime = scannedTime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhone2Number() {
        return phone2Number;
    }

    public void setPhone2Number(String phone2Number) {
        this.phone2Number = phone2Number;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCollateral() {
        return collateral;
    }

    public void setCollateral(String collateral) {
        this.collateral = collateral;
    }
}
