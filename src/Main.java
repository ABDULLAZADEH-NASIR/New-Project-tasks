
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      while(true) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Fibonacci duzulusundeki eded sirasini daxil edin: ");
         int n = scanner.nextInt();


         System.out.println(fibonacciIleEdediTapmag(n));
      }
   }


   public static int fibonacciIleEdediTapmag(int n){
      if(n<=2){
        return n-1;
      }

      return fibonacciIleEdediTapmag(n-1)+fibonacciIleEdediTapmag(n-2);

   }
}