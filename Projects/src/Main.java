import java.util.Scanner; //This is a code to import scanner in java which is used to take the user inputs.

public class Main{
    public static void main(String[] args){
        //Scanner tool creation
        Scanner rohit = new Scanner(System.in);

        //Printing write a message for the user

        System.out.println("Write a message ...");
        //Assigning the input given by the user to memory
        String input = rohit.nextLine(); //nextLine() function is used to read the input given by the user till \n is reached
        System.out.println(input);


    }
}