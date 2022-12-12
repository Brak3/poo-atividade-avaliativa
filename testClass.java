/*
Autores:José Gabriel
        Lucas Lira
        Alisson Breno
        Carlos Bertran
Classe para testes
 */
import characterCreation.characterAassassin;
import characterCreation.characterVictim;
import characterCreation.characterClass;
import character.victimType.*;
import character.assassinsType.assassinWitch;
import huntScenary.huntingGrounds;
public class testClass {
    public static void main (String []Args ){
        assassinWitch bruxa = new assassinWitch();
        victimAshley asheley = new victimAshley();
        characterVictim vitima = new characterVictim();
        characterAassassin assassino = new characterAassassin();
        huntingGrounds hg = new huntingGrounds();
        hg.huntingGroundsMain();

    }
}
