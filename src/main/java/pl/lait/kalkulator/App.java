package pl.lait.kalkulator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	static int a = 0;
	static int b = 0;
	static int w = 0;
	
	public static Scanner odczyt;
	
    public static void main( String[] args )
    {
    	
    	odczyt = new Scanner(System.in);
    	int wybor = 0;
    	
        System.out.println( "Witaj w programie Kalkulator, "
        		+ "podaj 2 liczby." );
        
        //początek pętli
        do {
        
	        //tu wczytamy liczby z klawiatury
	        System.out.println("Podaj a: ");
	        //wczytanie z klawiatury liczby a
	        
	        a = Integer.parseInt(odczyt.nextLine());
	        
	        System.out.println("Podaj b: ");
	        //wczytanie b z klawiatury
	        
	        b = Integer.parseInt(odczyt.nextLine());
	        
	        System.out.println("Wybierz działanie:\n"
	        		+ "1 - dodawanie\n"
	        		+ "2 - odejmowanie\n"
	        		+ "3 - mnożenie\n"
	        		+ "4 - dzielenie\n"
	        		+ "Każda inna cyfra - KONIEC");
	        
	        wybor = Integer.parseInt(odczyt.nextLine());
	        //System.out.println("Wybrano: " + wybor);
	        
	        if(wybor==1) {
	        	w = dodawanie(a, b);
	        } else if (wybor==2) {
	        	w = odejmowanie(a, b);
	        } else if (wybor==3) {
	        	w = mnozenie(a,b);
	        } else if (wybor==4) {
	        	w = dzielenie(a,b);
	        } else {
	        	return;
	        }
	        System.out.println("Wybrano opcję nr: "
	        		+ wybor + "\nWynik działania to: "
	        		+ w);
	        
        } while (wybor >= 1 && wybor<=4);    
        //koniec pętli
        
    }
    
    public static int dodawanie(int a, int b) {
    	//System.out.println(a+b);
    	int wynik = a+b;
    	return wynik;
    }
    public static int odejmowanie(int a, int b) {
    	int wynik = a-b;
    	return wynik;
    }
    public static int mnozenie(int a, int b) {
    	int wynik = a*b;
    	return wynik;
    }
    public static int dzielenie(int a, int b) {
    	int wynik = 0;
		try {
			wynik = a/b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Wystąpił bład: ");
			e.printStackTrace();
		}
    	return wynik;
    }
    
    
}
