package Hierarchy;

public class Worker extends Person {

    private double salary;

    public Worker(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
    public String info () {
        return super.info() + "Зарплата: " + salary;
    }

    @Override
    public double calculateDirectAmount(){
        return salary;
    }
}
