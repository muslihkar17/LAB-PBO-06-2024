package soal_pertama;

import java.text.DecimalFormat;

public class BangunDatar {
    int tinggi, panjang, lebar;
    int sisi, sisi1, sisi2, sisi3, sisi4;
    /*
    Alasan attribute sisi1 dst di taruh di superclass
    agar langsung memberikan metode setter getternya  
    ke subclass yg membutuhkannya
    */
    double r;
    double luas, keliling;
    DecimalFormat df = new DecimalFormat("#.##"); 
    /*  
    Fungsinya untuk mengurangi angka dibelakang koma
    menjadi dua setJariJari
    */
    final double PI = 3.141592653589793;


    //CONSTRUCTOR
    public BangunDatar() {
        // constructor tanpa parameter
    }

    public BangunDatar(int sisi) {
        this.sisi = sisi;
    }

    public BangunDatar(double luas, double keliling) {
        this.luas = luas;
        this.keliling = keliling;
    }

    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public BangunDatar(double r) {
        this.r = r;
    }

    public BangunDatar(int tinggi, int sisi1, int sisi2, int sisi3, int sisi4) {
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.sisi4 = sisi4;
    }

    /*
    Metode yang tidak menerima argumen apapun jadi
    metode ini hanya mengembalikan nilai dari variabel
    dan metode ini dapat diwariskan ke subclass 
    */
    double luas(){
        return this.luas;
    }
    double keliling(){
        return this.keliling;
    }
    

    //SETTER AND GETTER
    public int getSisi1() {
        return sisi1;
    }

    public void setSisi1(int sisi1) {
        this.sisi1 = sisi1;
    }

    public int getSisi2() {
        return sisi2;
    }

    public void setSisi2(int sisi2) {
        this.sisi2 = sisi2;
    }

    public int getSisi3() {
        return sisi3;
    }

    public void setSisi3(int sisi3) {
        this.sisi3 = sisi3;
    }

    public int getSisi4() {
        return sisi4;
    }

    public void setSisi4(int sisi4) {
        this.sisi4 = sisi4;
    }
    
    public int getTinggi() {
        return tinggi;
    }
    
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getKeliling() {
        return keliling;
    }

    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }

}

class Persegi extends BangunDatar{
    public Persegi(int sisi){
        super(sisi);
    }

    public double luas(){
        this.luas = getSisi() * getSisi();
        return this.luas;
    }

    public double keliling(){
        this.keliling = 4 * getSisi();
        return this.keliling;
    }

    void showPersegi(){
        System.out.println("Luas Persegi: " + df.format(luas()));
        System.out.println("Keliling Persegi: " + df.format(keliling()));
    }
}

class PersegiPanjang extends BangunDatar{
    public PersegiPanjang(int panjang, int lebar){
        super(panjang, lebar);
    }

    public double luas(){
        this.luas = getPanjang()*getLebar();
        return this.luas;
    }

    public double keliling(){
        this.keliling = 2*(getPanjang() + getLebar());
        return this.keliling;
    }

    void showPersegiPanjang(){
        System.out.println("Luas Persegi Panjang: " + df.format(luas()));
        System.out.println("keliling Persegi Panjang: " + df.format(keliling()));
    }
}

class Lingkaran extends BangunDatar{
    public Lingkaran(double r){
        super(r);
    }

    public double luas(){
        this.luas = PI * Math.pow(getR(),2);
        return this.luas;
    }

    public double keliling(){
        this.keliling = 2 * PI * getR();
        return this.keliling;
    }

    void showLingkaran(){
        System.out.println("Luas Lingkaran: " + df.format(luas()));
        System.out.println("Keliling Lingkaran: " + df.format(keliling()));
    }
}

class Trapesium extends  BangunDatar {
    public Trapesium(int tinggi, int sisi1, int sisi2, int sisi3, int sisi4){
        super(tinggi, sisi1, sisi2, sisi3, sisi4);
    }

    public double luas(){
        this.luas = ((this.getSisi1() + this.getSisi2()) * this.getTinggi()) / 2;
        return this.luas;
    }

    public double keliling(){
        this.keliling = this.getSisi1() + this.getSisi2() + this.getSisi3() + this.getSisi4();
        return this.keliling;
    }

    void showTrapesium(){
        System.out.println("Luas Trapesium: " + df.format(luas()));
        System.out.println("Keliling Trapesium: " + df.format(keliling()));
    }
}