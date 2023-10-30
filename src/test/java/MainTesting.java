import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainTesting {
    public static void main(String[] args) {

        System.out.println(setRandomYear());

    }

     static public String setRandomYear() {
        final Random random = new Random();
        int i = random.nextInt(1900, 2023);
        String num = Integer.toString(i);
        return  num;
    }
}
