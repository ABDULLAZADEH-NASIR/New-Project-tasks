import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
      /*  int [] arr={1,2,3,4,5,6,7,8,9,10};
        int [] array=new int[arr.length-1];

        for(int i=0;i<arr.length-1;i++){
            if(i<arr.length/2){
                array[i]=arr[i];
            }
            else {
                array[i]=arr[i+1];
            }
        }
         for(int element:array){
             System.out.print(" "+element);
         }



        int [] array={1,2,3,4,5};
        int []arr2=new int[array.length-1];
        int deleteElement=3;

        for(int i=0;i<array.length-1;i++){
            if(deleteElement>array[i]){
                arr2[i]=array[i];
            }
            else{
                arr2[i]=array[i+1];
            }
        }
        for(int element:arr2){
            System.out.println(element);
        }

*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Arrayin olcusunu teyin edin: ");
        int size = scanner.nextInt();
        int[] array = new int[size];


        for (int i = 0; i < array.length; i++) {
            int element = scanner.nextInt();
            array[i] = element;
            System.out.println(i + "  indexli elementin " + element);
        }

        Random random = new Random();
        int[] rm = new int[10];
        for (int i = 0; i < rm.length; i++) {
            rm[i] = random.nextInt(101);
            System.out.println("Random arrayin elementi " + rm[i]);
        }
        int count = 0;

        for (int i = 0; i < array.length; i++) {

            for (int m = 0; m < rm.length; m++) {
                if (array[i] == rm[m]) {
                    count++;

                }

            }
        }

        int[] newArray = new int[size];
        for (int i = 0; i < array.length; i++) {
            for (int f = 0; f < rm.length; f++) {
                if (array[i] == rm[f] ) {
                    newArray[i] = array[i];
                }
            }
        }
        System.out.println(Arrays.toString(newArray));

    }

}

