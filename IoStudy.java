import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;

/**
 * IoStudy
 */
public class IoStudy {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\ThomásDixini\\Documents\\Dev\\afundo_java\\diretorio_teste");
        System.out.printf(
                "It is the name: %s  it is the path: %s and their length: %d",
                file.getName(), file.getParent(), file.length());

    }
}