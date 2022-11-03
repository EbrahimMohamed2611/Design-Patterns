package designPatterns.creational.singleton.lazy;

import java.util.HashMap;
import java.util.Map;

public class DatabaseConfig {
    private static DatabaseConfig instance;
    public Map<String, String> configMap;

    private DatabaseConfig() {
        configMap = new HashMap<>();
        configMap.put("UserName", "Mohamed");
        configMap.put("password", "12345");
        configMap.put("post", "8080");
    }

    public synchronized static DatabaseConfig getInstance() {// thread safe
        if (instance == null)
            instance = new DatabaseConfig();

        return instance;
    }

    public Map<String, String> getConfigMap() {
        return configMap;
    }
}
