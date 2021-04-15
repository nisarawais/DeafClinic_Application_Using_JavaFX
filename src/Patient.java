package models;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Patient {
    private String firstName, lastName, streetAddress, city, state, leftHearingLevel, rightHearingLevel;
    private int zipCode;
    private LocalDate birthday;
    private ArrayList<HearingDevices> leftHearingDevice;
    private ArrayList<HearingDevices> rightHearingDevice;



    public Patient(String firstName, String lastName, String streetAddress, String city, String state, int zipCode, String leftHearingLevel, String rightHearingLevel, LocalDate birthday, ArrayList<String> leftHearingDevice, ArrayList<String> rightHearingDevice ) {
        setFirstName(firstName);
        setLastName(lastName);
        setStreetAddress(streetAddress);
        setCity(city);
        setState(state);
        setZipCode(zipCode);
        setLeftHearingLevel(leftHearingLevel);
        setRightHearingLevel(rightHearingLevel);
        setBirthday(birthday);

    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.matches("[A-Za-z]*"))
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("You typed " +firstName+ " is not valid. Please type in letters only.");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.matches("[A-Za-z]*"))
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("You typed " +lastName+ " is not valid. Please type in letters only.");
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        if(streetAddress.length() > 6)
            this.streetAddress = streetAddress;
        else
            throw new IllegalArgumentException("You need to type more than 6 characters long");

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(city.length() > 2)
            this.city = city;
        else
            throw new IllegalArgumentException("You need to type more than 2 characters long");
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if(state.length() > 2)
            this.state = state;
        else
            throw new IllegalArgumentException("You need to type more than 2 characters long");
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        if(zipCode > 10000 && zipCode< 99999)
            this.zipCode = zipCode;
        else
            throw new IllegalArgumentException(zipCode +" is outside of the range between 10000 and 99999. Please try again.");
    }
    public static List<String> getValidHearingLevel()
    {
        return Arrays.asList("mild", "moderate", "severe", "profound", "mild-moderate", "mild-severe", "mild-profound", "moderate-severe", "moderate-profound", "severe-profound");
    }

    public String getLeftHearingLevel() {
        return leftHearingLevel;
    }

    public void setLeftHearingLevel(String leftHearingLevel) {
        leftHearingLevel = leftHearingLevel.toLowerCase();
        if(getValidHearingLevel().contains(leftHearingLevel))
            this.leftHearingLevel = leftHearingLevel;
        else
            throw new IllegalArgumentException(leftHearingLevel + " was entered, valid types are: " + getValidHearingLevel());
    }

    public String getRightHearingLevel() {
        return rightHearingLevel;
    }

    public void setRightHearingLevel(String rightHearingLevel) {
        rightHearingLevel = rightHearingLevel.toLowerCase();
        if(getValidHearingLevel().contains(rightHearingLevel))
            this.rightHearingLevel = rightHearingLevel;
        else
            throw new IllegalArgumentException(rightHearingLevel + " was entered, valid types are: " + getValidHearingLevel());
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        if (birthday.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("The birthday cannot be in the future");
        this.birthday = birthday;
    }


    public void addLeftHearingDevice (HearingDevices lItem){ leftHearingDevice.add(lItem);}
    public void addRightHearingDevice (HearingDevices rItem){ rightHearingDevice.add(rItem);}

    /**
     *
     * @return a patient's age
     */
    public int getAge() {return Period.between(birthday, LocalDate.now()).getYears();}

    public String toString()
    {
        return String.format("%s %s age: %d years", firstName, lastName, getAge());
    }
}