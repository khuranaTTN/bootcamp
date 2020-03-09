package com.ttn.bootcamp.Exercises;

public class Student {
    int id;
    String name;
    float marks;
    int age;
    public Student(String name,int id, float marks, int age){
        this.name=name;
        this.id=id;
        this.age=age;
        this.marks=marks;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public  String toString()
    {
        return ("Student  " + ("Id : " + id + "Name : " + name + "Age : " + age + " Marks : " + marks));
    }
}
