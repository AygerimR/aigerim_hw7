public class Main {
    public static void main(String[] args) {
       Hero [] heroes = new Hero[3];
       heroes[0] = new Magic(200, 50, "Telepathy");
       heroes[1] = new Medic(150, 50, "  Healing");
       heroes[2] = new Warrior(400, 50, " Cristal Damage");
    
       for (Hero hero  : heroes){
           hero.applySuperAbility();
       }
        
    }
}