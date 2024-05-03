public class Main {
   public static void main(String[] args) {
    Bulldog mantan = new Bulldog();
    Car mobil = new Car(10, "Hitam", 1200);
    Smartphone iphone = new Smartphone(13000000, "Apple");
   

    mantan.move();
    mantan.describe();

    System.out.println();
    mobil.move();
    System.out.println("Total Forward Gear : " + mobil.totalForwardGear);
    System.out.println("Color : " + mobil.color);
    System.out.println("Max Speed : " + mobil.maxSpeed);

    System.out.println();
    System.out.println("Brand : " + iphone.brand);
    System.out.println("Price : " + iphone.price);
    iphone.move();
    System.out.println();
   }
}
