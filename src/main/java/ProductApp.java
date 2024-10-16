import java.sql.SQLOutput;
import java.util.Scanner;
public class ProductApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //details for person 1
        String[] details1 = getDetails();


        //first person

     /*   Product p = new Product();
        p.setName(name);
        p.setEmail(email);
        p.setCourse(course)*/

        //second person
        Product p = new Product("Person Name","Email","Course");
        System.out.println(p);


    }
    public static String[] getDetails()
    {
        //details for person 2
        Scanner sc = new Scanner(System.in);
        String[] details = new String[3];
        System.out.println("Please enter a persons name: ");
        String name = sc.nextLine();
        System.out.println("Please enter the email of the person: ");
        String email = sc.nextLine();
        System.out.println("Please Enter Course:");
        String course = sc.nextLine();
        return details;
    }
}