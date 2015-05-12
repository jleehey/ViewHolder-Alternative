package com.johnleehey.android.viewholder_alternative;

import java.util.Calendar;

/**
 * Just some mock user data.
 */
public class MockData {

    private static final int DAYS_IN_YEAR = 365;

    public static final User[] DATA = new User[] {
            new User("John Doe",        "Systems Engineer", getRandomBirthday()),
            new User("Eloise Parker",   "Android Developer",getRandomBirthday()),
            new User("Chris Whittaker", "Android Developer",getRandomBirthday()),
            new User("Eli Paisley",     "CTO",              getRandomBirthday()),
            new User("Craig Donahue",   "Frontend Engineer",getRandomBirthday()),
            new User("Ashley Wright",   "CEO",              getRandomBirthday()),
            new User("Paul Roth",       "Systems Engineer", getRandomBirthday()),
            new User("Doug McElhenney", "Systems Intern",   getRandomBirthday()),
            new User("Dennis Feinstein","iOS Developer",    getRandomBirthday()),
            new User("Carrie Daughtry", "Human Resources",  getRandomBirthday()),
            new User("Ronald Swanson",  "Human Resources",  getRandomBirthday()),
            new User("Jane Fonda",      "Systems Engineer", getRandomBirthday()),
            new User("Robert McIntire", "iOS Developer",    getRandomBirthday()),
            new User("Jesse Bouchet",   "Data Analyst",     getRandomBirthday())
    };

    private static Calendar getRandomBirthday() {

        // Lets make everyone a kinda random age from 20-30, weighted closer to 25
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -25);
        calendar.add(Calendar.DAY_OF_YEAR, (int) (Math.random() * 5 * DAYS_IN_YEAR));
        calendar.add(Calendar.DAY_OF_YEAR, -5 * DAYS_IN_YEAR);

        return calendar;
    }

}
