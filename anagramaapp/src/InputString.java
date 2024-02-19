import java.util.Scanner;

public class InputString {


    public InputString(Scanner scanWord1, Scanner scanWord2) {

        String chartWord ="";

        System.out.println("------->>>>Enter first Word: ");
        String word1 = scanWord1.nextLine();

        System.out.println("------->>>>Enter second Word: ");
        String word2 = scanWord2.nextLine();

        for(int i = word1.length() - 1; i >= 0; i--){

            chartWord += word1.charAt(i);

        }
        if (chartWord.equals(word2)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }


    }
}
