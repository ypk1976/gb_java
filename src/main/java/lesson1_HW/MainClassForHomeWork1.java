package lesson1_HW;

//Задача 3
class Calculator {
    public int calculate(char op, int a, int b) {
        // Введите свое решение ниже
        int result;
        if( op == '+' ) {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            result = a / b;
        } else {
            System.out.println("Некорректный оператор: " + op);
            return 0;
        }
        return result;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class MainClassForHomeWork1 {
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '-';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}

//Задача 2
//class Answer {
//    public void printPrimeNums(){
//        // Напишите свое решение ниже
//        int max = 1000;
//        for (int i = 1; i <= max; i++) {
//            if (isPrime(i)) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    public static boolean isPrime(int num) {
//        if (num < 1) {
//            return false;
//        }
//        // Проверяем, делится ли число нацело на какое-либо другое число, кроме 1 и самого себя
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
//
//
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class MainClassForHomeWork1 {
//    public static void main(String[] args) {
//
//        Answer ans = new Answer();
//        ans.printPrimeNums();
//    }
//}

//Задача 1
//class Answer {
//    public int countNTriangle(int n) {
//        // Введите свое решение ниже
//        int result = (n * (n + 1))/2;
//        return result;
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class MainClassForHomeWork1 {
//    public static void main(String[] args) {
//        int n = 0;
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            n = 5;
//        } else {
//            n = Integer.parseInt(args[0]);
//        }
//
//        // Вывод результата на экран
//        Answer ans = new Answer();
//        int itresume_res = ans.countNTriangle(n);
//        System.out.println(itresume_res);
//    }
//}