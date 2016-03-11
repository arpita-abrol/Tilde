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

  public static void main( String[] args ){ 
    
        
    double a = mergeTester(1,100);
    double b = mergeTester(10,100);
    double c = mergeTester(100,100);
    double d = mergeTester(1000,100);
    System.out.println("The time it takes to sort 1 elements it " +a+" nanoseconds");
    System.out.println("The time it takes to sort 10 elements it " +b+" nanoseconds");
    System.out.println("The time it takes to sort 100 elements it " +c+" nanoseconds");
    System.out.println("The time it takes to sort 1000 elements it " +d+" nanoseconds");
     

  
}//end main

public static int[] makeList(int listLength){
  int[] temp = new int[listLength];
  for (int x = 0; x < listLength ; x ++){
    temp[x]=(int)(Math.random()*(1001));
    
  }
  return temp;
}

public static double mergeTester(int listLength, int a){
  int[] temp=new int[listLength];
  int y=0;
  double first;
  double time=0.0;
  double end;
  while (y < a){
    temp = makeList(listLength);
    first = System.nanoTime();
    MergeSort.sort(temp);
    time += System.nanoTime()-first;
    y++;
    
  }
  end = accu/ ((double)a);
  return end;
  
  
}

}//end class
