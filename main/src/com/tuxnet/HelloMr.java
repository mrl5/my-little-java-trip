public class HelloMr
{
    public static void main(String[] args)
    {
        String imie = null;
        int wiek = 0;
        int adult = 18;
        String powitanie = null;

        try
        {
            imie = args[0];
            wiek = Integer.parseInt(args[1]);

            powitanie = "Witaj " + imie + ". Masz " + wiek + " lat.";

            if (wiek < adult)
            {
                powitanie = powitanie.replace("Witaj", "Heja");
            }

        } catch (ArrayIndexOutOfBoundsException e)
        {
            if (args.length == 0)
            {
                powitanie = "Witaj nieznajomy. Podaj imie i wiek (przyk³ad: Milena 19)";
            } else if (args.length == 1)
            {
                powitanie = "Witaj " + imie
                        + ". Podaj swój wiek (przyk³ad: Milena 19)";
            } else if (args[0].matches("\\d+"))
            {
                powitanie = powitanie + "nieznajomy. Podaj swoje imiê";
            } else
            {
                e.printStackTrace();
                powitanie = null;
            }

            // System.err.println("Podaj imie i wiek. Przyk³ad: Milena 19");
            // System.err.println(e.getMessage());
            // e.printStackTrace();
            // System.err.println("Brak args[" + e.getMessage() + "]");
        }
        System.out.println(powitanie);
    }
}
