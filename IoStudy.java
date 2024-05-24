import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * IoStudy
 */
public class IoStudy {
    public static void main(String[] args) throws IOException, NoSuchFileException, FileAlreadyExistsException {

        /*File file = new File("C:\\Users\\ThomásDixini\\Documents\\Dev\\afundo_java\\diretorio_teste");
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
        FileSystem fileSystem = FileSystems.getDefault();
        for (FileStore store: fileSystem.getFileStores()) {
            System.out.println(store.name() + " - " + store.type());
        }
        */
        /*try {
            Path path = Paths.get("C:\\Users\\ThomásDixini\\Documents\\Dev\\afundo_java\\directory\\");
            path.toFile().mkdir();
            path = Paths.get("C:\\Users\\ThomásDixini\\Documents\\Dev\\afundo_java\\directory\\teste.txt");
            //path.toFile().createNewFile();
            
            FileSystem fs = FileSystems.getDefault();
            for(FileStore store: fs.getFileStores()) {
                System.out.println(fs.getRootDirectories().iterator().next() + "- é do tipo " + store.type());
                System.out.println("Usa a " + fs.getSeparator() + " para indicar seu path.");
                System.out.println(fs.getFileStores().iterator().next() + " É o seu Volume (Ou sua FileStore)");
            }

            Path directory = Paths.get("C:\\Users\\ThomásDixini\\Documents\\Dev\\afundo_java\\directory\\arquivo2.txt");
            Path path2 = Paths.get("C:\\Users\\ThomásDixini\\Documents\\Dev\\afundo_java\\arquivo2.txt");
            
            Files.move(path2, directory, StandardCopyOption.REPLACE_EXISTING);
            
        } catch (Exception e) {
            System.err.println(e);
        }*/
        Path link = Paths.get("C:\\Users\\ThomásDixini\\Documents\\Dev\\afundo_java\\link");
        Path target = Paths.get("C:\\Users\\ThomásDixini\\Documents\\Dev\\afundo_java\\directory\\arquivo2.txt");
        Files.createSymbolicLink(link, target);
        System.out.println("É um link simbolico: " + Files.isSymbolicLink(link) + " e seu arquivo é: " + Files.readSymbolicLink(link));
    }
}