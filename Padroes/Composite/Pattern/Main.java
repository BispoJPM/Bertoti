package Composite.Pattern;

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("Aplicativos");
        App whatsapp = new App("whatsApp");
        App camera = new App("Camera");


        root.add(whatsapp);
        root.add(camera);
        root.showDetails();
    }
}