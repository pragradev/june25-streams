package org.example;

import lombok.*;

import java.util.List;

@Builder
@Data
public class Student {
    private String firstName;
    private String lastName;
    private List<String> emails;

    // POJO
    // boiler plate code


    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
