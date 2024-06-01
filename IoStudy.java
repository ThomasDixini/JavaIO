import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        /*Path link = Paths.get("C:\\Users\\ThomásDixini\\Documents\\Dev\\afundo_java\\link");
        Path target = Paths.get("C:\\Users\\ThomásDixini\\Documents\\Dev\\afundo_java\\directory\\arquivo2.txt");
        Files.createSymbolicLink(link, target);
        System.out.println("É um link simbolico: " + Files.isSymbolicLink(link) + " e seu arquivo é: " + Files.readSymbolicLink(link));
        */
        /*Path dir = Paths.get(".\\teste");
        if (!Files.exists(dir)) {
            Files.createDirectory(dir);
            System.out.println("Created");
        } else {
            Path arq = Paths.get(".\\teste\\arquivoTeste.txt");
            
            System.out.println(arq);
            BasicFileAttributes attr = Files.readAttributes(arq, BasicFileAttributes.class);
            System.out.printf("######################################### \n");
            System.out.printf("Seu tamanho é: %s \n", attr.size());
            System.out.printf("Ultima vez modificado " + attr.lastModifiedTime() + "\n");
            System.out.printf("Sua fileKey " +  attr.fileKey() + "\n");
            System.out.printf("Tempo de criação " +  attr.creationTime() + "\n");
            System.out.printf("É um arquivo regular? " + attr.isRegularFile() + "\n");
            System.out.printf("######################################### \n");

            Iterable<FileStore> stores = arq.getFileSystem().getFileStores();
            for(FileStore s: stores){
                System.out.println(s.getTotalSpace() / 1024 / 1024 / 1024);
                System.out.println(s.getUnallocatedSpace() / 1024 / 1024 / 1024);
                System.out.println((s.getTotalSpace() - s.getUnallocatedSpace()) / 1024 / 1024 / 1024);
                System.out.println(s.type());
                System.out.println(s.name().toString());
                System.out.println(s.isReadOnly());
            }
            
        }*/

        /*DirectoryStream<Path> streamPath = Files.newDirectoryStream(Paths.get("C:\\Users\\ThomásDixini\\Documents\\Dev\\afundo_java\\teste"), "su*");
        streamPath.forEach(s -> System.out.println(s.getFileName()));
        streamPath.close();*/
        /*Path initialPath = Paths.get("C:\\Users\\ThomásDixini\\Documents\\Dev\\afundo_java\\teste");
        PrintFiles pf = new PrintFiles();
        Files.walkFileTree(initialPath, pf);*/
        /*DirectoryStream<Path> stream =  Files.newDirectoryStream(Paths.get("C:\\Users\\ThomásDixini\\Documents\\Dev\\afundo_java\\teste"));
        stream.forEach(s -> System.out.println(s.getFileName()));
        stream.close();*/

        /*try {
            Path path =Paths.get("C:\\Users\\ThomásDixini\\Documents\\Dev\\afundo_java\\teste\\arquivoTeste.txt");
            byte[] fileArray;
            List<String> fileStrings;
            fileArray = Files.readAllBytes(path);
            fileStrings = Files.readAllLines(path);
            System.out.println(fileArray);
            System.out.println(fileStrings);
        } catch(IOException e) {
            System.err.println(e.getMessage());
        }*/
        String message = """
            EStá é uma bela canção de Betoven
        """;
        String text = null;
        Path path = Paths.get("directory/arquivo2.txt");
        try( var in = Files.newInputStream(path)) {
            var reader = new InputStreamReader(in);
            BufferedReader buff = new BufferedReader(reader);
            Stream<String> stream = buff.lines();

            text = stream.collect(Collectors.joining("\n"));
        } catch(IOException e ){
            System.err.println(e);
        }

       System.out.println(text);
    }
}


