import java.util.Scanner;


public class calculator {
    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор");
        {
            System.out.println("Выберите действие: 1 -сложение; 2 - вычитание");
            int choose= scanner.nextInt();

            switch (choose)
            {
                case 1:
                    System.out.println("Введите первое число");
                    double a= scanner.nextDouble();

                    System.out.println("Введите второе число");
                    double a2= scanner.nextDouble();

                    double d= a+a2;
                    System.out.printf("Сумма= %.4f",d);
                    scanner.close();
                    break;

                case 2:
                    System.out.println("Введите первое число");
                    double c= scanner.nextDouble();

                    System.out.println("Введите второе число");
                    double c2= scanner.nextDouble();

                    double d2= c-c2;
                    System.out.printf("Сумма= %.4f",d2);
                    scanner.close();
                    break;


            }


        }


    }
}
