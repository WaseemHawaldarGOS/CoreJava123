package com.gos.oops.timecomplexity;

public class TimeComplexity {

    /*
    Below method demonstrates that time complexity for below program is Ο(1).
     */
    public void calculateTimeComplexityConstant() {
        int y = 3;
        int z = 5;
        int x = y+z;  //O(1) complexity
        System.out.println(x);
    }


    /*
    Below method demonstrates that time complexity for below program is O(n).
     */
    public void calculateTimeComplexityOofn() {
        long start = System.nanoTime();
        System.out.println("Begin time is "+start);
        int x = 3;
        int y = 5;
        System.out.println(x+y);
        System.out.println("Total time taken = "+(System.currentTimeMillis() - start)+"nano seconds");
    }

    /*
    Below method demonstrates that time complexity for below program is O(logn).
    */
    public int calculateTimeComplexityOoflogn(int arr[], int l, int r, int x) {

        if (r>=l)
        {
            int mid = l + (r - l)/2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return calculateTimeComplexityOoflogn(arr, l, mid-1, x);
            return calculateTimeComplexityOoflogn(arr, mid+1, r, x);
        }

        return -1;

    }


    /*
    Below method demonstrates that time complexity for below program is O(n2).
     */

    public void calculateTimeComplexityOnSquare(int[] integerArray){
        long start = System.nanoTime();
        System.out.println("Begin time is "+start);
        int i = 0;
        int n = integerArray.length;
        int j = 0;
        int sum = 0;


        while(i < n){
            j = 0;

            while(j < n){
                sum = sum + integerArray[i];
                j++;
            }
            i++;
        }
        System.out.println("Total time taken = "+System.nanoTime() +" nano seconds");
    }


    /*
    Below method demonstrates that time complexity for below program is O(n log n).
     */

    public void calculateTimeComplexityOofnLogn(int[] arr, int low, int high){
        if (arr == null || arr.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

// recursively sort two sub parts

        if (low < j)
            calculateTimeComplexityOofnLogn(arr, low, j);
        if (high > i)
            calculateTimeComplexityOofnLogn(arr, i, high);
    }


    public static void main(String[] args) {


        //**********************************************************************************************************************************

        /*
        Below block shows that time complexity is O(n)
         */
/*          TimeComplexity timeComplexity = new TimeComplexity();
        timeComplexity.calculateTimeComplexityOofn();*/


        //**********************************************************************************************************************************
        /*
        Below block shows that time complexity is O(log n)
         */
/*        TimeComplexity timeComplexity = new TimeComplexity();
        int arr[] = new int[5000];
        for(int i = 0; i< 5000; i++){
            arr[i] = i;
        }
        int x = 4999;//705333 nano seconds
        int n = arr.length;

        long start = System.nanoTime();
        System.out.println("Begin time is "+start);
        int result = timeComplexity.calculateTimeComplexityOoflogn(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " +  result);
        System.out.println("Total time taken = "+(System.nanoTime()- start)+" nano seconds");*/


        //**********************************************************************************************************************************
        /*
        Below block shows that time complexity is O(n square or n^2)
         */
/*        int[] inputArray = new int[20000];
        for(int i = 0; i < 20000 ; i++){
            inputArray[i] = i;
        }
        TimeComplexity timeComplexity = new TimeComplexity();
        timeComplexity.calculateTimeComplexityOnSquare(inputArray);*/


        //**********************************************************************************************************************************
        /*
        Below block shows that time complexity is O(n log n)
         */
/*        int[] x = { 9, 2, 4, 7, 3, 7, 10 };
        System.out.println(Arrays.toString(x));
        int low = 0;
        int high = x.length - 1;
        TimeComplexity timeComplexity = new TimeComplexity();

        timeComplexity.calculateTimeComplexityOofnLogn(x, low, high);
        System.out.println(Arrays.toString(x));*/


        //**********************************************************************************************************************************
        /*
        Below block shows that time complexity is O(1)
         */
        TimeComplexity timeComplexity = new TimeComplexity();
        timeComplexity.calculateTimeComplexityConstant();

    }


}
