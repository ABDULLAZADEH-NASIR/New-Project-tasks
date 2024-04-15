import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        //Verilen stringin polindrom olub olmadigini check eden method yazin ("radar" -> true)
        while (true) {
            System.out.println("Polidrom olub olmadigini yoxlamag ucun String dasil edin: ");
            String verilenSoz = new Scanner(System.in).next();
            String yeniSoz = stringiTersineCervirmek(verilenSoz);
            polidromOlubOlmadiginiYoxlamaq(yeniSoz, verilenSoz);
        }
    }
    public static String stringiTersineCervirmek(String verilenSoz){
        String yeniSoz=null;
        yeniSoz=new String();
        for (int i=verilenSoz.length()-1;i>=0;i--){
            yeniSoz+=verilenSoz.charAt(i);
        }
        return yeniSoz;
    }
    public static void polidromOlubOlmadiginiYoxlamaq(String yenisoz,String verilenSoz){
        if(verilenSoz.equals(yenisoz)){
            System.out.println("Verilen polidrom sozdur ");
        }
        else {
            System.out.println("Verilen Polidrom soz deyil ");
        }
        return;
    }
}
