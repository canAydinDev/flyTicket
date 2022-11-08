package flyticket1;

public class City {

    public static int kmCevir(String sehir){
        int km=0;
        if (sehir.equalsIgnoreCase("A")){
            km=500;
        } else if (sehir.equalsIgnoreCase("B")) {
            km=700;
        } else if (sehir.equalsIgnoreCase("C")) {
            km=900;
        }
        return  km;
    }
}