class handphone{
    String merek;
    String model;
    int harga;
    int tahunproduksi;
    String deskripsi;

    public handphone(){

    }

    public handphone(String merek, String model, int harga, int tahunproduksi, String deskripsi) {
        this.merek = merek;
        this.model = model;
        this.harga = harga;
        this.tahunproduksi = tahunproduksi;
        this.deskripsi = deskripsi;
    }

    public String getMerek() {
        return merek;
    }
    public void setMerek(String merek) {
        this.merek = merek;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getTahunproduksi() {
        return tahunproduksi;
    }
    public void setTahunproduksi(int tahunproduksi) {
        this.tahunproduksi = tahunproduksi;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    public void displayinfo(){
        System.out.println("mereknya " + getMerek());
        System.out.println("modelnya" + getModel());
        System.out.println("harganya" + getHarga());
        System.out.println("tahun produksi" + getTahunproduksi());
        System.out.println("deskripsi" + getDeskripsi());

    }
}

public class Main{
    public static void main(String[] args) {
        handphone hp = new handphone("realme","c2",14,2019,"hpterbaru");
        hp.displayinfo();

        handphone hp1 = new handphone();
        hp1.setMerek("oppo");
        hp1.setModel("A12");
        hp1.setHarga(1000000);
        hp1.setTahunproduksi(2017);
        hp1.setDeskripsi("keluaran lama");

        System.out.println(hp1.getMerek());
        System.out.println(hp1.getModel());
        System.out.println(hp1.getHarga());
        System.out.println(hp1.getTahunproduksi());
        System.out.println(hp1.getDeskripsi());

        SelfUtils.displayselfData();
    }
}
class SelfUtils{
    public static void displayselfData() {
        System.out.println("muslih khairu Ar");
        System.out.println("H071231042");

    }
}

