
import java.util.Scanner;

/**
 *
 * @author Ibrahim Ali Metin
 */
public class Oyun {
    
   private static IskambilKart[][] kart = new IskambilKart[4][4];
        
    public static void main(String[] args) {
        
        
        kart[0][0] = new IskambilKart(5);
        kart[0][1] = new IskambilKart(1);
        kart[0][2] = new IskambilKart(2);
        kart[0][3] = new IskambilKart(6);
        kart[1][0] = new IskambilKart(7);
        kart[1][1] = new IskambilKart(1);
        kart[1][2] = new IskambilKart(4);
        kart[1][3] = new IskambilKart(8);
        kart[2][0] = new IskambilKart(6);
        kart[2][1] = new IskambilKart(3);
        kart[2][2] = new IskambilKart(4);
        kart[2][3] = new IskambilKart(8);
        kart[3][0] = new IskambilKart(5);
        kart[3][1] = new IskambilKart(7);
        kart[3][2] = new IskambilKart(2);
        kart[3][3] = new IskambilKart(3);
        
        //oyunTahtasi();
        
            oyunTahtasi();
        while(oyunBittiMi() == false){
            
            tahminEt();
            oyunTahtasi();
            
        }
    }
    public static void tahminEt(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci Tahmin (i ve j değerlerini bir boşluklu giriniz...):");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();
        
        kart[i1][j1].setTahmin(true);
        oyunTahtasi();
        
        System.out.print("İkinci Tahmin (i ve j değerlerini bir boşluklu giriniz...):");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();
        
        if (kart[i1][j1].getDeger() == kart[i2][j2].getDeger()){
            System.out.println("Doğru Bildiniz... TEBRİKLER");
            kart[i2][j2].setTahmin(true);
        }
        
        else{
            System.out.println("Yanlış Tahmin!!!");
            kart[i1][j1].setTahmin(false);
        }
       
    }
    
    public static boolean oyunBittiMi(){
        
        for (int i = 0 ; i<4; i++){
            for(int j = 0; j<4; j++){
                if(kart[i][j].isTahmin() == false){
                    return false;
                }
                
            }
        }
        
        return true;
    }
    
    public static void oyunTahtasi(){
        
        for(int i = 0; i<4 ; i++){
            System.out.println("____________________");
            for(int j = 0 ; j < 4 ; j++ ){
                
                if(kart[i][j].isTahmin()){
                    
                    System.out.print("  |" + kart[i][j].getDeger() + "|  ");
                }
                
                else{
                    
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }
        System.out.println("____________________");
        
    }
}
