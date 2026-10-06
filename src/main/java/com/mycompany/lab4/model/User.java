/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4.model;

/**
 *
 * @author syedahmed
 */
public class User {
    private String firstName;
    private String lastName;
    private String gender;
    private long age;
    private String phoneNumber;
    private String email;
    private String continent;
    private String experience;
    private String hobbies;
    private String photoUrl;
    private long dob;

    public User(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    
    
    public User(String firstName, String lastName, long age, String gender, String phoneNumber, String email, String continent, String experience, String hobbies, String photoUrl, long dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.continent = continent;
        this.experience = experience;
        this.hobbies = hobbies;
        this.photoUrl = photoUrl;
        this.dob = dob;
    }

    
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public long getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getContinent() {
        return continent;
    }

    public String getExperience() {
        return experience;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public long getDob() {
        return dob;
    }

    public void setDob(long dob) {
        this.dob = dob;
    }
    
    

    @Override
    public String toString() {
        String[] fileName = photoUrl.split("/");

        return "First Name=" + firstName + "\nLast Name=" + lastName + "\nGender=" + gender 
                + "\nAge=" + age + "\nPhone Number=" + phoneNumber + "\nEmail=" + email 
                + "\nContinent=" + continent + "\nExperience=" + experience + "\nHobbies=" + hobbies
                + "\nPhoto=" + fileName[fileName.length-1]
                + "\n Date of Birth= "+dob;
    }
    
    
    
    
}
