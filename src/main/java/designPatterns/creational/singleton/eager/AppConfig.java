package designPatterns.creational.singleton.eager;

import java.util.HashMap;
import java.util.Map;

public class AppConfig {
    public static AppConfig appConfig = new AppConfig();
    public Map<String, String> configMap;

    private AppConfig() {
        System.out.println("Loading......");
        configMap = new HashMap<>();
        configMap.put("AppName", "Design Patterns");
    }

    public static AppConfig getInstance(){
        return appConfig;
    }

    public Map<String, String> getConfigMap() {
        return configMap;
    }
}
