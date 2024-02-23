package org.bootcamp.Day2.Marathon;

public abstract class Marathon {

    protected String name;
    protected int age;
    protected String gender;
    protected long contactNumber;

    public Marathon(String name, int age, String gender, long contactNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Marathon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", contactNumber=" + contactNumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }
}
