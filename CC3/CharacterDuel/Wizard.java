public class Wizard extends Character implements Weapon, Armor{
    // Wizard AKA Dr. Strange
   protected int currentMagic;
   final protected int maxMagic;
    
    public Wizard (String n, int s, int d, int i, int m){
        super(n,s,d,i);
        
        maxMagic = m;
        currentMagic = maxMagic;
    }
    
    public int castLightningBolt(){
        if (currentMagic >= 5){
            currentMagic -= 5;
            return dice.roll() + intelligence;
            
        }else{
            return 0;
        }
    }
    
    public int castHeal(){
        if(currentMagic > 8){
            currentMagic -= 8;
            return heal() + intelligence;
        }else{
        return 0;
        }
    }
    
    public int getCurrentMagic(){
        return currentMagic;
    }

    @Override
    public int attack() {
        damage = dice.roll()+strength;
        wound();
        return damage;
    }
    @Override
    public int useWeapon() {
        damage = dice.roll() + strength;
        wound();
        return damage;
    }

    @Override
    public int useArmor() {
        int a = dice.roll() + strength;
        heal();
        return a;
    
    }
}