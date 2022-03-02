public class NumberSteps {
    public int numberOfSteps(int num) throws Exception {
        if (num >= 0 && num <= Math.pow(10, 6)) {
            int count = 0;
            while (num > 0) {
                count++;
                if (num % 2 == 1) num--;
                else num /= 2;
            }
            return count;
        } else {
            throw new Exception();
        }
    }
}
