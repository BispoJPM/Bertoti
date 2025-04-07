public class Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.takePhotoHighQuality();
        phone.takePhotoBasic();
    }
}

class Smartphone {
    public void takePhotoHighQuality() {
        System.out.println("Foto tirada com câmera de alta qualidade.");
    }

    public void takePhotoBasic() {
        System.out.println("Foto tirada com câmera básica.");
    }
}