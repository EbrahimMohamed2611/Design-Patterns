package designPatterns.creational.singleton;

import designPatterns.creational.singleton.eager.AppConfig;
import designPatterns.creational.singleton.lazy.DatabaseConfig;
import designPatterns.creational.singleton.lazy.DatabaseConfiguration;

public class Main {
    public static void main(String[] args) {
        DatabaseConfiguration configuration = DatabaseConfiguration.getInstance();
        System.out.println(configuration.getConfigMap().get("UserName"));
        System.out.println(configuration.getConfigMap().get("password"));

        DatabaseConfig config = DatabaseConfig.getInstance();
        System.out.println(config.getConfigMap().get("UserName"));
        System.out.println(config.getConfigMap().get("password"));

        AppConfig appConfig = AppConfig.getInstance();
        System.out.println(appConfig.getConfigMap().get("AppName"));
    }
}
