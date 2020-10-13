package Target;

import Hierarchy.Person;
import java.util.ArrayList;

import Hierarchy.Student;
import Hierarchy.Worker;
import Input.*;

public class Menu {
    private ArrayList<Person> people; // Лист со всеми объектами

    public Menu(ArrayList<Person> people){ //конструктор меню
        this.people = people;
    }

    public void add(){ // Добавление объекта
        Person person = fill();
        people.add(person); // Добавляем в список
    }

    public void choose(){ // выбор объекта
        int id = search();
        Person personForChanging = fill();
        people.set(id, personForChanging);
    }

    public Person fill(){
        String name = Input.inputString("Имя: ");
        int age = Input.inputInteger("Возраст: ");

        int type = Input.inputInteger("Нажмите [1], если это студент [2], если это рабочий: ");
        if (type == 1){

            float scholarship = Input.inputDouble("Стипендия: ");
            int course = Input.inputInteger("курс: ");
            return new Student(name, age, scholarship, course);

        } else {

            double salary = Input.inputDouble("Зарплата: ");
            return new Worker(name, age, salary);
        }
    }
    public int search(){

        int id = Input.inputInteger("Введите номер человека для поиска: ");
        if (id > people.size())
            id = Input.inputInteger("Такого номера нет.");
        System.out.println("Искомый человек: " + people.get(id-1).info());

        return id-1;
    }
    public void viewing(){
        int j = 0;
        for (Person per:
                people) {
            j++;
            System.out.println(j + ") "+ per.info() + " ");
        }

    }

    public Person findObject(){
        int id = search();
        return people.get(id);
    }

    public double doRequest(){
        Request request = findObject();
        return request.calculateDirectAmount();

    }

}
