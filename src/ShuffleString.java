public class ShuffleString {
    public int findIndexByElement(int[] arr, int el) {
        int resultIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                resultIndex = i;
                break;
            }
        }
        return resultIndex;
    }

    public String restoreString(String s, int[] indices) {
        String resultS = "";
        for(int i = 0; i < indices.length; i++) {
            int indexOfElement = findIndexByElement(indices, i);
            resultS += s.charAt(indexOfElement);
        }
        return resultS;
    }
}
