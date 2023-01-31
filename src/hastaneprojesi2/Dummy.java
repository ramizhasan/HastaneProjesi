package hastaneprojesi2;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Dummy {

 enum HastaStatu{
        AKTIF,PASIF
    }
    //IlkMuayene/Acil/Kontrol/Ameliyat
enum Sikayet {
      Allerji, Bas_Agrisi, Diabet, SogukAlginligi, Migren,  Kalp_Hastaliklari
}
enum IslemTuru{
        IlkMuayene,
        Acil,
        Kontrol,
        Ameliyat
    }
enum IslemStatu{
     ACIK,KAPALI
}
     public static void main(String[] args) throws Exception {
     //"AKTIF<?>HST-1<?>1<?>30012023:2217<?>DKT-1<?>Allerji<?>IlkMuayene<?>Tahlilleri istendi,hasta gozlem altinda<?>ACIK\n"
         //System.out.println(Statu.IlkMuayene);
         LocalDate[] dates = periodTaker("03-01-2023", 1, 1);
         //HastaStatu.AKTIF,"HST-1" , "1",dates,Sikayet.Diabet,IslemTuru.Acil,IslemStatu.KAPALI
        List<String[]> list =  getHastaLog(null,null,null,null," ",null,null,null);
         for (String[] w: list
              ) {
             System.out.println(Arrays.toString(w));
             }
         //writeLog(hastaLoglari[0],false);
        // DatePeriodTaker("30-01-2023",1,1);
        // System.out.println(periodTaker("30-01-2023", 1, 1));

     }

    /**
     *Hasta ile islem bittiginda hastanin islemi acik kalsa dahi log dosyasina kayit eder. kayit ederken islem eger
     *  */
     public static void writeLog(String args,boolean append){
         try( FileWriter fr = new FileWriter("src\\hastaneprojesi2\\log.txt",append);
              BufferedWriter br = new BufferedWriter(fr);) {
             br.write(hastaLoglari[0]);

         } catch (IOException e) {
             throw new RuntimeException(e);
         }
     }
     /**
        verilen tarihin bWeek kadar hafta oncesini 0'nci aWeek kadar hafta sonrasini 1 nci eleman olarak geri dondurur.
      */

    public static LocalDate[] periodTaker(String date, int bWeek, int aWeek) throws Exception{//format gun-ay-yil seklinde olmali
                 if(bWeek<0||aWeek<0)throw  new Exception("Aratmak istediginiz tarih araligi icin hafta degerleri negatif olamaz");
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d-MM-yyy");
                LocalDate dt = LocalDate.parse(date,dtf);
                LocalDate sDate= dt.minusWeeks(bWeek);
                LocalDate bDate = dt.plusWeeks(aWeek);
                return new LocalDate[]{sDate,bDate};

    }
    public static void DateLogger(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyy:HHmm");
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt.format(dtf));

    }
    // Sikayet { Allerji, Bas_Agrisi, Diabet, SogukAlginligi, Migren,  Kalp_Hastaliklari
    //Hasta Loglari={ "HST-1<?>TransectionNumber<?>30012023:2217<?>DKT-1<?>Sikayet<?>IlkMuayene<?>Tahlilleri istendi,hasta gozlem altinda<?>ACIK\n" }
    static String[] hastaLoglari = {
            "AKTIF<?>HST-1<?>1<?>30012023:2217<?>DKT-1<?>Allerji<?>IlkMuayene<?>Tahlilleri istendi,hasta gozlem altinda<?>ACIK\n" +
                    "PASIF<?>HST-1<?>2<?>30012023:2217<?>DKT-1<?>Allerji<?>IlkMuayene<?>Tahlilleri istendi,hasta gozlem altinda<?>ACIK\n" +
                    "AKTIF<?>HST-1<?>1<?>30012023:2217<?>DKT-1<?>Allerji<?>IlkMuayene<?>Tahlilleri istendi,hasta gozlem altinda<?>KAPALI\n" +
                    "PASIF<?>HST-1<?>1<?>30012023:2217<?>DKT-1<?>Allerji<?>Acil<?>Tahlilleri istendi,hasta gozlem altinda<?>ACIK\n"+
                    "PASIF<?>HST-1<?>2<?>30012023:2217<?>DKT-1<?>Allerji<?>IlkMuayene<?>Tahlilleri istendi,hasta gozlem altinda<?>KAPALI\n"+
                    "PASIF<?>HST-2<?>1<?>30012023:2217<?>DKT-1<?>Allerji<?>Acil<?>Tahlilleri istendi,hasta gozlem altinda<?>ACIK\n"+
                    "AKTIF<?>HST-1<?>1<?>30012023:2217<?>DKT-2<?>Allerji<?>IlkMuayene<?>Tahlilleri istendi,hasta gozlem altinda<?>KAPALI\n"+
                    "PASIF<?>HST-2<?>1<?>30012023:2217<?>DKT-2<?>Diabet<?>Acil<?>Tahlilleri istendi,hasta gozlem altinda<?>ACIK\n"+
                    "AKTIF<?>HST-1<?>4<?>30012023:2217<?>DKT-2<?>Migren<?>IlkMuayene<?>Tahlilleri istendi,hasta gozlem altinda<?>KAPALI\n"};
    public static List<String[]> getHastaLog(HastaStatu hStatu,String H_ID,String iNosu,LocalDate[] dates, String dctNum, Sikayet skyt,
                                             IslemTuru iTuru,IslemStatu islemSt
    ) {
        List<String[]> loglist = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        try (BufferedReader bfr = new BufferedReader(new FileReader("src\\hastaneprojesi2\\log.txt"))){
            String str = null;
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyy:HHmm");
          while ((str= bfr.readLine())!=null){

              String[] arr = str.split("<\\?>");
             boolean hastaStatu = hStatu == null || arr[0].equals(hStatu.toString()); //Hastanin silinmis olup olmadigina gore arama yapar
             boolean hastaID = H_ID == null || H_ID.isBlank() || arr[1].equals(H_ID);  //H_ID numarasi ile arama
              boolean islemNumarasi = iNosu == null || iNosu.isBlank() || arr[2].equals(iNosu);// hastanin islem numarasina gore arama yapar
              boolean periyodIci = dates == null || (LocalDate.parse(arr[3], dtf).isBefore(dates[1])
                      && LocalDate.parse(arr[3], dtf).isAfter(dates[0])); // verilen tarihin once ve sonrasi ile arama
              boolean DoktorID = dctNum==null||dctNum.isBlank()|| arr[4].equals(dctNum);  // doktor numarasi ile arama
              boolean sikayet = skyt== null || arr[5].equals(skyt.toString());//  sikayet durumu
              boolean islemturu = iTuru==null|| arr[6].equals(iTuru.toString());  // islemin statusu ile arama, ilk muayene kontrol ve ametiyat gibi
              boolean islemStatu = islemSt == null || arr[8].equals(islemSt.toString());//islem statusune gore arama "ACIK", "KAPALI"
              if (hastaStatu
                      && hastaID
                      && islemNumarasi
                      && periyodIci
                      && DoktorID
                      && sikayet
                      && islemturu
                      && islemStatu
              ) {
                  loglist.add(arr);
                  //System.out.println(Arrays.toString(arr));
              }
          }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return loglist;
    }

}
