import java.util.Scanner;

public class WitamPytam
{
    public static void main(String[] args)
    {
        int wiek;
        try
        {
            wiek = Integer.parseInt(args[1]);
            powitaj(args[0], wiek);
        } catch (ArrayIndexOutOfBoundsException e)
        {
            zapytaj();
        }
    }

    private static void zapytaj()
    {
        String imie;
        int wiek;
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        System.out.println("Witaj przybyszu. Podaj swoje imie");
        imie = s.nextLine();
        System.out.println(imie + ", podaj swoj wiek");
        wiek = s.nextInt();

        powitaj(imie, wiek);
    }

    private static void powitaj(String imie, int wiek)
    {
        System.out.println("Witaj " + imie + ". Masz " + wiek + " lat.");
    }
}
