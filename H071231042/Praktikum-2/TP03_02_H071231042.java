// public class TP03_02_H071231042 {
    
    class Cuboid {
        int height;
        int widht;
        int length;

        float getVolume(){
            return height*length*widht;
        }
    }
    class Main {
        public static void main(String[] args) {
            Cuboid cuboid = new Cuboid();
            cuboid.height = 15;
            cuboid.widht = 3;
            cuboid.length = 100;

            System.out.printf("volume = %.2f" , cuboid.getVolume());
        }
    }
// }
