package _AD004.demo.database;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {

    public String getDatabaseName() {
        return "campusfind";
    }

    public String getDatabaseType() {
        return "MySQL";
    }
}