import java.util.Arrays;
import java.util.Random;

public class UniqueIntegers {
    public int[] sumZero(int n) throws Exception {
        if (n >= 1 && n <= 1000) {
            int[] result = new int[n];

            if (n > 1) {
                Random random = new Random();
                int rand = random.nextInt(200 + 1) - 100; // [-100...100] get random number
                result[n - 1] = rand;

                for (int i = n - 2; i > 0; i--) {
                    if (rand > 0) {
                        rand = random.nextInt(rand + 1) - rand; // [-rand...0] get random number
                        result[i] = rand;
                    } else if (rand < 0) {
                        rand = random.nextInt(Math.abs(rand) + 1); // [0...rand] get random number
                        result[i] = rand;
                    } else {
                        rand = random.nextInt(200 + 1) - 100; // [-100...100] get random number
                        result[i] = rand;
                    }
                }

                int sumArr = Arrays.stream(result).sum();
                result[0] = (-1) * sumArr; // - sumArr

            } else {
                result[n - 1] = 0;
            }


            return result;
        }
        else {
            throw new Exception();
        }
    }
}
