import java.util.Arrays;

public class Build {
    public static void main(String[] args) throws Exception {
        // Shuffle String
        System.out.println("Shuffle String");
        ShuffleString shuffleString = new ShuffleString();
        String str = shuffleString.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3});
        System.out.println(str);

        // Palindrome number
        System.out.println("Palindrome number");
        Polindrome polindrome = new Polindrome();
        boolean isPolindrome = polindrome.isPalindrome(997);
        System.out.println(isPolindrome);

        // Number of Steps to Reduce a Number to Zero
        System.out.println("Number of Steps to Reduce a Number to Zero");
        NumberSteps numberSteps = new NumberSteps();
        int numberOfSteps = numberSteps.numberOfSteps(14);
        System.out.println(numberOfSteps);

        // Check If Two String Arrays are Equivalent
        System.out.println("Check If Two String Arrays are Equivalent");
        TwoStringArrays twoStringArrays = new TwoStringArrays();
        boolean isArrayStringsAreEqual = twoStringArrays.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"});
        System.out.println(isArrayStringsAreEqual);

        // Sum of All Odd Length Subarrays
        System.out.println("Sum of All Odd Length Subarrays");
        OddLength oddLength = new OddLength();
        int sumOddLen = oddLength.sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3});
        System.out.println(sumOddLen);

        // Find N Unique Integers Sum up to Zero (первый вариант решений)
        System.out.println("Find N Unique Integers Sum up to Zero (первый вариант решений)");
        UniqueIntegersFirst uniqueIntegersFirst = new UniqueIntegersFirst();
        int[] arr1 = uniqueIntegersFirst.sumZero(10);
        System.out.println(Arrays.toString(arr1));

        // Find N Unique Integers Sum up to Zero (второй вариант решений)
        System.out.println("Find N Unique Integers Sum up to Zero (второй вариант решений)");
        UniqueIntegersSecond uniqueIntegersSecond = new UniqueIntegersSecond();
        int[] arr2 = uniqueIntegersSecond.sumZero(10);
        System.out.println(Arrays.toString(arr2));
    }
}
