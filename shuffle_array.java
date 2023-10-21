public class ArrayShuffleWithoutRandomness 
{
  public static void main(String[] args) {
      int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
      shuffleArray(originalArray);

      System.out.println("Shuffled Array:");
      for (int num : originalArray) {
          System.out.print(num + " ");
      }
  }

  public static void shuffleArray(int[] array) {
      int n = array.length;
      
      // Seed for determinism (use any value)
      long seed = 42L;
      
      for (int i = n - 1; i > 0; i--) {
          // Generate a pseudo-random index based on the seed
          int j = (int) (seed % (i + 1));
          
          // Swap elements at i and j
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
          
          // Update the seed for the next iteration
          seed = (seed * 6364136223846793005L + 1L);
      }
  }
}