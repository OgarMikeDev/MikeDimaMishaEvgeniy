
package main;

import java.util.*;

public class Student implements Comparable<Student> {
    private static int count = 0;
    private String name; //Mike
    private int age; //23
    private String email; //mura.m.v@email.ru
    private long phoneNumber; //89676400941
    private static ArrayList<Student> setStudents = new ArrayList<>();

    public Student(String name, int age, long phoneNumber, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        setStudents.add(this);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && phoneNumber == student.phoneNumber && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email, phoneNumber);
    }

    @Override
    public int compareTo(Student o) {
        return getName().compareTo(o.getName());
    }

    public static void printInformationAboutStudents() {
        for (Student currentStudent : setStudents) {
            System.out.println(currentStudent);
        }
    }

    public static void removeStudent(long phoneNumber) {
        Iterator<Student> studentIterator = setStudents.iterator();

        while (studentIterator.hasNext()){
            Student student = studentIterator.next();
            if(student.getPhoneNumber() == phoneNumber){
                studentIterator.remove();
            }
        }
    }

    public static int getCountStudents() {
        //Misha >
        return 0;
    }

    @Override
    public String toString() {
        return "Name \"" + getName() + "\"," +
                "\nAge \"" + getAge() + "\"," +
                "\nEmAil \"" + getEmail() + "\"," +
                "\nPhone number " + getPhoneNumber() + ".\n";
    }
}