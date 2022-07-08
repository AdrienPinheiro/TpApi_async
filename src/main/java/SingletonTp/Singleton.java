package SingletonTp;

import java.util.ResourceBundle;

public class Singleton {

    private static Singleton instance;
    private static ResourceBundle config;
    private static ResourceBundle loadConfig() throws Exception {
        if(instance == null){
            try{
                return config = ResourceBundle.getBundle("configuration");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return config;
    }

    public static ResourceBundle getProperties() throws Exception {
        return loadConfig();
    }
}
