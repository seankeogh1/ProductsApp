import java.sql.SQLOutput;
import java.util.Scanner;
public class ProductApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //details for person 1
        System.out.println("Please enter a persons name: ");
        String name = sc.nextLine();
        System.out.println("Please enter the email of the person: ");
        String email = sc.nextLine();
        System.out.println("Please Enter Course:");
        String course = sc.nextLine();

        Product product1 = new Product();
        product1.setName(name);
        product1.setEmail(email);
        product1.setCourse(course);

        System.out.println("Please enter a persons name: ");
        String name2 = sc.nextLine();
        System.out.println("Please enter the email of the person: ");
        String email2 = sc.nextLine();
        System.out.println("Please Enter Course:");
        String course2 = sc.nextLine();

        Product product2 = new Product(name2);
        product2.setEmail(email2);
        product2.setCourse(course2);

        System.out.println("Please enter a persons name: ");
        String name3 = sc.nextLine();
        System.out.println("Please enter the email of the person: ");
        String email3 = sc.nextLine();
        System.out.println("Please Enter Course:");
        String course3 = sc.nextLine();

        Product product3 = new Product(name3, email3, course3);

        System.out.println("\n Student 1: Name: "+ product1.getName()+", Email: "+ product1.getEmail()+", Course: "+ product1.getCourse());
        System.out.println("\n Student 2: Name: "+ product2.getName()+", Email: "+ product2.getEmail()+", Course: "+ product2.getCourse());
        System.out.println("\n Student 3: Name: "+ product3.getName()+", Email: "+ product3.getEmail()+", Course: "+ product3.getCourse());



sc.close();
    }
}