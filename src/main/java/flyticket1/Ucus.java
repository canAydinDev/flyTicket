package flyticket1;

import java.util.Scanner;

public class Ucus {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("Yolcunun adini soyadini giriniz");
        String name= input.nextLine();
        System.out.println("hangi sehre gireceginizi giriniz");
        String city= input.next().substring(0,1);
        System.out.println("yasinizi giriniz");
        int age= input.nextInt();
        System.out.println("tek yon ise ==> t , gids donus ise ==> d giriniz");
        String yon= input.next().substring(0,1);


        YolcuBilgisi yolcu1=new YolcuBilgisi(name,city, age, yon);

        int km=City.kmCevir(yolcu1.city);
        int kmSonFiyat=Km.kmFiyatHesapla(km);

        double yasCevir=Age.yasCevir(yolcu1.age);
        kmSonFiyat=Age.yasaIndirimYap(age,kmSonFiyat);

        boolean rotaYonu=Km.yonBul(yolcu1.yon);
        double enSonFiyat=Km.gidisDonusIndirim(rotaYonu,kmSonFiyat);

        System.out.println("Adi-soyadi: "+ yolcu1.name+"\ngidecegi sehir: "+yolcu1.city+"\nyolcu yasi: "+yolcu1.age+"\nbilet ucreti: "+enSonFiyat);






    }
}
