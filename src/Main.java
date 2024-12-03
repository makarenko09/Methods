import java.time.LocalDate;

public class Main {
    public static void task1(int year) {
        //from task 3 lesson 2 Operators
        try {
            if (year < 1548) {
                throw new IllegalArgumentException("Год не является високосным");
            }
            if (year % 4 == 0 || year % 400 == 0) {
                System.out.println("Год " + year + " является високосным");
            } else {
                System.out.println("Год " + year + " не является високосным");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Год " + year + " не является високосным");
        }

    }

    public static void task2(int iosType, int currentYear) {
        short clientDeviceYear = 2015;
        String warning = clientDeviceYear < currentYear ? "облегченную" : "обычную";
        //task 2 lesson 2 Operators
        if (iosType == 1) {
            System.out.println("Установите " + warning + " версию приложения для iOS по ссылке");
        } else if (iosType != 0 && iosType == 1) {
            System.out.println("Установите " + warning + " версию приложения для Android по ссылке");
        } else {
            System.out.println("Неверное значение");
        }
    }

    public static int task3(int deliveryDistance) {//task 4 lesson 2
        short radiusMax = 100;
        int days = 0;
        try {
            if (deliveryDistance <= 20) {
                days = 1;
            } else if (deliveryDistance <= 60) {
                days = 2;
            } else {
                days = 3;
            }
        } catch (
                IllegalArgumentException e) {
            if (deliveryDistance > radiusMax) {
                System.out.println("Свыше 100 км доставки нет");
            } else {
                System.out.println("Некорректное значение");
            }
        }
        return days;
    }

    public static void main(String[] args) {
        System.out.println("task 1");
        task1(2021);

        // Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит результат в консоль.
        //
        //Эту проверку вы уже реализовывали в задании по условным операторам.

        System.out.println("task 2");

        //        Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
        //
        //Если устройство старше текущего года, предложите ему установить облегченную версию.
        //
        //Текущий год можно получить таким способом:
        //Или самим задать значение вручную — ввести в переменную числовое значение.

        task2(1, LocalDate.now().getYear());
        //
        //В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную) и для какой ОС (Android или iOS) установить пользователю.

        System.out.println("task3");
        //Ваша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.
        System.out.print("\nИтоговое количество дней доставки :" + (task3(95)));

    }
}
