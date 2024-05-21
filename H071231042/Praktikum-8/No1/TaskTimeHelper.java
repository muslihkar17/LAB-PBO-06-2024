package No1;
// untuk mengambil nomor  rndom untk mnjlankan tugas
class TaskTimeHelper {
    public static int getRandomExecutionTime() {
        return (int) (Math.random() * 6) + 1;
    }
}