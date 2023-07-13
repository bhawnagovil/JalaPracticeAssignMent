import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LoopAssignment3 {

    public void printBrightItCareer() {

        for (int i = 0; i < 11; i++) ;
    }

    public void whielePrintTwenty() {
        int i = 1;
        while (i < 21) {
            System.out.println(i);
            i++;
        }
    }

    public void printOddAndeven() {
        int[] arraynumbers = {1, 2, 4, 7, 6, 5, 9, 10, 11, 12,};
        for (int i = 0; i < arraynumbers.length; i++) {
            if (arraynumbers[i] % 2 == 0) {
                System.out.println(arraynumbers[i]);// How can I save them in an array and print them?
            }
        }
    }

    public void largestAmongThree() {
        int[] arraynumbers_2 = {6, 5, 9};
        for (int i = 0; i < arraynumbers_2.length; i++) {
            int largestnumber = arraynumbers_2[0];
            if (arraynumbers_2[i] > largestnumber) {
                largestnumber = arraynumbers_2[i];
                System.out.println(largestnumber);
            }
        }
    }

    public void printEvenNumbersBetweenTenToHundred() {
        int i = 10;
        while (i < 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public void DoWhileprintOneToTen() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 11);

    }

    public ArrayList<Integer> findPrimeNumbers(int[] array) {
        ArrayList<Integer> primes = new ArrayList<>();


        return null;
    }

    public ArrayList<Integer> printAllEvenNumbers() {

        return null;
    }

    public void printEvenOddNumberArray(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("even numbers" + array[i]);
            } else {
                System.out.println("odd numbers" + array[i]);

            }

        }

    }

    public void findPrimeNumber(int num) {

        boolean val = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                val = false;
                break;
                //System.out.println(num + "is not a prime number");
            } //else {
               // System.out.println(num + "is a prime number");
               // break;

        }
        if(val==true){
            System.out.println(num + "is a prime number");
        }
        else{
            System.out.println("not prime number");
        }
    }

    public void findPrimeNumbersFromArray(int[] array) {

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            boolean val = true;
            for (int j = 2; j < array[i]; j++) {
                if (array[i] / j == 0) {
                    val = false;
                    System.out.println(array[i] + " " + "is not a prime number");
                } else {
                    System.out.println(array[i] + " " + "is a prime number");
                }
            }
        }
    }

    public void printEvenNumbersFromOneToHundred() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("even number is" + " " + i);
            } else {
                System.out.println("odd number is" + " " + i);
            }

        }
    }

    public void SwitchFindEvenOrNot() {
        int n;
        System.out.println("Enter any number");
        Scanner number = new Scanner(System.in);
        n = number.nextInt();
        switch (n % 2) {
            case 0:
                System.out.println(n + " " + "is a even number");
                break;
            case 1:
                System.out.println(n + " " + "is a odd number");
                break;
        }

    }

    public void switchM_F() {

        System.out.println("Choose M/F  :");
        Scanner choice = new Scanner(System.in);
        //The Java String class "charAt()" method returns a char value at the given index number.
        char gender = choice.next().charAt(0);
        switch (gender) {
            case 'M':
                System.out.println(gender + " " + "is a Male'");
                break;
            case 'F':
                System.out.println(gender + " " + "is a female");
                break;

        }

    }

    public boolean IsPalindrome(String str) {
        String rev = " ";
        boolean ans = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            str = str.toLowerCase();
            rev = rev + str.charAt(i);
            if (str.equals(rev)) {
                ans = true;
            }

        }
        return ans;
    }

    public int FindLargestNumberInArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
       return max;
    }
    public void FindLargestNumberInGivenThreeNumber(){
        int a= 20, b=40, c=30;
        if(a>b && a>c){
            System.out.println( a + " is the largest number");}
            else if(b>a && b>c){
                System.out.println(b + " is the largest number");
            }
            else{
            System.out.println(c + " is the largest number");
        }

    }


    public static void main(String[] args) {
        LoopAssignment3 obj1 = new LoopAssignment3();
            /*obj1.printBrightItCareer();
            obj1.whielePrintTwenty();
            obj1.printOddAndeven();
            obj1.largestAmongThree();
            obj1.printEvenNumbersBetweenTenToHundred();
            obj1.DoWhileprintOneToTen();
            obj1.printEvenNumbersFromOneToHundred();*/
        //System.out.println(obj1.IsPalindrome("Mike"));
        //SwitchFindEvenOrNot();
        //obj1.switchM_F();
        //int[] array={1,2,3,4,5,6};*/
        //obj1.printEvenOddNumberArray(new int[]{1,2,3,4,5,6});
        //obj1.findPrimeNumbersFromArray(new int[] {3,4,5,6,7,8});
        obj1.findPrimeNumber(5);
        //System.out.println(obj1.FindLargestNumberInArray(new int[]{1, 3, 4, 5, 6, 7}));
       // obj1.FindLargestNumberInGivenThreeNumber();


    }
}








