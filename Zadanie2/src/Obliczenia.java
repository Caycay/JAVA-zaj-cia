import java.util.Scanner;

/**
 * Created by Karolina on 11/4/2016.
 */
public class Obliczenia {
    private int _kosztScian = 0;
    private int _kosztPodlogi = 0;
    public Obliczenia( Pokoj p,
               int kosztscian,
               int kosztpodlogi){
         p = new Pokoj();
        _kosztScian = kosztscian;
        _kosztPodlogi = kosztpodlogi;
    }

    public void ObliczeniaKoszty(Pokoj p, int kM, int kP)
    {
        System.out.println("Objetosc: " + p.dlugosc*p.szerokosc*p.wysokosc);
        System.out.println("Powierzchnia scian: " + (2*p.szerokosc*p.wysokosc+2*p.dlugosc*p.wysokosc));
        System.out.println("Powierzchnia podłogi: " + p.szerokosc*p.dlugosc);
        System.out.println("Koszt malowania scian: " + (2*p.dlugosc*p.wysokosc+2*p.szerokosc*p.wysokosc)*kM);
        System.out.println("Koszt podlogi: " + (p.szerokosc*p.dlugosc)*kP);
    }
}
