import java.util.Scanner;

public class GuessInt {
    public static void main(String[] args) {
        int randomInt = (int)((Math.random()*100) + 1);
        Scanner scanner = new Scanner(System.in);
        
        int attempts = 0;
        int max_attempts = 2;
        System.out.print("Welcome, you have " + max_attempts + " attempts to guess the number. Enter your number: ");
        while (true) { 
            int currNumber = scanner.nextInt();
            attempts++;
            if (currNumber == randomInt){
                System.out.println("Perfect, you guessed the number with " + attempts + " attempts!");
                break;
            }else if (attempts == max_attempts) {
                System.out.println("You dont have any attempts left.");
                break;
            }else if (currNumber > randomInt){
                System.out.print("Too High. You have " + (max_attempts - attempts) + " attempts to guess the number. Enter your number: ");
            }else if (currNumber < randomInt){
                System.out.print("Too Low. You have " + (max_attempts - attempts) + " attempts to guess the number. Enter your number: ");
            }
        }
        scanner.close();
    }
}