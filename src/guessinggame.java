import java.util.Scanner;

public class guessinggame{
    public static void main(String[]args) {
//        Scanner input= new Scanner(System.in);
        System.out.print("Guess my secret number.");
//        int guess = 1;
        double x = Math.random();
        int num = (int)(x*10+1);
        Scanner input= new Scanner(System.in);
        int guess = input.nextInt();

        while (guess != num){
            System.out.println("Guess again");
            guess = input.nextInt();
        }
        System.out.println("You guessed correctly, the number was " + num);
    }
}
