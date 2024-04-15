import java.util.Scanner;
//Verilen stringin tersini geri qaytaran method yazin
public class task1 {
    public static void main(String[] args) {


        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Tersine cevirmek ucun String yazin: ");
            String verilenString = scanner.next();
            String cavab= stringinTersiniGeriQaytarmaq(verilenString);
            System.out.println(cavab);
        }
    }
    public static String stringinTersiniGeriQaytarmaq (String verilenString){
        String cavab=null;
        cavab = new String();
        for(int i=verilenString.length()-1;i>=0;i--){
            cavab+=verilenString.charAt(i);
        }
        return cavab;
    }
}
