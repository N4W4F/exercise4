import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//      1. Write a Java program to test if the first and the last element of an array of
//      integers are same. The length of the array must be greater than or equal to 2.

        // I'm asking the user to enter the length of an array (more than 1),
        // then input each element
        int arrayLength;
        do {
            System.out.print("Write the length of the array, must be more than or equal 2: ");
            arrayLength = input.nextInt();
        } while (arrayLength < 2);

        int[] arr1 = new int[arrayLength];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Write element of index [" + i + "]: ");
            arr1[i] = input.nextInt();
        }

        System.out.println("Is "
                + arr1[0] + " = " + arr1[arr1.length - 1] + "? "
                + (arr1[0] == arr1[arr1.length -1]));

        System.out.println("------------------------------------------------");

//      2. Write a Java program to find the numbers greater than the average of the
//      numbers of a given array.

        int[] arr2 = {1, 4, 17, 7, 25, 3, 100};
        double avg = 0.0;

        for (int a : arr2) {
            avg += a;
        }
        avg /= arr2.length;

        System.out.printf("The average of the said array is: %.1f%n", avg);
        System.out.print("The numbers in the said array that are greater than average are: ");
        for (int a : arr2) {
            if (a > avg)
                System.out.print(a + ", ");
        }

        System.out.println("\n------------------------------------------------");

//      3. Write a Java program to get the larger value between first and last
//      element of an array of integers.

        int[] arr3 = {20, 30, 40};
        if (arr3[0] >= arr3[arr3.length - 1])
            System.out.println("Larger value between first and last element: " + arr3[0]);

        else System.out.println("Larger value between first and last element: " + arr3[arr3.length -1]);

        System.out.println("------------------------------------------------");

//      4. Write a Java program to swap the first and last elements of an array and
//      create a new array.

        //I'm using an array from the previous question
        int[] swappedArray = new int[arr3.length];

        swappedArray[0] = arr3[arr3.length - 1];
        swappedArray[swappedArray.length - 1] = arr3[0];

        for (int i = 1; i < arr3.length - 1; i++)
            swappedArray[i] = arr3[i];

        System.out.println("New array after swapping the first and last elements: "
                + Arrays.toString(swappedArray));

        System.out.println("------------------------------------------------");

//      5. Write a program that places the odd elements of an array before the even elements.

        ArrayList<Integer> oddFirst = new ArrayList<>();
        oddFirst.add(2);
        oddFirst.add(3);
        oddFirst.add(40);
        oddFirst.add(1);
        oddFirst.add(5);
        oddFirst.add(9);
        oddFirst.add(4);
        oddFirst.add(10);
        oddFirst.add(7);

        ArrayList<Integer> result = new ArrayList<>();

        // Add odd numbers first
        for (int o : oddFirst)
            if (o % 2 != 0)
                result.add(o);

        // Add even numbers next
        for (int e : oddFirst)
            if (e % 2 == 0)
                result.add(e);

        System.out.println(result);

        System.out.println("------------------------------------------------");

//      6. Write a program that test the equality of two arrays.

        int[] firstArray = {2, 3, 6, 6, 4};
        int[] secondArray = {2, 3, 6, 6, 4};

        System.out.println("Is the first array = the second array? "
                + Arrays.equals(firstArray, secondArray));
    }
}
