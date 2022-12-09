package character.assassinsType;

import characterCreation.characterAassassin;

public class assassinLeatherFace extends characterAassassin {
    public int leatherFaceDamage = 6;
    public void initLeatherFace(){
        setAge(40);
        setSex("Maculino");
        setWalkingSpeed(2);
    }
    public void leatherFaceAttack(){
        setAssassinDamage(leatherFaceDamage);
    }

}
