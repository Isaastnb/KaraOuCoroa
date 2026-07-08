import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        while(loop){
        System.out.println("Choose your choices:");
        System.out.print("Choice 1: ");
        String c1 = sc.nextLine();
        System.out.print("Choice 2: ");
        String c2 = sc.nextLine();

        //int roll = random.nextInt(2);
        int roll = (int) (Math.random() * 2);

        if(roll == 0){
            System.out.println("The choice is: " + c1);
        } else { 
            System.out.println("The choice is: " + c2);
        }

        System.out.print("Play again?[Y/N] ");
        String playAgain = sc.nextLine();

        if(playAgain.equalsIgnoreCase("N")){
            loop = false;
        }
        



        }

        sc.close();
    }
}
