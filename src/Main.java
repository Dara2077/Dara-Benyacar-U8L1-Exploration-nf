import java.util.Arrays;

public class Main {
    public static void main(String[] args){
//        String[][] seating = {{"Abby", "Don", "George", "Kim"}, {"Brian", "Elenor", "Henry", "Lenny"}, {"Cathy", "Fred", "Jill", "Matt"}};
//        seating[1][2] = "Paul";
//        String temp = seating[0][0];
//        seating[0][0] = seating[2][3];
//        seating[2][3] = temp;
//        String[] temp1 = seating[0];
//        seating[0] = seating[1];
//        seating[1] = temp1;
//        for (String[] row : seating){
//            System.out.println(Arrays.toString(row));
//        }
//        System.out.println(seating[0][2] + seating[2][0]);

//        int[][] arr1 = new int[2][3];
//        int[][] arr2 = new int[3][2];
//        arr1[0][0] = 1;
//        arr1[0][1] = 2;
//        arr1[0][2] = 3;
//        arr1[1][0] = 4;
//        arr1[1][1] = 5;
//        arr1[1][2] = 6;
//
//        arr2[0][0] = 1;
//        arr2[1][0] = 2;
//        arr2[2][0] = 3;
//        arr2[0][1] = 4;
//        arr2[1][1] = 5;
//        arr2[2][1] = 6;
//
//        for (int[] arr: arr1){
//            System.out.println(Arrays.toString(arr));
//        }
//
//        for (int[] arr: arr2){
//            System.out.println(Arrays.toString(arr));
//        }
//
//        System.out.println(arr1[0][2] + arr2[2][0]);

        // TEST CODE FOR METHOD 1: totalElements
        int[][] testArr1 = {{5, 2}, {1, 3}, {7, 9}};
        System.out.println(totalElements(testArr1));
        int[][] testArr2 = {{1, 2, 3}, {6, 5, 4}};
        System.out.println(totalElements(testArr2));
        int[][] testArr3 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(totalElements(testArr3));
        int[][] testArr4 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(totalElements(testArr4));
        int[][] testArr5 = {{4, 5, 2, 4, 1}, {1, 9, 7, 8, 2}, {8, 10, 13, 4, 3}};
        System.out.println(totalElements(testArr5));
        int[][] testArr6 = {{4, 5, 2, 4, 8, 9, 10}, {1, 9, 7, 8, 6, 1, 2}};
        System.out.println(totalElements(testArr6));
        int[][] testArr7 = {{4}, {7}, {8}, {2}};
        System.out.println(totalElements(testArr7));
        int[][] testArr8 = {{4}};
        System.out.println(totalElements(testArr8));

        System.out.println();

        // TEST CODE FOR METHOD 2: fourCorners
        String[][] words = {{"hi", "bye", "stuff", "go"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        fourCorners(words);
        System.out.println("--------------");

        String[][] words2 = {{"time", "up", "bye"}, {"hi", "hit", "up"}, {"map", "bam", "low"}, {"bow", "mom", "joy"}};
        fourCorners(words2);
        System.out.println("--------------");

        String[][] words3 = {{"time"}};
        fourCorners(words3);
    }

    public static int totalElements(int[][] numArray)
    {
        int count = 0;
        for (int[] arr : numArray){
            for (int num : arr){
                count ++;
            }
        }
        return count;
    }

    // Write the fourCorners below to print out the elements
    // in each of the four corners of strArray, one per line:
    // top left, then top right, then bottom left, then bottom right
    public static void fourCorners(String[][] strArray)
    {
        int numRows = strArray.length;
        int numColumns = strArray[0].length;
        System.out.println(strArray[0][0]);
        System.out.println(strArray[0][numColumns - 1]);
        System.out.println(strArray[numRows - 1][0]);
        System.out.println(strArray[numRows - 1][numColumns - 1]);
    }
}
