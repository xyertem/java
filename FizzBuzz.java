import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();

        if(userInput1 > userInput2 ){
            for(; userInput2 <= userInput1; userInput2++ ){
                if((userInput2 % 3  == 0 ) && (userInput2 % 5 == 0 )){
                    System.out.println("FizzBuzz");
                } else if(userInput2 % 3  == 0 ){
                    System.out.println("Fizz");
                } else if(userInput2 % 5 == 0){
                    System.out.println("Buzz");
                }else {
                    System.out.println(userInput2);
                }
            }
        } else if(userInput2 > userInput1 ){
            for(; userInput1 <= userInput2; userInput1++ ){
                if((userInput1 % 3  == 0 ) && (userInput1 % 5 == 0 )){
                    System.out.println("FizzBuzz");
                } else if(userInput1 % 3  == 0 ){
                    System.out.println("Fizz");
                } else if(userInput1 % 5 == 0){
                    System.out.println("Buzz");
                }else {
                    System.out.println(userInput1);
                }
            }
        } else {
            if((userInput1 % 3  == 0 ) && (userInput1 % 5 == 0 )){
                System.out.println("FizzBuzz");
            } else if(userInput1 % 3  == 0 ){
                System.out.println("Fizz");
            } else if(userInput1 % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(userInput1);
            }
        }
    }
}
