import java.util.Scanner;
import java.util.ArrayList;

public class PersonTest
{
    public static void main(String[] args)
    {
        int count = 1;
        Scanner in = new Scanner(System.in);        
        ArrayList<Person> peeps = new ArrayList<Person>();
        while (count != 10)
        {
            System.out.println("What is the name of the person?: ");
            Person person = new Person(in.nextLine());
            peeps.add(person);
        }
        
        System.out.println(
    }
}
