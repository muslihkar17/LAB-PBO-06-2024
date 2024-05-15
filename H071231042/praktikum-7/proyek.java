public class proyek extends kehidupan{
    int jumlah;

    public proyek(int jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public void prosesKehidupan(){
        System.out.println("Pernah Memiliki Proyek");
    }
    
    public void jumlahProyek(){
        if(this.jumlah == 1){
            System.out.println("Jumlah Proyek : 4");
        }else if(this.jumlah == 2){
            System.out.println("Jumlah Proyek : 8");
        }else if(this.jumlah == 3){
            System.out.println("Jumlah Proyek : 12");
        }else if(this.jumlah == 4){
            System.out.println("Jumlah Proyek : 15");
        }
    }

    public int getJumlah() {
        return jumlah;
    }
}   