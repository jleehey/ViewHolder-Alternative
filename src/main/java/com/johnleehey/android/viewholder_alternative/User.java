package com.johnleehey.android.viewholder_alternative;

import java.util.Calendar;

public class User {

    public String name;
    public String jobPosition;
    public Calendar dateOfBirth;

    public User(String name, String jobPosition, Calendar dateOfBirth) {
        this.name = name;
        this.jobPosition = jobPosition;
        this.dateOfBirth = dateOfBirth;
    }
}
