import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class HelloListOfNames
{
    public static void main(String[] args) throws IOException
    {
        Path plik = Paths
                .get("C:/Users/jakub.kolodziejczak/Documents/ECLIPSE_workspace/JavaWpro/src/imiona.txt");
        // Path plik = Paths.get("imiona.txt");
        System.out.println(Files.readAllLines(plik, StandardCharsets.UTF_16));

        List<String> linieZPliku = Files.readAllLines(plik,
                StandardCharsets.UTF_16);
        for (String string : linieZPliku)
        {
            System.out.println("Witaj " + string);
        }
    }
}
