// Planning to add base
//

class Functionality {
    static boolean confirmation(char user, String name){
        switch (user) {
            case 'y':
                GameMaster.play(name);
                return false;
            case 'n':
                System.out.println("You decide to live out your life as a farmer.");
                return false;
            default:
                System.out.println("Please enter \"Yes\"/\"No\"");
                return true;
        }
    }
}
