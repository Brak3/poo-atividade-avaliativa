package characterCreation;

public class characterVictim extends characterClass{
    public int victimHP;
    @Override
    public void setWalkingSpeed(int walkingSpeed) {
        super.setWalkingSpeed(walkingSpeed);
    }

    @Override
    public void setSex(String sex) {
        super.setSex(sex);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getSex() {
        return super.getSex();
    }

    @Override
    public int getWalkingSpeed() {
        return super.getWalkingSpeed();
    }
    @Override
    public int generateWalkingSpeed() {
        super.generateWalkingSpeed();
        return 0;
    }

    public int getVictimHP() {
        return victimHP;
    }

    public void setVictimHP(int victimHP) {
        this.victimHP = victimHP;
    }
    public void decreaseVictimHP(int controlVariableHP){
        this.victimHP = this.victimHP - controlVariableHP;

    }
    public void increaseVictimHP(int controlVariableHP){
        this.victimHP = this.victimHP - controlVariableHP;
    }
}
