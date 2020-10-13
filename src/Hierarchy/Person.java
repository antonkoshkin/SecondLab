package Hierarchy;

import Target.Request;

public abstract class Person implements Request {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String info(){
        return name + " возраст: " + age + " ";
    }


    @Override
    public abstract double calculateDirectAmount();
}
