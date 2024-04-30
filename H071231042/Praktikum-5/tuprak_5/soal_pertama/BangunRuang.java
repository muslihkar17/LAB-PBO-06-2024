package soal_pertama;

import java.text.DecimalFormat;

public class BangunRuang{
    int  sisi, panjang, lebar, tinggi;
    double jariJari;
    DecimalFormat df = new DecimalFormat("#.##"); 
    /*  
    Fungsinya untuk mengurangi angka dibelakang koma
    menjadi dua setJariJari
    */
    double luas, volume;
    final double PI = 3.141592653589793;

    //Konstruktor
    public BangunRuang(){

    }

    public BangunRuang(int sisi){
        this.sisi = sisi;
    }

    public BangunRuang(double jariJari) {
        this.jariJari = jariJari;
    }

    public BangunRuang(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.lebar = tinggi;
    }

    public BangunRuang(int tinggi, double jariJari){
        this.tinggi = tinggi;
        this.jariJari = jariJari;
    }

    public BangunRuang(double luas, double volume) {
        this.luas = luas;
        this.volume = volume;
    }

    /*
    Metode yang tidak menerima argumen apapun jadi
    metode ini hanya mengembalikan nilai dari variabel
    dan metode ini dapat diwariskan ke subclass 
    */
    double luas(){
        return this.luas;
    }
    double volume(){
        return this.volume;
    }


    //SETTER DAN GETTER
    public int getPanjang() {
        return panjang;
    }
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    public int getLebar() {
        return lebar;
    }
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    public int getTinggi() {
        return tinggi;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getPI() {
        return PI;
    }
}

class Kubus extends BangunRuang{
    public Kubus(int sisi){
        super(sisi);
    }

    public double luas(){
        this.luas = (double)(Math.pow(this.getSisi(),2))*6;
        return this.luas;    
    }

    public double volume(){
        this.volume = (double)Math.pow(this.getSisi(),3);
        return this.volume;    
    }

    void showKubus(){
        System.out.println("Luas Kubus: " + luas());
        System.out.println("Volume Kubus: " + volume());
    }

}


class Balok extends BangunRuang{
    public Balok(int panjang, int lebar, int tinggi){
        super(panjang,lebar,tinggi);
    }

    public double luas(){
        this.luas = (double) 2*(((getPanjang()*getLebar()))+(getPanjang()*getTinggi())+(getLebar()*getTinggi()));
        return this.luas;
    }

    public double volume(){
        this.volume = (double) getPanjang()*getLebar()*getTinggi();
        return this.volume;  
    }

    void showBalok(){
        System.out.println("Luas Balok: " + luas());
        System.out.println("Volume Balok: " + volume());
    }
}

class Bola extends BangunRuang{
    public Bola(double jariJari){
        super(jariJari);
    }

    public double luas(){
        this.luas =  (double) 4 * PI * Math.pow(getJariJari(), 2);
        return this.luas;
    }

    public double volume(){
        this.volume = (double) 4.0 / 3.0 * PI * Math.pow(getJariJari(), 3);
        return this.volume;
    }

    void showBola(){
        System.out.println("Luas Bola: " + df.format(luas()));
        System.out.println("Volume Bola: " + df.format(volume()));
    }
}

class Tabung extends  BangunRuang {
    public Tabung(int tinggi, double jariJari){
        super(tinggi, jariJari);
    }

    public double luas(){
        this.luas = (double) 2 * PI * getJariJari() * (getJariJari() + getTinggi());
        return this.luas;
    }

    public double volume(){
        this.volume = (double) PI * Math.pow(getJariJari(), 2) *  getTinggi();
        return this.volume;
    }

    void showTabung(){
        System.out.println("Luas Tabung: " + df.format(luas()));
        System.out.println("Volume Tabung: " + df.format(volume()));
    }
}

