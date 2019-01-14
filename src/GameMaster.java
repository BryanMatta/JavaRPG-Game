import java.util.Scanner;

class GameMaster {

    static int generateHealth(int dice, int mod){
        return (int)((Math.random()*(dice - 1) + 1) + mod);
    }

    static void play(String name) {
        Scanner keyboard = new Scanner(System.in);
        int playerDamage;
        int monsterDamage;
        int playerPotions = 3;
        int userAction;
        boolean tried = false;
        boolean combatActive = true;
        System.out.println("There is a zombie in front of you.");
        while (combatActive) {
            Display.stats("Zombie", Monster.health, "Bite");
            System.out.println("Press enter to continue.");
            keyboard.nextLine();
            Display.stats(name, Player.health, "Sword");
            System.out.println("Press enter to continue.");
            keyboard.nextLine();
            Display.options(playerPotions, tried);
            System.out.println("Please choose your action!");
            userAction = keyboard.nextInt();
            keyboard.nextLine();
            switch (userAction){
                case 1:
                    playerDamage = Combat.meleeAttack(8, Player.STR);
                    System.out.println("You swing your sword at the zombie! \nYou deal " + playerDamage + " damage");
                    Monster.health -= playerDamage;
                    keyboard.nextLine();
                    break;
                case 2:
                    Player.health += 25;
                    playerPotions--;
                    System.out.println("You drink your potion. \nYou feel like a big boi now! (25hp)\n You have " + playerPotions + " left");
                    if(Player.health>Player.maxHealth){
                        Player.health=Player.maxHealth;
                    }
                    keyboard.nextLine();
                    break;
                case 3:
                    System.out.println("You can't run");
                    keyboard.nextLine();
                    tried = true;
                    break;
            }
            if (checkDeath()){
                combatActive = false;
                continue;
            }
            System.out.println("The zombie bites!");
            monsterDamage = Combat.meleeAttack(6, Monster.STR);
            System.out.println("The zombie deals " + monsterDamage + " damage!");
            Player.health-=monsterDamage;
            keyboard.nextLine();
            if(checkDeath()){
                combatActive = false;
            }
        }
    }
    private static boolean checkDeath(){
        if (Player.health <= 0) {
            Display.playerDeath("zombie");
            return true;
        } else if (Monster.health <= 0) {
            Display.monsterKilled("zombie");
            return true;
        }
        else{
            return false;
        }
    }
}
