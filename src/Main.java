public class Main {
    public static void main(String[] args) {
        int clientOS = 2;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1) {
           System.out.println("Установите версию приложения для Android по ссылке");
           } else {
           System.out.println("обратиться за помощью");
       }
    }
}