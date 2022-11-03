package designPatterns.creational.singleton.lazy;

import java.util.HashMap;
import java.util.Map;

public class DatabaseConfiguration {
    private static DatabaseConfiguration instance;
    public Map<String, String > configMap;

    private DatabaseConfiguration(){
        configMap = new HashMap<>();
        configMap.put("UserName", "Ebrahim");
        configMap.put("password", "ElRouby");
        configMap.put("post", "8080");
    }

    public static DatabaseConfiguration getInstance(){
        if(instance == null) // not thread safe
            instance = new DatabaseConfiguration();

        return instance;
    }

    public Map<String, String> getConfigMap() {
        return configMap;
    }
}
