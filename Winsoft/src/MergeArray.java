public class MergeArray {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int last = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                last = i;
                break;
            }
        }
        
        int i = last;
        int j = n - 1;
        int k = m - 1;
        while (i >= 0 && j >= 0) {
            if (X[i] > Y[j]) {
                X[k--] = X[i--];
            } else {
                X[k--] = Y[j--];
            }
        }
        
        while (j >= 0) {
            X[k--] = Y[j--];
        }
    }
    
    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0, 0, 0}; 
        int[] Y = {1, 8, 9, 10, 15};
        
        mergeArrays(X, Y);
        
        for (int num : X) {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }
}
