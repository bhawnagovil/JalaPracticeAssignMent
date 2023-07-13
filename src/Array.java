import java.util.*;

public class Array {

    public int addArrayNumbers(int[] arr) {
        int sum = 0;
        //for( int i: arr.length) why not working means whenever we have some condition we have to use the next for loop only?
        // for(int i: arr)
        //sum= sum+i
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;

    }

    public double averageValueOfArrayIntegers(int[] arr) {
        int sum = 0;
        double average = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
            average = (double) (sum) / (double) (size);
        }
        return average;
    }

    public void findIndexValueOfArrayNumber(int[] arr, int n) {
        //System.out.println("arr = " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("index of the number " + i);
            }

        }
    }

    public void findSpecificValuesInArray(int[] arr, int n) {
        boolean val = false;
        for (int i : arr) {
            if (i == n) {
               val= true;
            }

        }
         if(val){
             System.out.println("array contains the specific value");
            // System.out.println(Arrays.toString(arr)); // question here after removing comment non static method having reference of static

         }
         else{
             System.out.println("array does not contain the specific value");
         }

    }
    /*public void RemoveElementFromArray(int[] arr, int n){
        for (int i : arr) {
            if (i == n){

            }
    }*/
     static void copyingArray(int[] arr){
         int[] copy= arr;
         //System.out.println("Array after copy: " + Arrays.toString(copy));
     }

     public void InsertElementArray(int[]arr, int value, int pos){
         for(int i=arr.length-1; i>= pos-1; i--){
             arr[i]= arr[i-1];
         }
         arr[pos-1]= value;
         for(int i=0; i<arr.length; i++)
         {
             System.out.println(arr[i]+ " ");
         }
     }
     public void takingInputProgram(){
         int n;
         Scanner sc= new Scanner(System.in);
         System.out.println("enter the number of element you want too store");
          n =  sc.nextInt();
         System.out.println("Enter the element of the array");
         int []  given_array=  new int[n];
         for ( int i= 0; i<n; i++){
             System.out.printf("given_array[%d]= ", i);// what is the method doing
             given_array[i]= sc.nextInt();
         }

         //System.out.println("my_arr = " + Arrays.toString(my_arr)); this is not working


     }

     public void findMinimumMaximumValue(int [] arr){
         int max= arr[0];
       for(int i=0; i<arr.length; i++) {
           if(arr[i]>max){
               max= arr[i];
           }

       }
          System.out.println(max);
         //System.out.println("my_arr = " + Arrays.toString(arr));
         //return max;

     }

     public void findCommonValueInTwoArray(int[]arr1,int[]arr2){
         for(int i=0; i<arr1.length; i++){
             for(int j=0; j<arr2.length; j++){
                 if(arr1[i]==arr2[j]){
                     System.out.println("common value is " + arr2[i]);
                 }
             }
         }
     }
     public void FindEvenOddNumber(int[]arr){
         System.out.println(java.util.Arrays.toString(arr));
         for(int i=0; i<arr.length; i++){
             if(arr[i]%2==0){
                 System.out.println(arr[i]+ " number is even");
             }
             else{
                 System.out.println(" number is odd");


             }
         }
     }
     public void FindDuplicateValuesInArray(int[]arr1) {
         System.out.print(java.util.Arrays.toString(arr1));
         for (int i = 0; i < arr1.length; i++) {
             for (int j = 1 + 1; j < arr1.length; j++) {
                 if (arr1[i] == arr1[j]) {
                     System.out.println(arr1[i]);
                 }

             }
         }
     }
         public void fidMaximumMinimumDifference(int[] arr){
             System.out.println(java.util.Arrays.toString(arr));
             int max=arr[0];
             int min= arr[1];
             int difference;
             for(int i: arr){
                if(i> max) {
                    max= i;
                }
                else if(i<min){
                    min= i;
                }

             }
             difference= max-min;
             System.out.println("maximum and minimum value of the array: " + max + " ," + min);
             System.out.println("\nDifference between smallest and largest number is "+ difference);

         }
      public void fidMaximumMinimum(int[] arr){

          System.out.println(java.util.Arrays.toString(arr));
          int max=arr[0];
          int min= arr[1];
          for(int i: arr){
              if(i> max) {
                  max= i;
              }
              else if(i<min){
                  min= i;
              }

          }
          System.out.println("minimum and maximum value of the array are" + ", "+ min + "," + max);
      }
       public void missingNumber(int[] arr) {
        //Sorting Array
        Arrays.sort(arr);
        System.out.println("a[] = " + Arrays.toString(arr));
        int j = 0;
        for (int i = 1; i < 100; i++) {
            if (j < arr.length && i == arr[j])
                j++;
            else
                System.out.print(i + " ");
        }
    }

      public  void removeDuplicateElementFromArray(int[]arr){
          System.out.println(java.util.Arrays.toString(arr));
          int[]temp= new int[arr.length];
          int j=0;
          for(int i=0; i<arr.length-1; i++) {
              if (arr[i] != arr[i+1]) {

                  temp[j] = arr[i];
                  j++;
              }
              temp[j] = arr[arr.length - 1];
          }
             for(int i=0; i<temp.length; i++ ){
                 System.out.println(temp[i]+" ");
              }
          }
     public int[] removeGivenElementFromArray(int[]arr,int index){
         System.out.println(java.util.Arrays.toString(arr));
         //If the array is empty or the index is not in array range return the original array
         if (arr == null || index < 0 || index >= arr.length) {
             return arr;}
         int[] anotherarray= new int[arr.length-1];
         for(int i=0; i<arr.length-1; i++){
             if(i==index){
                 continue;
             }
             else{
                 anotherarray[i]= arr[i];
                 i++;
             }
         }
         return anotherarray;
         }










        public static void main(String[]args){
            Array obj2 = new Array();
            //System.out.println(obj2.addArrayNumbers(new int[] {3,4,5,6,7,8}));
            //System.out.println(obj2.averageValueOfArrayIntegers(new int[] {1,2,3,4,5}));
            //obj2.findIndexValueOfArrayNumber(new int[]{2, 3, 4, 5,}, 5);
            //obj2.findSpecificValuesInArray(new int[]{2, 3, 4, 5, 6}, 5);
            //obj2.InsertElementArray(new int[]{1,2,3,4,5}, 50, 3);

            //obj2.findMinimumMaximumValue(new int [] {1,2,34,5,});
             obj2.findCommonValueInTwoArray(new int[]{2,7,3,4}, new int[]{1,7,6,7});
            //obj2.FindEvenOddNumber(new int[] {2,4,6,7});
            //obj2.FindDuplicateValuesInArray(new int[]{1,2,2,3,4});
            //obj2.fidMaximumMinimumDifference(new int []{ 1,2,3,4,5});
            //obj2.fidMaximumMinimum(new int[] {1,2,3,4,5});
            //obj2.removeDuplicateElementFromArray(new int[]{1,2,2,3,4,5});
            //System.out.println(obj2.removeGivenElementFromArray(new int[]{1,2,3,4,5}, 3));
            //obj2.missingNumber(new int[] {10,20,30,40,60,40,70,80,90});







        }
    }

