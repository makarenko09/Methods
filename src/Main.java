import java.time.LocalDate;

public class Main {
    public static void task1(int year) {
        //from task 3 lesson 2 Operators

//        1. **Задача 1:**
//   - Ошибка в логике проверки високосного года. Год считается високосным, если делится на 4, но не на 100, или делится на 400. Вероятно, ты перепутал условия. В следующий раз внимательно перечитывай условия задачи и проверяй свою логику.

        try {
            boolean yearExceptions = year % 100 == 0;
            if (year < 1548) {
                throw new IllegalArgumentException("Год не является високосным");
            }
            if (year % 400 == 0 && (!yearExceptions)) {
                System.out.println("Год " + year + " является високосным");
            } else if (year % 4 == 0) {
                System.out.println("Год " + year + " является високосным");
            } else {
                System.out.println("Год " + year + " не является високосным");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Год " + year + " не является високосным");
        }

    }

    public static void task2(int iosType, int currentYear) {
        //
//2. **Задача 2:**
//   - Ошибка в условии проверки операционной системы. Условие 'else if (iosType != 0 && iosType == 1)' всегда ложно. Это может быть из-за невнимательности. Попробуй использовать switch-case для более ясной логики.

        short clientDeviceYear = 2015;
        String warning = clientDeviceYear < currentYear ? "облегченную" : "обычную";
        //task 2 lesson 2 Operators
        if (iosType == 1) {
            System.out.println("Установите " + warning + " версию приложения для iOS по ссылке");
        } else if (iosType != 1 && iosType == 0) {
            System.out.println("Установите " + warning + " версию приложения для Android по ссылке");
        } else {
            System.out.println("Неверное значение");
        }
    }

    public static void task2_1(int iosType, int currentYear) {
//Гораздо удобнее использовать блоки case, если будут много оперативных систем. мультиплатформенность java*
        short clientDeviceYear = 2015;
        String warning = clientDeviceYear < currentYear ? "облегченную" : "обычную";
        switch (iosType) {
            case 1:
                System.out.println("Установите " + warning + " версию приложения для iOS по ссылке");
                break;
            case 0:
                System.out.println("Установите " + warning + " версию приложения для Android по ссылке");
                break;
        }
    }

    public static int task3(int deliveryDistance) {//task 4 lesson 2
        //
//3. **Общие замечания:**
//   - Избыточные блоки try-catch. Они не нужны для данной логики, лучше использовать простые условные операторы.
//   - Избегай двойной вложенности в коде, это усложняет его чтение.
        short radiusMax = 100;
        int days = 0;
        if (deliveryDistance > radiusMax) {
            System.out.println("Свыше 100 км доставки нет");
        }
        if (deliveryDistance <= 20) {
                days = 1;
            } else if (deliveryDistance <= 60) {
                days = 2;
            } else {
                days = 3;
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
        task2(0, LocalDate.now().getYear());
        //
        //В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную) и для какой ОС (Android или iOS) установить пользователю.
        System.out.println("task2, variant2");
        task2_1(1, 2014);
        System.out.println("task3");
        //Ваша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.
        System.out.print("Итоговое количество дней доставки :" + (task3(95)));
    }
}
