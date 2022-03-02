public class Polindrome {
    public boolean isPalindrome(int x) throws Exception { // 121
        if (x >= Math.pow(-2, 31) && x < Math.pow(2, 31)) {
            String input_data = String.valueOf(x);

            StringBuilder output_data = new StringBuilder();

            if (input_data.length() == 1) {
                return true;
            }

            for (int i = input_data.length() - 1; i >= 0; i--) {
                output_data.append(input_data.charAt(i));
            }
            return input_data.equals(output_data.toString());
        } else {
            throw new Exception();
        }
    }
}
