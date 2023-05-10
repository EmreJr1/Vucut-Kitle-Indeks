import java.util.Scanner;

public class Vucut_kitle_indeks_hesaplama {

    public static void main(String[] args) {

        /*Kullanıcı girdilerini tanımlıyoruz*/
        int kilo;
        double boy;

        /*Kullanıcıdan verileri alıyoruz*/
        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu Metre Cinsinden Giriniz =");
        boy = input.nextDouble();

        System.out.print("Kilonuzu Giriniz =");
        kilo = input.nextInt();


         /*Kullanıcıya sonuc çıktısını iletiyoruz*/
        System.out.println("Vücut Kitle İndeksiniz ="+(kilo/(boy*boy)));



    }
}
