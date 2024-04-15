import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Arrayin olcusunu daxiol edin: ");
        int size=scanner.nextInt();
        int [] array=new int[size];



    }

    public static int [] arrayRegemleridaxiletmek(int []array){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Eded daxil edin: ");
        int eded=scanner.nextInt();
        for (int i=0;i<array.length;i++){
            array[i]=eded;
        }
        return array;
    }
}