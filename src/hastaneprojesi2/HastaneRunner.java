package hastaneprojesi2;

public class HastaneRunner {

    public static void main(String[] args) {
        //Hastane hastane1= new Hastane();
        String hastaDurumu;
        String unvan = doktorUnvan("Allergist");

    }

    /**
     * bu metod da hastanin on muayenesi sonucunda String tipinde girilen aktuel duruma gore doktor unvanlari ile uyusan bir
     * string ismi doner. takiben bu doktor unvanina verilen bu deger ile doktorBul(String unvan) metoduna giris yapilarak
     * uygun olan doktorlardan secim yapar
     *
     * @param aktuelDurum
     * @return
     */
    public static String doktorUnvan(String aktuelDurum) {
        /**
         * If aktuelDurum  Allerji return Allergist
         *  If aktuelDurum  Bas agrisi return Norolog
         *  If aktuelDurum  Diabet return Genel cerrah
         * If aktuelDurum  Soguk alginligi return Cocuk doktoru
         *  If aktuelDurum  Migren return Dahiliye
         *  If aktuelDurum  Kalp hastaliklari return Kardiolog
         *  else return yanlis unvan
         * Sonra bu methodunuzu unvan variable iniza atayiniz
         */

        return aktuelDurum;
    }
    public static Doktor doktorBul(String unvan){
        Doktor doktor= new Doktor();
        /**
         * Simdi loop kullanarak unvaninizla Doktor objenizin tum variablelarini set
         * ediniz VeriBankasindan gelen bilgilerle
         * Ve return doktor;
         */
        return doktor;
    }

    /**
     * doktor unvandan donen aktuel durum gibi bir string verildiginde bize aktuel durumun default olarak bize acil mi mi yoksa
     * acildegilmi boolean degerini set eder. dolayisi ile aslinda buraya girilen aktuel duruma karsilik gelen durum objesini set
     * etmis olur ve geriye durum objesi dondururuz.
     * @param aktuelDurum
     * @return
     */
    public static Durum hastaDurumuBul(String aktuelDurum){
        /**
         *  Ve Durum classindan bir Obje olusturunuz
         *  Durum hastaDurumu = new Durum();
         *  Sonra asagidaki adimlari sirasi ile yapiniz ve tum durumlari set ediniz
         *  Switch veya if statement kullanabilirsiniz
         *  case " Allerji":  aciliyet => false
         *  case " Bas agrisi":  aciliyet => false
         *  case " Diabet":  aciliyet => false
         *  case " Soguk alginligi":  aciliyet => false
         *  case " Migren":  aciliyet => true
         *  case " Kalp hastaliklari":  aciliyet => true
         *  default:
         *  System.out.println(“Gecerli bir durum degil");
         *  Ve return hastaDurumu;
         */
        return new Durum();
    }

    /**
     * Actuel case ile veri tabanindan bu hastalik durumunda bulunan hastalari bize listelememizi saglar.
     * Ana ekranda bulunan sekmeden hasta bul sekmesine girildiginde bize actual case soracak ve alinan case durumuna gore
     * database de bu durumdaki hastalari geri dondurur ve secilen numarali hastanin bilgilerini hasta olarak bize geri
     * doner bu noktadan sonra verilen hastaya islem yapilmasi saglanabilr. bu iki ekranda (Kayit ve doktor) bolumlerinden secilebilir.
     * eger doktor ekranindan secildi ise ona verilen durumlar ve son durumu set edilebilir.
     * Kayit tarafindan secildi ise hastanin durumu iptal yada devam ediliyor olarak secilebilir.
     * @param actualCase
     * @return
     */
    public static Hasta hastaBul(String actualCase){
        /**
         *  Burada Hasta objesi olusturunuz Hasta classindan
         *  Hasta hasta = new Hasta();
         *  Loop kullaniniz ve aktuelDurumu kiyaslayiniz Data classindan
         *  Hasta bilgilerini kullaniniz ve tum Hasta Objesindeki bilgileri set ediniz
         *  Ve sonra hastaDurumuBul method unu cagiriniz ve Durum Objesini set
         * ediniz
         *  Son olarak return hasta;
         */
        return new Hasta();
    }
    /**
     * Gereken adimlari izlediginizde
     * Basarili bir şekilde Doktor ve Hasta
     * objelerinizi set edebilirsiniz
     * hastane1.setDoctor
     * hastane1.setPatient
     * using doktorBul(unvan)
     * hastaBul(aktuelDurum)
     */

    /**
     * Son olarak hepsini consola yazdiriniz
     *  String patientCase = "Allerji“;
     *  "Bas agrisi",
     *  "Diabet",
     *  "Soguk alginligi",
     *  "Migren",
     *  "Kalp hastaliklari",
     */


}
