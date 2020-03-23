package Repo;
import java.util.*;
import java.util.Properties;

public class Config
{
    Properties configFile;
    public Config()
    {
        configFile = new java.util.Properties();
        try {
            configFile.load(Objects.requireNonNull(this.getClass().getClassLoader().
                    getResourceAsStream("prop.properties")));
        }catch(Exception eta){
            eta.printStackTrace();
        }
    }

    public String getProperty(String key)
    {
        String value = this.configFile.getProperty(key);
        return value;
    }
}
