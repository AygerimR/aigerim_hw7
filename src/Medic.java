public class Medic extends Hero{


    public Medic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил  суперспособность" + getSuperAbilityType());

    }
}

