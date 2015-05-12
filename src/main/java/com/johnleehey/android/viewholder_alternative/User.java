package com.johnleehey.android.viewholder_alternative;

import java.util.Calendar;

public class User {

    public String name;
    public String jobTitle;
    public Calendar dateOfBirth;

    public User(String name, String jobTitle, Calendar dateOfBirth) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.dateOfBirth = dateOfBirth;
    }
}
