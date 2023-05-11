public class Main {
    public static void main(String[] args) {
// задача 1
        int age = 50;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age
                    + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
// задача 2
        int temperature = 10;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        }
// задача 3
        int speed = 51;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
// задача 4
        age = 10;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать.");
        }
        if (age > 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if (age > 24 && age <= 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
        if (age > 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему можно отдохнуть");
        }
// задача 5
        age = 3;
        if (age < 5) {
            System.out.println("Если возраст ребенка  равен " + age + ", то он не может кататься на аттракционе.");
        }
        if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка  равен " + age + ", то он может кататься только в сопровождении взрослого.");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка  равен " + age + ", то он может кататься без сопровождения взрослого.");
        }
// задача 6
//*
        int numberOfPassengers = 110;
        int wagonCapacity = 102;
        int seatPlace = 60;
        if (numberOfPassengers < seatPlace) {
            System.out.println("В вагоне " + (seatPlace - numberOfPassengers) + " свободных сидячих мест");
        } else {
            if (numberOfPassengers >= seatPlace && numberOfPassengers < wagonCapacity) {
                System.out.println("В вагоне " + (wagonCapacity - numberOfPassengers) + " свободных стоячих мест");
            } else {
                System.out.println("В вагоне нет мест");
                //*/
            }
        }

// задача 7
        int one;
        int two;
        int three;



    }



}