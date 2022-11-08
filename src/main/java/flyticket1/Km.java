package flyticket1;

public class Km {

    public static int kmFiyatHesapla(int yol){
        double km=yol*0.1;
        return (int)km;
    }

    public static double gidisDonusIndirim(boolean gidisDonusMu,int fiyat){
        int sonFiyat=1;
        if (gidisDonusMu){
            sonFiyat=(int)(fiyat*0.8);
        }else{
            sonFiyat=fiyat;
        }
        return sonFiyat;
    }
    public static boolean yonBul(String yon){
        boolean ciftMi=false;
        if(yon.equalsIgnoreCase("g")){
            ciftMi=false;
        } else if (yon.equalsIgnoreCase("d")) {
            ciftMi=true;
        }
        return ciftMi;
    }
}
