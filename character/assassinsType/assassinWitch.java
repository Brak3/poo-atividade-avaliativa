//Bruxa  : Velocidade alta
//       : Dano baixo
//       : Percepção Alta


package character.assassinsType;

import characterCreation.characterAassassin;

public class assassinWitch extends characterAassassin {
    public int assassinWitchDamage = 4;

    public void witchInit(){
        characterAassassin Assassino = new characterAassassin();
        setAge(200);
        setSex("Feminino");
        setWalkingSpeed(0);
        setAssassinDamage(assassinWitchDamage);

    }
    public int witchAttack(){
        setAssassinDamage(assassinWitchDamage);
        return 0;
    }
}
