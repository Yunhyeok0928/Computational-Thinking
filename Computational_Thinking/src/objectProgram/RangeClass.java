package objectProgram;

public class RangeClass {

    int[] makeRange(int lower, int upper) {
        int arr[] = new int[ (upper - lower) + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = lower++;
        }
        return arr;
    }

    public static void main (String arg[]) {
        int theArray[];
        RangeClass aRange = new RangeClass();
        int low = 1, high = 10;
        theArray = aRange.makeRange(low, high); // 배열이 들어왔네?
        System.out.print("The array: [ ");
        for (int i = 0; i < theArray.length; i++) {
            System.out.print(theArray[i] + " ");
        }
        System.out.println("]");
    }


}
