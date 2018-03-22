public class SumColumn {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < array[0].length; i++) {
            int total = 0;
            for (int j = 0; j < array.length; j++) {
                total = total + array[j][i];
            }
            System.out.println("Sum for column " + i + " is " + total);
        }
    }
}
