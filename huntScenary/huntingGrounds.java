package huntScenary;

import character.assassinsType.assassinLeatherFace;
import character.assassinsType.assassinWitch;
import character.victimType.victimArnold;
import character.victimType.victimAshley;
import characterCreation.characterAassassin;
import characterCreation.characterVictim;

import java.util.Random;

public class huntingGrounds {
    characterVictim characterV = new characterVictim();
    characterAassassin characterA = new characterAassassin();
    assassinWitch witch = new assassinWitch();
    assassinLeatherFace chainsawMan = new assassinLeatherFace();
    victimArnold arnold = new victimArnold();
    victimAshley ashley = new victimAshley();

    int victimHP, victimWalkingSpeed, assassinDamage, assassinWalkingSpeed;


    public void huntingGroundsMain() {
        //Iniciar seleção de personagens
        charactersSelecion();
        while (victimHP > 0){
            startHunt();
        }

    }
    public void charactersSelecion() {
        Random rand = new Random();
        int victimSelection = rand.nextInt(2);
        int assassinSelection = rand.nextInt(2);
        switch (victimSelection) {
            case 0 -> {
                ashley.initAshley();
                System.out.println("Sobrevivente Ashley adicionada ao campo");
                victimHP = ashley.getVictimHP();
            }
            case 1 -> {
                arnold.initArnold();
                System.out.println("Sobrevivente Arnold adicionado ao campo");
                victimHP = arnold.getVictimHP();
            }
        }
        switch (assassinSelection) {
            case 0 -> {
                witch.witchInit();
                System.out.println("Caçadora Bruxa adicionada ao campo");
                assassinDamage = witch.getAssassinDamage();
            }
            case 1 -> {
                chainsawMan.initLeatherFace();
                System.out.println("Caçador Leather face adicionado ao campo");
                assassinDamage = chainsawMan.getAssassinDamage();
            }
        }
    }
    public void startHunt(){
        assassinWalkingSpeed = characterA.generateWalkingSpeed();
        victimWalkingSpeed = characterV.generateWalkingSpeed();
        int varDistance = victimWalkingSpeed - assassinWalkingSpeed;
        if (varDistance > 0){
            System.out.println("O Caçador se encontra a "+varDistance+" de distancia  caça");
            startHunt();
        } else if (varDistance == 0) {
            victimHP = victimHP -assassinDamage;
            if (victimHP == 0){
                System.out.println("O caçador desfere um golpe mortal na vitima, a matando.");
            }
            else {
                System.out.println("A vitima sobrevive ao ataque.");

            }
        }
        else{
            System.out.println("A distancia deu negativo :(");
            startHunt();
        }

    }

}
