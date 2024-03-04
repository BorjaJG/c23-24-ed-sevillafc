package org.example.player.domain;

import org.example.person.domain.Person;

public class Player extends Person {

    public final String Position;

    public Player(String personID, String name, String surname, String dateOfBirth, String position) {
        super(personID, name, surname, dateOfBirth);
        Position = position;
    }

    public String getPosition() {
        return Position;
    }

    @Override
    public String toString() {
        return "Player{" +
                ", personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                "Position='" + Position + '\'' +
                '}';
    }
}
