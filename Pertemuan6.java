package tugaspertemuan6;

public class Pertemuan6 {
    public static void main(String[] args) {
        //Objek 1
        Segitiga Segitiga1 = new Segitiga(); //untuk menghubungkan dgn file segitiga (program class/rancangan)
        System.out.println("------------Objek 1------------");
        System.out.println("Alas : "+Segitiga1.alas); //panggil nama method, nama objek.nama property/method
        System.out.println("Tinggi : "+Segitiga1.tinggi);
        System.out.println("Sisi : "+Segitiga1.sisi);
        System.out.println("Luas : "+Segitiga1.getLuas());
        System.out.println("Keliling : "+Segitiga1.getKeliling());
        System.out.println("");

        //Objek 2
        Segitiga Segitiga2 = new Segitiga(30,10,90);

        System.out.println("------------Objek 2------------");
        System.out.println("Alas : "+Segitiga2.alas);
        System.out.println("Tinggi : "+Segitiga2.tinggi);
        System.out.println("Sisi : "+Segitiga2.sisi);
        System.out.println("Luas : "+Segitiga2.getLuas());
        System.out.println("Keliling : "+Segitiga2.getKeliling());
        System.out.println("");

        //Objek 3
        Segitiga Segitiga3 = new Segitiga(20,30,60);
        System.out.println("------------Objek 3------------");
        System.out.println("Alas : "+Segitiga3.alas);
        System.out.println("Tinggi : "+Segitiga3.tinggi);
        System.out.println("Sisi : "+Segitiga3.sisi);
        System.out.println("Luas : "+Segitiga3.getLuas());
        System.out.println("Keliling : "+Segitiga3.getKeliling());
        System.out.println("");
        

    }
}
