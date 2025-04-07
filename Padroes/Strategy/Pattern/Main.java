public class Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone(new HighQualityCamera());
        phone.takePhoto();
        
        phone.setCameraStrategy(new BasicCamera());
        phone.takePhoto();
    }
}