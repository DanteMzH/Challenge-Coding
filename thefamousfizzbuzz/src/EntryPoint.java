
import java.util.*;
import java.lang.String;
import java.io.*;

public class EntryPoint {


    public EntryPoint(Scanner scan){

        int input  = scan.nextInt();
        System.out.println("recibi el dato es : " + input + "\n");

        for( int i = 1 ; i <= input; i++  ){
            if ( i % 3 ==0){
                System.out.println("fuzz");
            } else if ( i % 5 == 0) {
                System.out.println("buzz");

            } else if (i % 15 == 0) {
                System.out.println("fizzbuzz");

            } else {
                System.out.println(i);;
            }

        }

    }

    

}
