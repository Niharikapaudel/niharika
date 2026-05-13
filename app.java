import java.util.Scanner;
public class app
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in); //create scanner obj
        System.out.println("enter your name:");
        String name= scanner.nextLine(); //read user input
        System.out.println("hello,"+name);
        scanner.close();
    }
}