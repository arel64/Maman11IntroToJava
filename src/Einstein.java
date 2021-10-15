import java.util.Scanner;

/*
    Class Name: Einstein
    Author: Arel Sharon
    Date: 15/10/2021
    Description: This class implements Einsteins Famous riddle using user input of any 3 digit number
    input any positive 3 digit with different first and last digits to test the riddle!
 */
public class Einstein {
    public static void main(String[] args) {
        //Declarations
        Scanner in = new Scanner(System.in);
        final int DIFFERENCE_SUM = 1089;
        int invertedInputNum,inputNum;
        int inputNumFirstDigit,inputNumMiddleDigit,inputNumLastDigit;
        int invertedAbsDifference,absDifference;
        int absDifferenceNumFirstDigit,absDifferenceNumMiddleDigit,absDifferenceNumLastDigit;

        //Introductions and input scan
        System.out.println("Welcome to the Einstein magic game.");
        System.out.println("Please enter a 3 digit positive number whose first and last digits are different:");
        inputNum = in.nextInt();

        //Validating inputNum
        if(inputNum>=100 && inputNum<1000){

            //Input num is a 3 digit positive number
            System.out.println("User number is: "+inputNum);


            //The following will extract each digit from any 3 digit number

            inputNumFirstDigit  = inputNum/100;
            inputNumMiddleDigit = (inputNum%100)/10;
            inputNumLastDigit   = inputNum%10;

            if(inputNumFirstDigit != inputNumLastDigit){
                //First and last digits are different as requested
                //InputNum is valid for the program

                //"Assembling" the inverted number by multipying each digit by 10^(digitPosition) count from right, begin with 0
                invertedInputNum = inputNumLastDigit * 100 + inputNumMiddleDigit * 10 + inputNumFirstDigit;

                //Calculate absolute difference
                absDifference = Math.abs(inputNum - invertedInputNum);

                //Similarly to inputNum, extract the difference digits
                absDifferenceNumFirstDigit  = absDifference/100;
                absDifferenceNumMiddleDigit = (absDifference%100)/10;
                absDifferenceNumLastDigit   = absDifference%10;

                //Similarly to inputNum, Assemble the inverted number with digits
                invertedAbsDifference = absDifferenceNumLastDigit * 100 + absDifferenceNumMiddleDigit * 10 + absDifferenceNumFirstDigit;

                System.out.println("Difference: "+ absDifference);
                System.out.println("Reversed difference: "+invertedAbsDifference);

                //Check if process was successful
                if((absDifference + invertedAbsDifference) == DIFFERENCE_SUM){
                    System.out.println("SUCCEEDED");
                }else{
                    System.out.println("FAILED");
                }
            }else{
                System.out.println("First and last digits are identical!");
            }
        }else{
            //Input num is invalid(Either not positive or out of the 3 digit range)
            System.out.println("The number you entered is not a 3 digit positive number");
        }
    } //End of main
}//End of Einstein class
