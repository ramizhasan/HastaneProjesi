package hastaneprojesi2;

public class VeriBankasi {

    VeriBankasi(){
        String[] doctorIsimleri = { "Nilson", "John", "Robert", "Marry", "Alan", "Mahesh"};
        String[] doctorSoyIsimleri= { "Avery", "Abel", "Erik", "Jacob", "Pedro", "Tristen"};
        String[] unvanlar = { "Allergist", "Norolog", "Genel cerrah", "Cocuk doktoru",
                "Dahiliye", "Kardiolog" };
        String[] hastaIsimleri = { "Warren", "Petanow", "Sophia", "Emma", "Darian",
                "Peter" };
        String[] hastaSoyIsimleri= { "Traven", "William", "George", "Tristan", "Luis",
                "Cole"};
        String[] durumlar= { "Allerji", "Bas agrisi", "Diabet", "Soguk alginligi", "Migren",
                "Kalp hastaliklari"};
        /*
            Bu loglamadan alinan veriler hasta clasinda olusturulan hastalog stringine atanir ve Hasta classi icnde ki
            metod yardimi ile gerkli aysristirma ve aramalar yapilabilir.
         */
        String[] hastaLoglari1 = {"hasta-ID-TarihSaat-DoktorID-yapilan islem-sonuc"};
        String[] hastaLoglari = {"hasta-ID-TarihSaat-DoktorID-yapilan islem-sonuc"};

        int [] hastaIDleri = {111,222,333,444,555,666};
    }
    private void shrink(){
        /*
        Silme islemi yapildiginda eski arrayi kopyalayarak yeni kucultulmus Arrayin icine atacak ne bu yeni arrayi geriye
        dondurecek
         */
    }
    private void grow(){
        /*
        text datasindan veriler tekrardan arraye atanirken yada yeni eleman kaydi yaparken egerki index son arrayin disina
        tasacak ise arrayi kopyalayip yeni bir arrayin icine atayacak.
         */
    }
    public void add(String[] arr , String arg){
        grow();
        /*
        yeni hasta yada yeni doktor kaydi yapilr iken icine verilen string ifadeyi arrnin son elemani olarak kopyalar.
         */
    }
    public void delete(String[] arr, int index){
        /*
        icine verilen arr nin indexindeki elemani siler ve arr yi tekrar duzenler.
         */
    }
    public int find(String[] arr, String ID){ int idx=-1;
        /*
        String olarak verilen array elemaninin bulunarak indexini dondurur.
         */
        return idx;
    }

    public static void main(String[] args) {
        Doktor dr = new Doktor();
        System.out.println(Doktor.DOKTOR_DURUM.MUSAIT);
    }
    /*
    burada hastalarin ve doktorlarin tum verilerinin kaydi tutulacaktir. Doktor isim  soy isim ve unvan bilgileri sabit
    olacak iken doktorun ID si ile diger verilerine ulasilacaktir. doktor ID si STR tipinde olup uniq olacak ve parcalanabilecektir.
    doktorun buradan bulunacak ID numarasi ile bu gune kadar baktigi hastalarin toString metodundan alinan verileri satirsatir
    kayit edilebilecek ve ayni zamanda tostrin metodundanda hasta yeniden olusturularak bu hasta uzerinde yapilacak olan degisiklikler
    tarih ve saat verileride tutularak stringe tekrardan kaydedilebilecektir. aslinda bu hasta veri bankasindada tutulur iken
    hastanin ID numarasi ile eslesen yapilan islem loglari date ve time verileri ile beraber tutulabilir buradan alinan tarih
    araliklarindaki islemler islem yapan dokrorlarin ID leri ile birlikte tutulabilirler.
     */


}
