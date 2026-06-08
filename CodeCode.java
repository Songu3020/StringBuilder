import java.util.Scanner;
public class CodeCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        IO.print("Enter a number: ");
        String number = input.nextLine();

        String[] token = number.split("[\\s()\\-]+");

        String areaCode = token[0];
        String firstThreeNumber = token[1];
        String lastFourNumber = token[2];

        StringBuilder phoneNumber = new StringBuilder();
        phoneNumber.append(firstThreeNumber).append(lastFourNumber);

        IO.println(areaCode);
        IO.println(phoneNumber.toString());
    }
}




