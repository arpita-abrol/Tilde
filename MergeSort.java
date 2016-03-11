/*
  Team Tilde -- Arpita Abrol, Stanley Zeng, Kyle Moon
  APCS2 pd10
  HW11 -- Wrapping Up
  2016-03-10
*/

/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:

  Uses a divide and conquer method to
  sort an array of integers.

  Main idea:
  1. Break up the list into sublists.
  2. Sort those sublists.
  3. Merge sublists back to original list.

  ======================================*/

import java.lang.Math;

public class MergeSort
{

    /******************************************************
     * int[] merge(int[],int[])
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and
     * output array sorted in ascending order.
     ******************************************************/

    private static int[] merge( int[] a, int[] b )
    {
        int[] fin = new int[a.length+b.length];

        int aLen = 0;
        int bLen = 0;

        /*
        for( int i = 0; i < (a.length+b.length); i++ ) {
            if (aLen < a.length && bLen < b.length) {
                if( a[aLen] < b[bLen] ) {
                    fin[i] = a[aLen];
                    aLen += 1;
                }
                else{
                    fin[i] = b[bLen];
                    bLen += 1;
                }
            }
            else if( aLen < a.length ) {
                fin[i] = a[aLen];
                aLen += 1;
            }
            else{
                fin[i] = b[bLen];
                bLen += 1;
            }
        }
        */

        int i = 0;

        while (aLen < a.length && bLen < b.length)
        {
            if (a[aLen] < b[bLen])
            {
                fin[i++] = a[aLen++];
            }
            else
            {
                fin[i++] = b[bLen++];
            }
        }

        while (aLen < a.length)
        {
            fin[i++] = a[aLen++];
        }

        while (bLen < b.length)
        {
            fin[i++] = b[bLen++];
        }

        return fin;
    }//end merge()


    /******************************************************
     * int[] sort(int[])
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/

    public static int[] sort( int[] arr )
    {
        //printArray( arr );

        int arrL = arr.length;

        if( arrL <= 1 )
        {
            return arr;
        }

        int mid = arrL / 2;

        int[] a = new int[mid]; //Left half
        int[] b = new int[arrL - mid]; // Right half

        //Sort left
        for( int i = 0; i < a.length; i++ )
        {
            a[i] = arr[i];
        }

        //Sort right
        for( int i = mid; i < arrL; i++ )
        {
            b[i - mid] = arr[i];
        }

        a = sort( a );
        b = sort( b );

        //printArray(merge( a, b ));
        return merge( a , b );

    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
        for( int i = 0 ; i<a.length; i++ )
            a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
        System.out.print("[");
        String s = "";
        for( int i : a )
        {
            s += ( i + ",");
        }
        s = s.substring (0, s.length() - 1);
        System.out.print(s);

        System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {


        int[] arr0 = {0};
        int[] arr1 = {1};
        int[] arr2 = {1,2};
        int[] arr3 = {3,4};
        int[] arr4 = {1,2,3,4};
        int[] arr5 = {4,3,2,1};
        int[] arr6 = {9,42,17,63,0,512,23};
        int[] arr7 = {9,42,17,63,0,9,512,23,9};

        int[] arr8 = {1,4,55,123,123,145,193};
        int[] arr9 = {2,5,11,45,122,123,222,422};

        System.out.println("\nTesting mess-with-array method...");
        printArray( arr7 );
        //mess(arr7);
        printArray( arr7 );

        System.out.println("\nMerging arr1 and arr0: ");
        printArray( merge(arr1,arr0) );

        System.out.println("\nMerging arr8 and arr9: ");
        printArray( merge(arr8,arr9) );



        System.out.println("\nSorting arr4-7...");
        printArray( sort( arr4 ) );
        printArray( sort( arr5 ) );
        printArray( sort( arr6 ) );
        printArray( sort( arr7 ) );
        /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
          ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class MergeSort
