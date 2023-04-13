package lesson6;

import phoneBook.E1;
import phoneBook.PhoneDB;
import task.Task1;
import vetProgram.Cat;
import vetProgram.Owner;

import static task.Task1.*;

public class Main {
    public static void main(String[] args) {
//        Integer[] arr = new Integer[1000];
//        arr = fillArray(arr);
//        printArr(arr, 20);
//        var integerSet = fillSetInteger(arr);
//        System.out.println("Set: " + integerSet);
//        double percent = integerSet.size() * 100/ arr.length;
//        System.out.println("Percentage: " + percent);
//        System.arraycopy();
//        Owner owner = new Owner("Василий Петрович","1235555");
//        Cat cat = new Cat("Барсик", 2, "Сиамский", owner);
//        cat.sleep(true);
//        Cat cat1 = new Cat("Барсик", 2, "Сиамский", owner);
//        System.out.println(cat);
//        System.out.println(cat.equals(cat1));
        E1 phoneDB = new E1();
        phoneDB.NewNumber((new PhoneDB("Иван", "Иванов","1235488")));
        System.out.println(phoneDB.phoneBook);
    }
}
