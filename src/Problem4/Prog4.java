package Problem4;

//Write a program called Prog4. Create an array that accepts only an array of Strings. Creates a
//new array in which all duplicate Strings in the original input array have been removed. You
//should not use any APIs like HashSet, TreeSet, etc., Write your own logic. Also, your result
//should not contain null values.
//For example, if the input array is ["horse", "dog", "cat", "horse", dog"]
//then the output would be the following array:
//        ["horse", "dog", "cat"]

public class Prog4 {

    public static void main(String[] args) {
        String[] inputArray = {"horse", "dog", "cat", "horse", "dog"};

        String[] tempArray = new String[inputArray.length];
        int count = 0;

        for (int i = 0; i < inputArray.length; i++) {
            boolean foundDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (inputArray[i].equals(tempArray[j])) {
                    foundDuplicate = true;
                    break;
                }
            }
            if (!foundDuplicate) {
                tempArray[count] = inputArray[i];
                count++;
            }
        }

        String[] uniqueArray = new String[count];
        for (int i = 0; i < count; i++) {
            uniqueArray[i] = tempArray[i];
        }


        StringBuilder output = new StringBuilder("[");
        for (int i = 0; i < uniqueArray.length; i++) {
            output.append("\"").append(uniqueArray[i]).append("\"");
            if (i < uniqueArray.length - 1) {
                output.append(", ");
            }
        }
        output.append("]");

        System.out.println(output.toString());
    }
}
