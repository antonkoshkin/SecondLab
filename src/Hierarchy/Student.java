package Hierarchy;

public class Student extends Person {
    private double scholarship;
    private int course;

    public Student(String name, int age, double scholarship, int course) {
        super(name, age);
        this.scholarship = scholarship;
        this.course = course;
    }

    public String info () {
        return super.info() + "Стипендия: " + scholarship + "курс: " + course + " ";
    }


    @Override
    public double calculateDirectAmount(){
        return scholarship;
    }
}
