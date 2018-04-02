public class PowitanieZObslugaBledow
{
    public static void main(String[] args)
    {
        Osoba o = parsujDane(args);
        System.out.println("Witaj " + o.toString());
    }

    private static Osoba parsujDane(String[] args)
    {
        String imie = "Nie znam Twojego imienia";
        int wiek = 0;

        for (int i = 0; i < args.length && i < 2; i++)
        {
            try
            {
                wiek = Integer.parseInt(args[i]);
            } catch (NumberFormatException e)
            {
                imie = args[i];
            }
        }

        return new Osoba(imie, wiek);
    }
}