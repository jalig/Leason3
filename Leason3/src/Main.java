public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Задание №1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Ваш возраст " + age + " лет, вы проходите по критериям");
        } else {
            System.out.println("Сожалеем, но вы не подходите по возрасту");
        }

        //task2
        System.out.println("Задание №2");
        int temperature = 7;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов. На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов. Сегодня тепло, можно идти без шапки");
        }

        //task3
        System.out.println("Задание №3");
        int speed = 60;
        if (speed <= 60) {
            System.out.println("Ваша скорость " + speed + " км/ч. Привышения скорости нет, продолжайте поездку");
        } else {
            System.out.println("Ваша скорость " + speed + " км/ч. Скорость превышена, придется заплатить штраф");
        }

        //task4
        System.out.println("Задание №4");
        int yourAge = 25;
        if (yourAge >= 2 && yourAge <= 6) {
            System.out.println("Ваш возраст " + yourAge + " лет. Вам нужно посещать детский сад");
        }
        if (yourAge >= 7 && yourAge < 18) {
            System.out.println("Ваш возраст " + yourAge + " лет. Вам нужно ходить в школу");
        }
        if (yourAge >= 18 && yourAge <= 24) {
            System.out.println("Ваш возраст " + yourAge + " лет. Вам нужно ходить университет");
        }
        if (yourAge > 24) {
            System.out.println("Ваш возраст " + yourAge + " лет. Вам пора на работу");
        } else {
            System.out.println("В таком возрасте нельзя сделать осознаный выбор");
        }

        //task5
        System.out.println("Задание №5");
        int childAge = 15;
        if (childAge < 5) {
            System.out.println("Вам " + childAge + " года, к сожалению на атракционах раршено кататься с 5-ти лет");
        }
        if (childAge >= 5 && childAge < 14) {
            System.out.println("Вам " + childAge + " лет, к сожалению вы не можете кататься на атракционах без сопровождения взрослого");
        } else {
            System.out.println("Вам " + childAge + " лет. Вы можете кататься на атракционах без сопровождения взрослых!");
        }
        //task6
        System.out.println("Задание №6");
        int seatingPassengers = 16;
        int standingPassengers = 12;

        int capacityWagon = 102;
        int seatingPlaces = 60;
        int standingPlaces = capacityWagon - seatingPlaces;

        int seatingReminder = seatingPlaces - seatingPassengers;
        int standingReminder = standingPlaces - seatingPassengers;

        if (seatingReminder == 0 && standingReminder == 0) {
            System.out.println("К сожалению вагоне мест нет");
        } else {
            if (seatingReminder > 0) {
                System.out.println("В вагоне " + (seatingPlaces - seatingPassengers) + " сидящих мест");
            }
            if (seatingReminder > 0) {
                System.out.println("В вагоне " + (standingPlaces - standingPassengers) + " стоячих мест");
            }

        }

        //task7
        System.out.println("Задание №7");
        int one = 7;
        int two = 6;
        int three = 30;
        if (one > two && one > three) {
            System.out.println("Число " + one + " большее в данном уровнении");
        }
        if (two > one && two > three) {
            System.out.println("Число " + two + " большее в данном уровнении");

        }
        if (three > one && three > two) {
            System.out.println("Число " + three + " большее в данном уровнении");
        } else {
            System.out.println("Числа ровны");
        }
    }
}