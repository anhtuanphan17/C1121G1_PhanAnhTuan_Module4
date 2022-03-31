package com.medical_declaration.model;

public class MedicalDeclaration {
    private String name;
    private String yearOfBirth;
    private String gender;
    private String nation;
    private String idNumber;
    private String vehicle;
    private String vehicleCode;
    private String chairNumber;
    private String departureDay;
    private String dateOfDeparture;
    private String dateOfComeback;
    private String placeArrivedIn14Days;
    private String province;
    private String district;
    private String ward;
    private String livingAddress;
    private String phoneNumber;
    private String email;


    public MedicalDeclaration(String name, String yearOfBirth, String gender, String nation, String idNumber, String vehicle, String vehicleCode, String chairNumber, String departureDay, String dateOfDeparture, String dateOfComeback, String placeArrivedIn14Days, String province, String district, String ward, String livingAddress, String phoneNumber, String email) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.nation = nation;
        this.idNumber = idNumber;
        this.vehicle = vehicle;
        this.vehicleCode = vehicleCode;
        this.chairNumber = chairNumber;
        this.departureDay = departureDay;
        this.dateOfDeparture = dateOfDeparture;
        this.dateOfComeback = dateOfComeback;
        this.placeArrivedIn14Days = placeArrivedIn14Days;
        this.province = province;
        this.district = district;
        this.ward = ward;
        this.livingAddress = livingAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public MedicalDeclaration() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicleCode() {
        return vehicleCode;
    }

    public void setVehicleCode(String vehicleCode) {
        this.vehicleCode = vehicleCode;
    }

    public String getChairNumber() {
        return chairNumber;
    }

    public void setChairNumber(String chairNumber) {
        this.chairNumber = chairNumber;
    }

    public String getDepartureDay() {
        return departureDay;
    }

    public void setDepartureDay(String departureDay) {
        this.departureDay = departureDay;
    }

    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(String dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public String getDateOfComeback() {
        return dateOfComeback;
    }

    public void setDateOfComeback(String dateOfComeback) {
        this.dateOfComeback = dateOfComeback;
    }

    public String getPlaceArrivedIn14Days() {
        return placeArrivedIn14Days;
    }

    public void setPlaceArrivedIn14Days(String placeArrivedIn14Days) {
        this.placeArrivedIn14Days = placeArrivedIn14Days;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getLivingAddress() {
        return livingAddress;
    }

    public void setLivingAddress(String livingAddress) {
        this.livingAddress = livingAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
