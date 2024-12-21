/**
   The SeqSearchBenchmarker class performs a sequential
  search on an int array and records the number of comparisons
  it makes.
*/

public class SeqSearchBenchmarker
{
  private int array[];      // Array of values to search
  private int comparisons;  // Number of comparisons made

  /**
    The constructor initializes the array and the
    comparisons counter.
    @param values The array to search.
  */

  public SeqSearchBenchmarker(int values[])
  {
    array = values;
    comparisons = 0;
  }

   /**
      The search method searches array for a value.
      @param value The value to search for.
      @return The subscript of the value if found in the
              array, otherwise -1.
   */

   public int search(int value)
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