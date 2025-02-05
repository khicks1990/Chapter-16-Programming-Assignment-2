/**
   The BinarySearchBenchmarker class performs a binary
  search on an int array and records the number of comparisons
  it makes.
*/

public class BinarySearchBenchmarker
{
  private int array[];      // Array of values to search
  private int comparisons;  // Number of comparisons made

  /**
    The constructor initializes the array and the
    comparisons counter.
    @param values The array to search.
  */

  public BinarySearchBenchmarker(int values[])
  {
    array = values;
    comparisons = 0;
  }

   /**
      The search method performs a binary search on array. 
    The array is searched for the number passed to
      value. If the number is found, its array subscript is
      returned. Otherwise, -1 is returned indicating the
      value was not found in the array. The number of
    comparisons made is also recorded.
      @param value The value to search for.
   */

   public  int search(int value)
   {

   }

  /**
    getComparisons method
    @return The number of comparisons made.
  */

  public int getComparisons()
  {
    return comparisons;
  }
}