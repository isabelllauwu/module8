import java.util.Random;

public class Main {
   

        public static void main(String[] args)
      {   
          Random rand = new Random();
          int[] arr = new int[200000000];
          for (int i = 0; i < arr.length; i++) {
          arr[i] = rand.nextInt(10) + 1;
        }
          long start = System.currentTimeMillis();
        System.out.println(Summation.sum(arr));
        System.out.println("One Thread(Single)!: " + (System.currentTimeMillis() - start));
          start = System.currentTimeMillis();
        System.out.println(Summation.parallelSum(arr));
        System.out.println("Parallel!: " + (System.currentTimeMillis() - start));
        
        }
        
        }
        

