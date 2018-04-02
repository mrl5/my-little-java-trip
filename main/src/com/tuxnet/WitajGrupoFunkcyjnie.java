import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Wymaga wsparcia dla Javy 8 (Lambda: "->")
 * 
 * @see https://marketplace.eclipse.org/content/java-8-support-eclipse-kepler-sr2
 */

public class WitajGrupoFunkcyjnie
{
    public static void main(String[] args)
    {
        List<String> imiona = Stream.of("Tomek", "Czarek", "Lukasz", "Kuba",
                "Michal", "Staszek", "Tomek").collect(Collectors.toList());

        imiona.forEach(s -> System.out.println("Witaj " + s));
    }
}