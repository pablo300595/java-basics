package collections;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    private static Properties _getProperties(InputStream is) throws Exception {
        Properties props = new Properties();
        props.load(is);
        return props;
    }

    public static Properties getProperties(String filename) {
        try  (FileInputStream fis = new FileInputStream(filename)){
            return _getProperties(fis);
        } catch(Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static Properties getProperties(Class<?> clazz) {
        String fname = clazz.getName().replace('.', '/');
        fname += ".properties";

        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        try (InputStream is= loader.getResourceAsStream(fname)) {
            return _getProperties(is);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException();
        }
    }
}
