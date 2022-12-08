//Bruxa  : Velocidade alta
//       : Dano baixo
//       : Percepção Alta


package character.assassinsType;

import characterCreation.characterAassassin;

public class assassinWitch extends characterAassassin {

    public void witchInit(){
        setAge(200);
        setSex("Feminino");
        setWalkingSpeed(5);
    }
    public int witchAttack(){
        return 4;

    }
}
