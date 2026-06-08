import java.util.Scanner;
public class Palindrome {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String word = input.nextLine();

        System.out.println(palindrome(word));
    }
    public static boolean palindrome(String characters){

        StringBuilder builder = new StringBuilder(characters);

        String reverseString = builder.reverse().toString();

        if(characters.equals(reverseString)){

            return true;
         }
        return false;
    }

}
