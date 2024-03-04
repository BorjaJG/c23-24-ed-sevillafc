package org.example.doctor.domain;

import org.example.person.domain.Person;

public class Doctor extends Person {


    public final String Specialty;

    public Doctor(String personID, String name, String surname, String dateOfBirth, String specialty) {
        super(personID, name, surname, dateOfBirth);
        Specialty = specialty;
    }


    public String getSpecialty() {
        return Specialty;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "Specialty='" + Specialty + '\'' +
                ", personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
