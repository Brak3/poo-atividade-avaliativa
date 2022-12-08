/*
Autores:José Gabriel
        Lucas Lira
        Alisson Breno
        Carlos Bertran
Classe para testes
 */
import characterCreation.characterAassassin;
import characterCreation.characterClass;
import character.assassinsType.assassinWitch;
public class testClass {
    public static void main (String []Args ){
        assassinWitch Bruxa = new assassinWitch();
        Bruxa.witchInit();
        System.out.println(Bruxa.getAge());

    }
}
