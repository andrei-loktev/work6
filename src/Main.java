public class Main {
    public static void main(String[] args) {
        //задание 1
        System.out.println("задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("обратиться за помощью");
        }
        //задание 2
        System.out.println("задание 2");
        int clientDeviceYear = 2013;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
        //задание 3
        System.out.println("задание 3");
        int year = 1987;
        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
        //задание 4
        System.out.println("задание 4");
        int deliveryDistance = 101;
        if (deliveryDistance <= 20) {
            System.out.println("доставка займёт 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("доставка займёт 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("доставка займёт 3 дня");
        } else {
            System.out.println("доставки нет");
        }
    }
}