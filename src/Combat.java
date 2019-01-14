// This class is generates damages for ranged weaponry and melee ( Magic is planned to be added)
//

class Combat {
    static int rangeAttack(int dice, int Dex){
        return (int)(Math.random()*(dice-1)+1)+Dex;
    }
    static int meleeAttack(int dice, int Str){
        return (int)(Math.random()*(dice-1)+1)+Str;
    }
}
