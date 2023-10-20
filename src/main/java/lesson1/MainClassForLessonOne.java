package lesson1;

import java.util.Scanner;
import java.util.Date;

public class MainClassForLessonOne {
    public static void main(String[] args) {
        //task001();
        //task002();
        //task003();
    }

    //    В консоли запросить имя пользователя. В зависимости от
//    текущего времени, вывести приветствие вида
//  "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//  "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//  "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//  "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    private static void task002() {
        Date d = new Date();
        int hour = d.getHours();
        int minute = d.getMinutes();
        String greeting;
        if (hour >= 5 && hour < 12) {
            greeting = "Good morning, ";
        } else if (hour >= 12 && hour < 18) {
            greeting = "Good day, ";
        } else if (hour >= 18 && hour < 23) {
            greeting = "Good evening, ";
        } else {
            greeting = "Good night, ";
        }
        System.out.println("Please, enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(greeting + name);
    }

    //    Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
    //    максимальное количество подряд идущих 1.
    private static void task003() {
        int[] array = {1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1};
        int result = 0;
        int max_value = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                result++;
            } else if (array[i] == 0) {
                if (result > max_value) {
                    max_value = result;
                }
                result = 0;
            }
        }
        System.out.println(max_value);
    }

    private static void task001() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your name: ");
        String name = scanner.next();
        System.out.println("Hello, " + name);
    }
}
