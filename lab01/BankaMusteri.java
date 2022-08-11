public class BankaMusteri{

    String isim;
    int hesapNo;
    int bakiye;

        public BankaMusteri(String isim, int hesapNo, int bakiye){
            this.isim = isim;
            this.hesapNo = hesapNo;
            this.bakiye = bakiye;
        }



    public static void main(String[] args){
        BankaMusteri musteri = new BankaMusteri("ali", 111, 3000);
        BankaMusteri musteri2 = new BankaMusteri("ayşe", 222, 5000);


        System.out.println(musteri.isim +"-"+ musteri.hesapNo +"-"+ musteri.bakiye
                           +"\n"+ musteri2.isim +"-"+ musteri2.hesapNo +"-"+ musteri2.bakiye 
                           +"\n"+ Math.abs(musteri.bakiye - musteri2.bakiye));
    }
}
