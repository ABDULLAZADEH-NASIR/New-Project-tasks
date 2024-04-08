import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {

//1. Binary search eden rekursiv method yazin, method parametrinde integer array ve
//number alib, arrayin icinde hemin numberi binary search ile tapmalidir.


        while (true) {
            int[] array = {1,10,8,7};
            System.out.println("Enter search number: ");
            int n = new Scanner(System.in).nextInt();
            binarysearchnumber(array, n);
        }
    }

    public static void binarysearchnumber(int [] array, int n) {
        for(int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        int minIndex = 0;
        int maxIndex = array.length - 1;

        while (maxIndex >= minIndex) {
            int average = (maxIndex + minIndex) / 2;

            if (array[average] == n) {

                System.out.println("Eded movcuddur: ");
                return;

            } else if (average < n) {
                minIndex = average + 1;
            } else {
                maxIndex = average - 1;
            }
        }
        System.out.println("Eded movcud deyil: ");
    }

}

