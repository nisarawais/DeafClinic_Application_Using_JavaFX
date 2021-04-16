package models;

import java.util.Arrays;
import java.util.List;


public class HearingDevices {
    private String type, company, model, version, powerLevel, hearingLevelCompatible;

    public HearingDevices(String type, String company, String model, String version, String powerLevel, String hearingLevelCompatible) {
        setType(type);
        setCompany(company);
        setModel(model);
        setVersion(version);
        setPowerLevel(powerLevel);
        setHearingLevelCompatible(hearingLevelCompatible);
    }
    public String getType() {
        return type;
    }

    public static List<String> getValidType()
    {
        return Arrays.asList("HEARING AID", "COCHLEAR IMPLANT", "ELECTRO-ACOUSTIC IMPLANT", "BONE CONDUCTION AID");
    }
    public void setType(String type) {
        type = type.toUpperCase();
        if(getValidType().contains(type))
            this.type = type;
        else
            throw new IllegalArgumentException(type + " was entered, valid types are: " + getValidType());
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if(company.length() > 2)
            this.company = company;
        else
            throw new IllegalArgumentException("You need to type more than two characters long.");
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.length() > 2)
            this.model = model;
        else
            throw new IllegalArgumentException("You need to type more than two characters long.");
    }


    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        if(version.length() >= 1)
            this.version = version;
        else
            throw new IllegalArgumentException("You need to type at least 1 character long.");
    }

    public String getPowerLevel() {
        return powerLevel;
    }

    public static List<String> getValidPowerLevel()
    {
        return Arrays.asList("S", "M", "P", "U", "");
    }
    public void setPowerLevel(String powerLevel) {
        powerLevel = powerLevel.toUpperCase();
        if(getValidPowerLevel().contains(powerLevel))
            this.powerLevel = powerLevel;
        else
            throw new IllegalArgumentException(powerLevel + " was entered, valid types are: " + getValidPowerLevel());
    }

    public String getHearingLevelCompatible() {
        return hearingLevelCompatible;
    }

    public static List<String> getValidHearingLevelCompatible()
    {
        return Arrays.asList("mild", "moderate", "severe", "profound", "mild-moderate", "mild-severe", "mild-profound", "moderate-severe", "moderate-profound", "severe-profound");
    }
    public void setHearingLevelCompatible(String hearingLevelCompatible) {
        hearingLevelCompatible = hearingLevelCompatible.toLowerCase();
        if(getValidHearingLevelCompatible().contains(hearingLevelCompatible))
            this.hearingLevelCompatible = hearingLevelCompatible;
        else
            throw new IllegalArgumentException(hearingLevelCompatible + " was entered, valid types are: " + getValidHearingLevelCompatible());
    }

    public String toString() { return String.format("Type: %s; Name: %s %s %s %s; Hearing Level Compatible: %s", type,company,model,version,powerLevel,hearingLevelCompatible);
    }
}