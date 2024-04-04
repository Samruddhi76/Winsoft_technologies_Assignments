import java.util.Arrays;

public class MergeArrays {
    public static void mergeArrays(int[] X, int[] Y) {

        int[] temp = new int[X.length];
        int index = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] != 0) {
                temp[index] = X[i];
                index++;
            }
        }
        for (int j = 0; j < Y.length; j++) {
            temp[index] = Y[j];
            index++;
        }

        Arrays.sort(temp);

        for (int i = 0; i < X.length; i++) {
            X[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };

        mergeArrays(X, Y);

        System.out.println(Arrays.toString(X));
    }
}
