package week05;

public class Lecturer13 {
    String id;
    String name;
    boolean gender; //(true=male, false=female)
    int age;

    public Lecturer13(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void print() {
        String genderStr = gender ? "Male" : "Female";
        System.out.println("ID: " + id + ", Name: " + name + ", Gender: " + genderStr + ", Age: " + age);
    }
}