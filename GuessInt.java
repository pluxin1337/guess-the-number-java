import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        int randomInt = (int)(Math.random()*101);
        Scanner scanner = new Scanner(System.in);
        while (true) { 
            System.out.print("Enter your number: ");
            int currNumber = scanner.nextInt();
            if (currNumber == randomInt){
                System.out.println("Perfect, you have correctly guessed the number!");
                break;
            }else if (currNumber > randomInt){
                System.out.println("Too High. Try one more time.");
            }else if (currNumber < randomInt){
                System.out.println("Too Low. Try one more time.");
            }
        }
    }
}