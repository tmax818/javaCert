package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<>();
    
    // TO DO: Implement a constructor that takes an ID and a role


    public AdminUser(Integer employeeID, String role) {
        this.employeeID = employeeID;
        this.role = role;
    }
    

    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    @Override
    public ArrayList<String> reportSecurityIncidents() {
        return this.securityIncidents;
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'reportSecurityIncidents'");
    }
    @Override
    public boolean assignPin(int pin) {
        return Integer.toString(pin).length() >= 6;
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'assignPin'");
    }
    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        boolean test = confirmedAuthID == this.employeeID;
        if(!test) this.authIncident();
        return test;
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'accessAuthorized'");
    }
    
    // TO DO: Setters & Getters
}
