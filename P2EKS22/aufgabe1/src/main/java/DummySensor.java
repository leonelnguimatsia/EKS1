import java.util.Random;

public class DummySensor implements ISensor {

    static final int INCLUSIVE_MIN = 1;
    static final int EXCLUSIVE_MAX = 11;
    @Override
    public Integer gibWert() {
<<<<<<< HEAD
        return (int) (Math.random() * 9 + 1);
=======
        return new Random().nextInt(EXCLUSIVE_MAX-INCLUSIVE_MIN) + INCLUSIVE_MIN;
>>>>>>> a6922886d17b5041f02f63d94aebaaae3f056814
    }
}
