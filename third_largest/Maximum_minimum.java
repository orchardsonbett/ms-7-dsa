// Using java solve the problem below:

//Create your own array of integers
// Find the maximum and minimum of this array that you just created.
// create a variable to hod the maximum
// create a variable to hold the minimum
// take in the array of numbers
// begin to loop through them
// put the lowest in its array 
// put the highest in its array
// output the highest then output the lowest
public class MaxMinSolution {
 int  q, i;
   public static void main(String args[]){


        int arraymaxmin[] ={2,5,4,7,8,0,9,20,90,40,30};
        int maxvalue, minvalue ;

        for (int i = 0; i < arraymaxmin.length; i++)
      {
           for(int q = 0 ; q<arraymaxmin.length-1;q++){

                 if(arraymaxmin[q]< arraymaxmin[q+1]){

                    int swap = arraymaxmin[q];

                  arraymaxmin[q]=arraymaxmin[q+1];
                   arraymaxmin[q+1]=swap;
                    //sort=false;


                 }


           }

        }
        maxvalue = arraymaxmin[0];
        minvalue = arraymaxmin[10];

        System.out.println("Max value "+ maxvalue);
       System.out.println("Min value "+ minvalue);

    }



 }
