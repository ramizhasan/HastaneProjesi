package hastaneprojesi2;

public class Doktor {

    private String isim;
    private String soyIsim;
    private String unvan;
    //buraya kadar olan degiskenler veri bankasinda tutuluyor.
    enum DOKTOR_DURUM {
        IZINLI,MUSAIT
    }


    /**
     *  1)Doktorun bir Id si, diploma numarasi, pozisyonu, mezuniyet tarihi gibi  bilgiler tutulabilir.
     *  2)Doktor unvanlari "enum" olarakta tutulabilir.
     *  3)doktorun musaitlik durum bilgisi olmali . (Izinli, Raporlu, ya da uygun   ) simdilik kisaca mesaide ya da izinli
     *    olarak iki secenek olabilir. Bu bilgiye hastane veri tabaninda tutulur ve bu bilgiyi kullanacaklar hastane sayfasi olabilir.
     *  ilgili girilen hastanin uygun doktora yonlendirilmesi esnasinda ilgili alanda musait doktorlar ve uzerlerine daha onceden atanmis
     *  hasta sayisina gore hastaya bir numara atanacak.
     *  4) Apllication in 2 adet giris kismi olabilir. Bunlarin ilki doktor. ikincisi ise kayit-kabul ekrani olabilir. Kyit kabul ekranindan
     *  hastanin giris ve atama islemleri yapilirken doktor bolumunden ise izin ve gelen hastalari teshis ve onlara yapilan islem bilgilerini
     *  girme yetkisine sahip olabilir. Bunlar   recete yazma, ameliyat tarihi verme gibi string tipinde bir data tutulabilir.
     *
     *

     */

    /**
     * =========DOKTOR MENUSU=================
     *      1.Doktor Ekle
     *      2.Doktor Lisesi Yazdir
     *      3.Unvandan Doktor Bulma
     *      4.Doktor Silme
     *      5.ANAMENU
     *      6.CIKIS
     *      7.Lutfen gecerli tercih Yapiniz..
     */

    /**
     * 1. Doktor Ekle============================
     *      Doktor ismi girin:
     *      Doktor Soyismi
     *      Doktor Unvani
     */
    /**
     *  2.Doktor Listesi Yazdir
     *      Unvan           Ismi        Soyadi
     *      ------------------------------------------
     *      Allergist       Nilson       Avery
     *      Kardiyoloji     Zeynep      Sibel
     *      Dahiliye        Alan        Pedro
     */
}
