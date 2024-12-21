import java.util.Scanner;

/**
   This program demonstrates the search method in
   the IntBinarySearcher class.
*/

public class Main
{
   public static void main(String [] args)
   {
      int result, searchValue;
      String input;

      // An array of numbers to search.
      int numbers[] = { 536, 289, 296, 429, 319, 142, 394,
                        101, 388, 147, 417, 199, 207, 222,
                        189, 310, 447, 521, 234, 600};

      // Create a Scanner object to read keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // First we must sort the array in ascending order.
      IntQuickSorter.quickSort(numbers);

      do
      {
         // Create our benchmarker objects.
         SeqSearchBenchmarker ssearch = 
                  new SeqSearchBenchmarker(numbers);

         BinarySearchBenchmarker bsearch =
                  new BinarySearchBenchmarker(numbers);

         // Get a value to search for.
         System.out.print("Enter a value to search for: ");
         input = keyboard.nextLine();
         searchValue = Integer.parseInt(input);

         System.out.println("Using the Sequential Search...");

         // Search for the value using the sequential search.
         result = ssearch.search(searchValue);

        // Display the results.
        if (result == -1)
           System.out.println(searchValue + " was not found.");
        else
        {
           System.out.println(searchValue + " was found at " +
                              "element " + result);
        }

        // Display the number of comparisons
        System.out.println(ssearch.getComparisons() +
                           " comparisons were made.");

        System.out.println("Using the Binary Search...");

        // Search for the value using the binary search.
        result = bsearch.search(searchValue);

        // Display the results.
        if (result == -1)
           System.out.println(searchValue + " was not found.");
        else
        {
           System.out.println(searchValue + " was found at " +
                              "element " + result);
        }

        // Display the number of comparisons
        System.out.println(bsearch.getComparisons() +
                           " comparisons were made.");

        // Does the user want to search again?
        System.out.print("Do you want to search again? (Y or N): ");
        input = keyboard.nextLine();
      } while (input.charAt(0) == 'y' || input.charAt(0) == 'Y');
   }
}
