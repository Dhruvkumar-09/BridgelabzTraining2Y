import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r=sc.nextInt();
        double Area= 3.14*r*r;
        System.out.println("The area of circle is: " +Area);
    }
}
