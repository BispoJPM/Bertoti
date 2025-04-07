public class BatteryLevelDisplay implements Observer {
    public void update(int batteryLevel) {
        System.out.println("Nível de bateria atualizado: " + batteryLevel + "%");
    }
}