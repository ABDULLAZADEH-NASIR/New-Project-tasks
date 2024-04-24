import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
    public static void main(String[] args) {
       int [] arr={1,2,3,4,5,6,7,8,9,10};
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

    }

}