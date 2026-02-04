import java.util.Scanner;

public class NimGame {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of sticks: ");
    int stickNum = scan.nextInt();
    System.out.println("Number of sticks is: " + stickNum);
    int i = 0;

    while (stickNum > 0){
        if(i%2 == 0){
            System.out.println("Enter the number of sticks you take (1 or 2): ");
            int stickTake = scan.nextInt();
            if(stickTake == 1 || stickTake ==2){
                if(stickNum - stickTake == 0){
                    System.out.println("Round " + i + ": " + stickNum + " at start human takes " + stickTake + ", so " + (stickNum - stickTake) + " remain.");
                    System.out.println("You win!");
                    stickNum = stickNum -stickTake;
                } else{
                    System.out.println("Round " + i + ": " + stickNum + " at start human takes " + stickTake + ", so " + (stickNum - stickTake) + " remain.");
                    stickNum = stickNum - stickTake;
                    i++;
                }
            } 
        } else if(i%2 == 1){
            if(stickNum >= 2){
                int rnd = (int)(Math.random()*2 + 1);
                if(stickNum - rnd == 0){
                    System.out.println("Round " + i + ": " + stickNum + " at start computer takes " + rnd + ", so " + (stickNum - rnd) + " remain.");
                    System.out.println("The computer wins / you lose!");
                    stickNum = stickNum - rnd;
                } else{
                    System.out.println("Round " + i + ": " + stickNum + " at start computer takes " + rnd + ", so " + (stickNum - rnd) + " remain.");
                    stickNum = stickNum - rnd;
                    i++;
                }
            } else{
                System.out.println("Round " + i + ": " + stickNum + " at start computer takes 1" + ", so 0 remain.");
                System.out.println("The computer wins / you lose!");
                stickNum = stickNum - 1;
            }
        }
    }
}
}
