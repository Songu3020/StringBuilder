import java.util.Scanner;
public class CompareTo {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();

        System.out.println("Enter a word");
        String secondWord = input.nextLine();

        String  compare = new String(word);
        word.regionMatches(6,secondWord,3,5);


    }
}
