public class Main {
    public static void main(String[] args) {
        BatterySubject battery = new BatterySubject();
        BatteryLevelDisplay display = new BatteryLevelDisplay();
        battery.addObserver(display);
        battery.setLevel(85);
    }
}