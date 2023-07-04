package corp.model;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
public class ClasspathUtil {
    static class Dummy{}
    public static String readFileInClasspath(String fileName) {

        try (final InputStream is = new Dummy().getClass().getClassLoader().getResourceAsStream(fileName);
             final StringWriter writer = new StringWriter();
             final InputStreamReader reader = new InputStreamReader(is, Charset.defaultCharset())) {
            reader.transferTo(writer);
            return writer.toString();
        } catch (Exception e) {
            throw new RuntimeException("Error opening classpath file: " + fileName, e);
        }
    }


}
