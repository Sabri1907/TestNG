package utilities;

import java.util.Properties;

public class ConfigReader {

    public static Properties properties;
    // => Properties class'ini kullanmak icin bu class'dan obje olusturduk. Ancak her yerden ulasmak
    // icin class seviyesinde, public ve static olusturduk.

    public static String getProperty(String key){
        /*
        => configuration.properties class'inda tanimladigimiz key'lere ait value'leri test class'imiza
        getirmesi icin String data turunde public static bir method olusturduk.
        Ve istedigimiz key'in value'sunu getirmesi icin Poperty class'indan olusturdugumuz
        properties objesi vasitasiyla getProperty(key) methodununun icine istedigimiz key'i yazarak
        return etmesini sagladik.
         */


    return properties.getProperty(key);
    }


}
