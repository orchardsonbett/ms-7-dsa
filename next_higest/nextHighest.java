// Given a number, find the next higher number using only the digits in the given number. 
//For example if the given number is 1508, the next higher number with same digits is 8510.
import java.util.ArrayList;
 import java.util.Collections;


 public class NextHighest {

     public static void main(String args[]) {


         int input = 5678;
         int inputx = input;
         final int base = 10;
         final ArrayList<Integer> result = new ArrayList<>();
         //Get each value in integer using  Mod 10
         while (input != 0) {
             int b = input % (base);
            result.add(b);
             input = input / base;
         }



         for (int r = 0; r < 9; r++) {
             int finalInt= loopresult(result);
             if (finalInt > inputx) {

                 System.out.println(finalInt);
                 System.exit(0);
             }else if(finalInt == inputx){
                 System.out.println(" Values are equal to each other");

             } else {

                 System.out.println(" Value is less than input value");
             }

         }
     }


         public static int loopresult(ArrayList<Integer> kll){
         StringBuilder strNum = new StringBuilder();
         Collections.shuffle(kll);
         for (int num : kll)
         {
             strNum.append(num);
         }
         int finalInt = Integer.parseInt(strNum.toString());
             return finalInt;


     }

     }
