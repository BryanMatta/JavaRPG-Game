import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello hero! What is thy name?");
        String name = keyboard.nextLine();
        Display.attributes();


        boolean start = true;
        while (start) {
            System.out.println("Are you ready to start your adventure " + name + "? \n" + "(Y/N)");
            String answer = keyboard.nextLine();
            if (answer.isEmpty()){
                System.out.println("Please enter \"Yes\"/\"No\"");
                System.out.println();
            }
            else {
                start=Functionality.confirmation(answer.charAt(0), name);
            }

        }
    }
}

