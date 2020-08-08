package com.bitrix24.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties configFile;

    static {

        try (FileInputStream input = new FileInputStream("configuration.properties");){
            configFile = new Properties();
            configFile.load(input);


        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("FAILED LOADING PROPERTIES FILE");
        }

    }

    public static String getProperty(String keyName){
        return configFile.getProperty(keyName);
    }

}
