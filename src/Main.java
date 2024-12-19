import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Full name:");
        String name = sc.nextLine();
        System.out.println("Enter your weight:");
        double wKg = sc.nextDouble();
        System.out.println("Enter your age:");
        byte age = sc.nextByte();
        System.out.println("Enter your sex:");
        String sex = sc.next();
        System.out.println("Enter your monthly salary:");
        int salary = sc.nextInt();
        sc.close();
        System.out.println(name + ", " + wKg + " kg, " + age + " years old. Sex: " + sex);
        System.out.println("Yearly income: " + salary * 12);
    }
}