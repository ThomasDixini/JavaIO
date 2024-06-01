import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class SonnetReader extends BufferedReader{
    public SonnetReader(Reader reader){
        super(reader);
    }

    public SonnetReader(InputStream in){
        this(new InputStreamReader(in));
    }

    public void skipLines(int lines) throws IOException {
        for(int i = 0; i < lines; i ++) {
            readLine();
        }
    }

    private String skipSonnetHeader() throws IOException {
        String line = readLine();
        while (line.isBlank()) {
            readLine();
        }

        if(line.equals("*** END OF THE PROJECT GUTENBERG EBOOK THE SONNETS ***")){
            return null;
        }

        line = readLine();
        while (line.isBlank()) {
            readLine();
        }
        return line;
    }

    public Sonnet readNextSonnet() throws IOException {
        String line = skipSonnetHeader();
        if (line == null) {
            return null;
        } else {
            var sonnet = new Sonnet();
            while (!line.isBlank()) {
                sonnet.add(line);
                line = readLine();
            }
            return sonnet;
        }
    }

}
