import java.security.SecureRandom;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        boolean loop = true;
        boolean loop2 = true;
        Scanner sc = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        String playAgain;
       

        while(loop){
        System.out.println("--------------------------------");
        System.out.println("Welcome to the game of Kara ou Coroa");
        System.out.println("--------------------------------");
        System.out.println("Choose your choices:");
        System.out.print("Choice 1: ");
        String c1 = sc.nextLine();
        System.out.print("Choice 2: ");
        String c2 = sc.nextLine();
        while(loop2){
            System.out.println("--------------------------------");
            System.out.println("Flipping the coin...");
            System.out.println("--------------------------------");
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        
            int randomInt = secureRandom.nextInt(2);
            if(randomInt == 0){
                System.out.println("The choice is: " + c1);
            } else { 
                System.out.println("The choice is: " + c2);
            }


            System.out.print("Flip again?[Y/N] ");
            playAgain = sc.nextLine();

            if(playAgain.equalsIgnoreCase("Y") || playAgain.isEmpty()){
                loop2 = true;
            } else {
                loop2 = false;
            }

        }
        System.out.println("------------------");
        System.out.print("Play again?[Y/N] ");
        playAgain = sc.nextLine();

        if (playAgain.equalsIgnoreCase("N")) {
            loop = false;
            
        }
    }

        sc.close();
    }
}
