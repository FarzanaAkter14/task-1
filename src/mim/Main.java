package mim;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter your section : ");
        String section = Input.nextLine();
        System.out.println("Section is : " + section);

        Info Info = new Info();
        System.out.println("Name : " + Info.name);
        System.out.println("Id : " + Info.id);

        Hobby Hobby = new Hobby();
        System.out.println("Hobby : " + Hobby.hobbyName);
    }
}
