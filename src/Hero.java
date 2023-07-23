public  abstract class Hero implements HavingSuperAbility {
   public  int health ;
   public   int damage ;
   String superAbilityType;




   public  Hero (int health, int damage , String superAbilityType){
      this.health = health;
      this.damage = damage;
      this.superAbilityType = superAbilityType;


   }
   public int getHealth() {
      return health;
   }

   public int getDamage() {
      return damage;
   }

   public String getSuperAbilityType() {
      return superAbilityType;
   }
   public void applySuperAbilityType(){
      System.out.println("Использовать" + superAbilityType + " super ability");
   }
}

