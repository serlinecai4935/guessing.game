import java.util.Scanner;

public class guessinggame{
    public static void main(String[]args) {
        System.out.println ("What is your name?");
        Scanner names = new Scanner(System.in);
        String name = names.nextLine();
        System.out.print(""+name+", guess my secret number.");
        double x = Math.random();
        int num = (int)(x*10+1);
        Scanner input= new Scanner(System.in);
        int guess = input.nextInt();
        int  guesses = 1;

        while (guess != num){
            System.out.println("Guess again, "+name+"");
            guess = input.nextInt();
            guesses ++;
        }
        System.out.println(""+name+", you guessed correctly. The number was " + num + ".");
        System.out.println ("You guessed "+guesses+" time(s).");
    }
}
