package Homework2;

public class Task6 {
    public static void main(String[] args) {

        int array1[] = new int[]{1, 2, 3};
        int array2[] = new int[]{1, 2, 3};

        boolean areEqual = true;

        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    areEqual = false;
                    break;
                }
            }
        } else {
            areEqual = false;
        }
        if (areEqual) {
            System.out.println("Same");
        } else {
            System.out.println("not same");
        }
    }
}

