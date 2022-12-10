
package characterCreation;
public class characterAassassin  extends characterClass {
    public int assassinDamage;

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setWalkingSpeed(int walkingSpeed) {
        super.setWalkingSpeed(walkingSpeed);
    }

    @Override
    public void setSex(String sex) {
        super.setSex(sex);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public int getWalkingSpeed() {
        return super.getWalkingSpeed();
    }

    @Override
    public String getSex() {
        return super.getSex();
    }
    public void setAssassinDamage(int Damage){
        assassinDamage = Damage;
    }
    public int getAssassinDamage(){
        return assassinDamage;
    }

}