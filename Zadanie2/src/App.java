import java.util.Scanner;

/**
 * Created by Karolina on 11/4/2016.
 */

public class App {

    public static void main(String[] args) throws Exception{
        try{
            Scanner s = new Scanner(System.in);
            int ks = 0;
            int kp = 0;
            int iloscPokoi = 0;
            String nazwa = "";
            System.out.println("Ilosc pokoi:");
            iloscPokoi = s.nextInt();

            for(int i=0; i<iloscPokoi; i++){
                Pokoj p = new Pokoj();
                System.out.println("Podaj nazwę pokoju:");
                nazwa = s.next();
                System.out.println("Długość:");
                p.dlugosc = s.nextInt();
                System.out.println("Szerokość:");
                p.szerokosc = s.nextInt();
                System.out.println("Wysokosc");
                p.wysokosc = s.nextInt();
                System.out.println("Koszt scian:");
                ks = s.nextInt();
                System.out.println("Koszt podlogi:");
                kp = s.nextInt();
                System.out.println(nazwa.toUpperCase()+":");
                Obliczenia obl = new Obliczenia(p,ks,kp);
                obl.ObliczeniaKoszty(p,ks,kp);
            }
        }
        catch(Exception e){
            throw new Exception("wystapil blad");
        }

    }
}
