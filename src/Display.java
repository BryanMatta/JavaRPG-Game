class Display {
    static void attributes(){
        System.out.println("Your attributes are: \nStrength: " + Player.strength + " \nDexterity: " + Player.dexterity + "\nConstitution: " + Player.constitution + "\nIntelligence: " + Player.intelligence);
    }
    static void stats(String name, int health, String attack){
        System.out.println(name + ":");
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
        System.out.println();
    }
    static void options(int potionLeft, boolean triedRunning){
        System.out.println("You can do the following:");
        System.out.println("1. Attack");
        System.out.println("2. Drink potion. You have: " + potionLeft + " potions left.");
        if(!triedRunning) {
            System.out.println("3. Run!");
        }
        System.out.println();
    }
    static void playerDeath(String monster){
        String killer = monster.toLowerCase();
        switch (killer){
            case"zombie":
                System.out.println("The Zombie overpowers you and throws you into the ground. \nYour attempts to push it away are futile, the zombie opens up your belly and starts eating your guts. \nYour life begins to fade as all you can hear is the faint sound of the zombie breaking open your skull. \n*CRUNCH*");
                break;
            case"wolf":
                System.out.println("The wolf lunges at your throat. \nYour body goes limp and the last thing you smell is the stench of the wolf's breath and the feeling of warm blood escaping your neck.");
                break;
        }
        System.out.println("You died.");
        System.out.println("GAME OVER");
    }
    static void monsterKilled(String monster){
        String killed = monster.toLowerCase();
        switch (killed){
            case"zombie":
                System.out.println("You decapitate the zombie in one swift motion, the zombie let's out one last moan as the undead finally returns to the grave");
                break;
            case"wolf":
                break;
        }
    }
}
