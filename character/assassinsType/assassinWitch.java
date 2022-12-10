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
        setSex("Feminono");
        setWalkingSpeed(0);

    }
    public void witchAttack(){
        setAssassinDamage(assassinWitchDamage);

    }
}
