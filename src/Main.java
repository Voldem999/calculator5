import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите пункт");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Выйти");
            int person = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result;
            if (person == 5) {
                System.out.println("Программа завершена");
                break;
            } else if (person == 1) {
                System.out.println(a + " + " + b);
                result = a + b;
                System.out.println("Ответ = " + result);
            } else if (person == 2) {
                System.out.println(a + " - " + b);
                result = a - b;
                System.out.println("Ответ = " + result);
            } else if (person == 3) {
                System.out.println(a + " * " + b);
                result = a * b;
                System.out.println("Ответ = " + result);
            } else if (person == 4) {
                if (b == 0) {
                    throw new RuntimeException("На ноль делить нельзя");
                }
                System.out.println(a + " / " + b);
                result = a / b;
                System.out.println("Ответ = " + result);
            }
        }
    }
}