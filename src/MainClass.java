import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        System.out.print("Введите a:");
        a=in.nextInt();
        c=a%10;
        b=a/10;
        if (a==37||a==73) {
            System.out.println("Цифры 3 и 7 входят в число");
        } else {
            System.out.println("Цифры 3 и 7 не входят в число");
        }
        if (a==48||a==84)
        {
            System.out.println("Цифры 4 и 8 входят в число");
        }
        else
            {
                System.out.println("Цифры 4 и 8 не входят в число");
            }
        if (c==9||b==9)
        {
            System.out.println("Цифра 9 входит в число");
        }
        else
            {
                System.out.println("Цифра 9 не входит в число");
            }
    }
}

