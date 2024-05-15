public class keluarga {
    String jumlahAnak;

    public keluarga(String jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public void status(){
        System.out.println("Status : " + getJumlahAnak());
    }

    public String getJumlahAnak() {
        return jumlahAnak;
    }

    
}
