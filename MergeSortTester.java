//Arpita Abrol, Kyle Moon, Stanley Zeng
//APCS2 pd10
//HW11 -- Wrapping It Up
//2016-03-11

/*======================================
  class MergeSortTester

  ALGORITHM:



  BIG-OH CLASSIFICATION OF ALGORITHM:
  MergeSort is an O(n(log(n)) notation.
  It is a 'divide and conquer' type of sort- in order to be able to sort efficiently it requires that the array be split up into smaller arrays, which are sorted.
  These arrays are obtained by splitting the original array into arrays half the size, until the arrays are all of length 1.
  Since we're splitting everything in half, there will be log(n) splits.
  Once they are length 1, they are sorted since they are the only number in the array.
  Then we start merging adjacent lists, doubling the size.
  They are compared while being kind, so that the array remains sorted while increasing in size.
  Since we are comparing each element of the list individually, there will be n amount of merges.
  This means the complete runtime for the algorithm will be the splits * the number of elements.
  This results in O(n(log(n)).


  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 5955.34 nanoseconds
  n=10      time: 6521.12 nanoseconds
  n=100     time: 21956 .05 nanoseconds
  ...
  n=<huge>  time: 224717.12 nanoseconds

  ANALYSIS:
  

  ======================================*/
import java.util.Arrays;

public class MergeSortTester
{

    /*
      First create some arrays filled with random integers
      Time how long mergeSort takes
      Repeat for desired batch size
    */

    public static int[] makeList(int size) //makes a list of random integers
    {
        int[] temp = new int[size];
        for (int i = 0; i < size ; i++)
        {
            temp[i] = (int)(Math.random() * 1001);
        }
        return temp;
    }

    //Returns mean timings for mergeSort
    public static double mergeTester(int size, int a) //a is the # of trials
    {
        double totalTime = 0.0;

        for (int i = 0; i < a; i++)
        {
            int[] arr = makeList(size);

            double temp = System.nanoTime();
            MergeSort.sort(arr);

            totalTime += (System.nanoTime() - temp) ;
        }

        double avgTime = totalTime / ((double)a);

        return avgTime;
    }

    public static double mergeTester(int size)
    {
        return mergeTester(size, 100);
    }

    public static void main( String[] args )
    {
        System.out.println();
        System.out.println("Mean execution times for dataset of size n:");
        System.out.println("Batch size: 100");
        System.out.println("Time in nanoseconds.\n\n");

        for (int i = 1; i < 1001; i = i * 10)
        {
            System.out.println("n = " + i);
            System.out.println("time: " + mergeTester(i));
            System.out.println();
        }

    }//end main

}//end class
