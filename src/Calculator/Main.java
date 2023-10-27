
package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите второе целое число: ");
        int b = scanner.nextInt();
        System.out.print("Введите число от 1 до 4: ");
        int d = scanner.nextInt();
        scanner.close();

     /*  switch (d){
            case  1:
                sum(a, b);
                break;
            case 2:
                razn(a, b);
                break;
            case 3:
                once(a, b);
                break;
            case 4:
                if (d == 0) {
                    System.out.println("DEL 0");
                    break;
                }
                division(a, b);
                break;

                default:
                System.out.println("ERROR");
        } */

        if (d == 1) {
            sum(a, b);

        } else if (d == 2) {
            razn(a, b);

        } else if (d == 3) {
            once(a, b);

        } else if (d == 4){
            division(a, b);

        }else {
            System.out.println("ERROR");
        }


    }
    public static void sum(int a, int b){
        System.out.println("Сумма: " + (a + b));
    }
    public static void razn(int a, int b){
        System.out.println("Разность: " + (a - b));
    }
     public static void once(int a, int b){
         System.out.println("Произведение: " + (a * b));
     }
     public static void division(int a, int b){
         System.out.println("Частное: " + (a / b));
    }

}