package Composite.antiPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AppList apps = new AppList();
        apps.addApp("WhatsApp");
        apps.addApp("Camera");
        apps.showApps();
    }
}

class AppList {
    private List<String> apps = new ArrayList<>();

    public void addApp(String app) {
        apps.add(app);
    }

    public void showApps() {
        for (String app : apps) {
            System.out.println("App: " + app);
        }
    }
}