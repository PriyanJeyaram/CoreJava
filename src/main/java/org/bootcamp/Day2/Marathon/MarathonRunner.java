package org.bootcamp.Day2.Marathon;

public class MarathonRunner extends Marathon {
    public MarathonRunner(String name, int age, String gender, long contactNumber) {
        super(name, age, gender, contactNumber);
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 100) {
            throw new InvalidAgeException("Age must be between 18 and 100");
        }
    }

    public static void validateGender(String gender) throws IllegalArgumentException {
        if (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female") && !gender.equalsIgnoreCase("others")) {
            throw new IllegalArgumentException("Gender must be male/female/others");
        }
    }

}
