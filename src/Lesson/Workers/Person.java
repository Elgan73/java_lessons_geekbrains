package Lesson.Workers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static javafx.scene.input.KeyCode.T;

public class Person {

    private int id;
    private String name;
    private String surname;
    private int age;
    private String position;
    private int salary;
    private String phone;
    private String email;


    public Person(int id, String name, String surname, int age, String position, int salary, String phone, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public int getId() { return id; }

    public void showPersonsListById(int id) {

    }

    @Override
    public String toString() {
        return "Person{" +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", surname= '" + surname + '\'' +
                ", age= " + age +
                ", position= '" + position + '\'' +
                ", salary= " + salary +
                ", phone= '" + phone + '\'' +
                ", email= '" + email + '\'' +
                '}';
    }

//    public void personInfo() {
//        System.out.println("id: " + id + "\n" + "Имя: " + name + "Фамилия: " + surname + "\n"
//                + "Возраст: " + age + "\n" + "Должность: " + position + "\n" + "Зарплата: " + salary + "\n" + "E-mail: " + email);
//    }


}
