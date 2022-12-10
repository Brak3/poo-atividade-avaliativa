package characterCreation;
import java.util.Random;
import java.util.random.RandomGenerator;

public class characterClass {
    private String sex;
    private int walkingSpeed;
    private int age;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWalkingSpeed() {
        return walkingSpeed;
    }

    public void setWalkingSpeed(int walkingSpeed) {
        this.walkingSpeed = walkingSpeed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void generateWalkingSpeed(){
        Random generateRandom = new Random();
        setWalkingSpeed(generateRandom.nextInt(6));

    }

}