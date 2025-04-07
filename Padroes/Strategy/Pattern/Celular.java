public class Smartphone {
    private CameraStrategy cameraStrategy;

    public Smartphone(CameraStrategy cameraStrategy) {
        this.cameraStrategy = cameraStrategy;
    }

    public void setCameraStrategy(CameraStrategy strategy) {
        this.cameraStrategy = strategy;
    }

    public void takePhoto() {
        cameraStrategy.takePhoto();
    }
}