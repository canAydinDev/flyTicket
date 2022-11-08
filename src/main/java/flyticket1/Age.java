package flyticket1;
public class Age {

    public static double yasCevir(int yas){
        double yasIndOrani=1;
        if (yas<12){
            yasIndOrani=0.5;
        } else if (yas>12&&yas<24) {
            yasIndOrani=0.9;
        } else if (yas>65) {
            yasIndOrani=0.7;
        }else{
            yasIndOrani=1;
        }
        return yasIndOrani;
    }

    public static int yasaIndirimYap(double yasIndOrani, int kmFiyat){
        double yasIndirimSonuc=kmFiyat*yasIndOrani;
        return (int)yasIndirimSonuc;
    }
}

