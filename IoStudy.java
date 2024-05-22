import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * IoStudy
 */
public class IoStudy {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\ThomásDixini\\Documents\\Dev\\afundo_java\\diretorio_teste");
        System.out.printf(
                "It is the name: %s  it is the path: %s and their length: %d",
                file.getName(), file.getParent(), file.length());


        Path path = Paths.get("C:\\Users\\ThomásDixini\\Documents\\Dev\\afundo_java\\");
        System.out.printf("toString: %s\n", path.toString());
        System.out.printf("getFIleName: %s\n", path.getFileName());
        System.out.printf("getName: %s\n", path.getName(0));
        System.out.printf("getNameCount: %d\n", path.getNameCount());
        System.out.printf("subpath: %s\n", path.subpath(0, 2));
        System.out.printf("getParent: %s\n", path.getParent());
        System.out.printf("getRoot: %s\n", path.getRoot());
    }
}