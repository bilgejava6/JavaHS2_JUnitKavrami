package com.muhammet;

public class Islemler {

    public int toplma(int s1,int s2){
        return s1+s2;
    }

    public double bolme(double s1, double s2){
        if(s2 == 0) throw new RuntimeException("s2 değeri 0 girilemez");
        double result = s1 / s2;
        return result;
    }

    /**
     * Belli bir süreliğine uygulamauı bekletmek için kullanılır
     * @param sure, milisaniye cinsinden long olarak veirlir.
     */
    public void sureliMethod(Long sure){
        try{
            Thread.sleep(sure);
        }catch (Exception ex){

        }
    }


}
