package tugaspertemuan6;

public class Segitiga{
    double alas; //properti (variabel)
    double tinggi;
    double sisi;

    Segitiga(){
        alas    = 1; 
        tinggi  = 1;
        sisi    = 1;
    }

    Segitiga(double alasBaru, double tinggiBaru, double sisiBaru){ //masukin input 
        alas    = alasBaru;
        tinggi  = tinggiBaru;
        sisi    = sisiBaru;
    }

    double getLuas(){ //menampilkan data luas
        return alas * tinggi / 2;
    }

    double getKeliling(){
        return alas + tinggi + sisi;
    }

    public void setAlas(double alas) { //input alas
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}