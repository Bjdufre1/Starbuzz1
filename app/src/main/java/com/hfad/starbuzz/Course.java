package com.hfad.starbuzz;

/**
 * Created by davidg on 30/04/2017.
 */

public class Course {
    private String prefix; private String courseNumber; private String description;

    //Each Drink has a name, description, and an image resource
    private Course(String prefix, String courseNumber, String description) {
        this.prefix = prefix;
        this.courseNumber = courseNumber;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public String toString() {
        return this.prefix;
    }
}
