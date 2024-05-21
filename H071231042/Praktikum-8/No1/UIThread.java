package No1;

class UiThread extends Thread {
    //atribut
    final int numData;
    int loadedData = 0;
    int failedData = 0;
    long startTime;
    //konstruktor
    public UiThread(int numData) {
        this.numData = numData;
    }
    //method run
    public void run() {
        System.out.println("Start load " + numData + " Data.");
        startTime = System.currentTimeMillis();
    //perulngan yg berjln selama jumlah total data ditmbah file data kurg dri numdatanya
        while (loadedData + failedData < numData) {
            long elapsedTime = (System.currentTimeMillis() - startTime) / 1000 + 1;
            System.out.println("Loading... (" + elapsedTime + "s)");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //untuk Menghitung dan Menampilkan Waktu Eksekusi
        long executionTime = System.currentTimeMillis() - startTime;
        System.out.println("Task Finish.");
        System.out.println("Time Execution : " + executionTime / 1000 + "s");
        //untuk cek gagal atau berhasil
        if (failedData == 0) {
            System.out.println("All data is successfully loaded");
        } else {
            System.out.println(loadedData + " Data Successfully loaded & " + failedData + " Data failed to load");
        }
    }
    //Metode untuk Mengupdate Jumlah Data yang Berhasil dan Gagal yang kita jalankan
    public synchronized void incrementLoadedData() {
        loadedData++;
    }

    public synchronized void incrementFailedData() {
        failedData++;
    }
}