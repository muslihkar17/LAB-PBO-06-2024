abstract class dog {
   int position;
   int averagelenght;

   abstract void describe();

}

class Pitbull extends dog implements Move{
    // public Pitbull(int averagelenght){
    // }

    public void move(){
        position += 3;
        System.out.println("posisi pitbull sekarang " + this.position);
    }

    @Override
    void describe(){
        System.out.println("anjing pitbull itu petarung yang agresif, pintar, dan cerdas.");
    }
}

class Siberianhusky extends dog implements Move{
    // public Siberianhusky(int averagelenght){
    // }

    public void move(){
        this.position += 2;
        System.out.println("posisi pitbull sekarang " + this.position);
    }

    @Override
    void describe() {
        System.out.println("anjing siberianhusky berjiwa bebas dan ramah ke manusia. ");
    }  
}

class Bulldog extends dog implements Move {
    // public Bulldog(int averagelenght){
    // }

    public void move(){
        this.position += 3;
        System.out.println("posisi bulldog sekarang " + this.position);
    }

    @Override
    void describe() {
        System.out.println("anjing bulldog itu berani dan keras kepala ");
    }
}
class germanshepherd extends dog implements Move {
    // public germanshepherd(int averagelenght){
    // }

    public void move(){
        this.position += 3;
        System.out.println("posisi sekarang germanshepherd" + this.position);
    }

    @Override
    void describe() {
        System.out.println("anjing germanshepherd itu pintar dan bisa melaksanakan perintah yang diberikan ");
    }
}
