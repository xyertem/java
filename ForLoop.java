import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ForLoop {
    static int A = 0;
    static int B = 0;
    static int C = 0;
    static int D = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        for(int i = 1 ; i <= userInput; i++){

            String userInput2 = scanner.nextLine();

            if(Objects.equals(userInput2, "A"))
                A += 1;
            if(Objects.equals(userInput2, "B"))
                B += 1;
            if(Objects.equals(userInput2, "C"))
                C += 1;
            if(Objects.equals(userInput2, "D"))
                D += 1;
        }

        System.out.print(D);
        System.out.print(" ");
        System.out.print(C);
        System.out.print(" ");
        System.out.print(B);
        System.out.print(" ");
        System.out.print(A);

    }
}
