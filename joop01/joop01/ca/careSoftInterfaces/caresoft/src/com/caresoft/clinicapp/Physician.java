package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
    private ArrayList<String> patientNotes;
	
	// TO DO: Constructor that takes an IDcopy

    public Physician(Integer id) {
        super(id);
    }


	
	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
            report += String.format("Reported By ID: %s\n", this.id);
            report += String.format("Patient Name: %s\n", patientName);
            report += String.format("Notes: %s \n", notes);
            this.patientNotes.add(report);
        }
        
    // TO DO: Implement HIPAACompliantUser!
    @Override
    public boolean assignPin(int pin) {
        this.setPin(pin);
        return Integer.toString(this.getPin()).length() == 4;
        // throw new UnsupportedOperationException("Unimplemented method 'assignPin'");
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        return confirmedAuthID == this.getId();
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'accessAuthorized'");
    }
	
    // TO DO: Setters & Getters
}
