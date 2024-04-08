import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        // 2. Fibonacci ardicilliginda n-ci ededi qaytaran rekursiv metod yazin.
        //ardicilliqdaki necenci ededi istediyimizi parametrde oturmeliyik.


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

