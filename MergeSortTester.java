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
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>


  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {

    }//end main

}//end class
