//
//

class Player {
    static int strength = (int) (Math.random() * (20 - 6) + 6);;
    static int dexterity = (int) (Math.random() * (20 - 6) + 6);;
    static int constitution = (int) (Math.random() * (20 - 6) + 6);;
    static int intelligence = (int) (Math.random() * (20 - 6) + 6);;
    static int STR = calculateMod(strength);
    static int DEX = calculateMod(dexterity);
    static int CON = calculateMod(constitution);
    static int INT = calculateMod(intelligence);
    static int health = GameMaster.generateHealth(12, CON);
    static int maxHealth = health;

    private static int calculateMod(int attribute){
        if(attribute==20){
            return 5;
        }
        else if (attribute>=18){
            return 4;
        }
        else if (attribute>=16){
            return 3;
        }
        else if (attribute>=14){
            return 2;
        }
        else if (attribute>=12){
            return 1;
        }
        else if (attribute>=10){
            return 0;
        }
        else if (attribute>=8){
            return -1;
        }
        else{
            return -2;
        }
    }
}
