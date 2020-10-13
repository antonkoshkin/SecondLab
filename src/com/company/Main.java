package com.company;

import Hierarchy.Student;
import Hierarchy.Worker;
import Hierarchy.Person;
import Target.Menu;
import Input.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Student( "Антон",20, 16000, 3));
        people.add(new Worker( "Валера",20, 16000));


        boolean flag = false;
        while (!flag) {
            System.out.println("\nВыберите задание: \n[1] - Добавить\n" +
                    "[2] - Редактировать\n[3] - Просмотр\n" +
                    "[4] - Запрос\n[5] - Выход");

            Menu menu = new Menu(people);

            switch (Input.inputInteger("")) {
                case 1:
                    menu.add();
                    break;
                case 2:
                    menu.choose();
                    break;
                case 3:
                    menu.viewing();
                    break;
                case 4:
                    System.out.println("Получаемая сумма = " + menu.doRequest());
                    break;
                case 5:
                    System.out.println("[Выход]");
                    flag = true;
                    break;
                default:
                    System.out.println("Ошибка. Пвторите ввод.");
                    break;
            }

        }
    }
}
