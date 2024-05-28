import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class PrintFiles
        extends SimpleFileVisitor<Path>{
    
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                // TODO Auto-generated method stub
                if(attrs.isDirectory()) {
                    System.out.println(attrs.creationTime());
                } else {
                    System.out.println("Não - É um diretorio");
                }
                return FileVisitResult.CONTINUE;
            }
}
