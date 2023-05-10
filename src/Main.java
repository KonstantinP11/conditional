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
        int speed =51;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }
}