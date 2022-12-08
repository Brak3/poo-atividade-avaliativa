//Bruxa  : Velocidade alta
//       : Dano baixo
//       : Percepção Alta


package character.assassinsType;

import characterCreation.characterAassassin;

public class assassinWitch extends characterAassassin {

    public void witchInit(){
        characterAassassin Assassino = new characterAassassin();
        setAge(200);
        setSex("Feminono");
        setWalkingSpeed(6);

    }
    public int witchAttack(){
        return 4;

    }
}
