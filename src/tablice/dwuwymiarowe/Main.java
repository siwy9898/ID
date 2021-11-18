package tablice.dwuwymiarowe;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

//		kocham Ole
//		int[][] macierz = new int[5][6];
//		int[][] macierz2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 6 } };
//		// ilosc wierszy
//		System.out.println(macierz.length);
//		// ilosc kolumn
//		System.out.println(macierz[0].length);
//		System.out.println();
//
//		macierz[0][0] = 4;// przypisanie liczby 4 do 0 wiersza i 0 kolumny
//		macierz[3][4] = 6;
//		macierz[1][0] = 3; // przypisanie wartosci 3 do 1 wiersza, 0 kolumny
//
//		// p�tla zewnetrzna
//		for (int i = 0; i < macierz.length; i++) { // i=0
//			// petla wewnetrzna
//			for (int j = 0; j < macierz[0].length; j++) {
//				System.out.print(macierz[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		System.out.println();
//
//		// p�tla zewnetrzna
//		for (int i = 0; i < macierz2.length; i++) { // i=0
//			// petla wewnetrzna
//			for (int j = 0; j < macierz2[i].length; j++) {
//				System.out.print(macierz2[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		System.out.println();
//
//		// Zadeklaruj tablice dwuwymiarowa 4x6 typu String. Przypisz do niej kilka
//		// elementów,
//		// wypisz jej liczbe wierszy i liczbę kolumn, wypisz jakis przykladowy wyraz
//		// Wypisz cała macierz
//
//		// Zadeklaruj macierz 6x6 i wypełnij ja liczbami od 10 w gore
//		// policzyc sume wszystkich elementow w macierzy
//		int[][] macierz3 = new int[6][6];
//		int liczba = 10;
//
//		for (int i = 0; i < macierz3.length; i++) {
//			for (int j = 0; j < macierz3[i].length; j++) {
//				macierz3[i][j] = liczba;
//				liczba++;
//				System.out.print(macierz3[i][j] + " ");
//			}
//			System.out.println();
//		}
////
//		System.out.println();
//		// wypisac powyzsza macierz w odwrotnej kolejnosci
//
//		for (int i = macierz3.length - 1; i >= 0; i--) {
//			for (int j = macierz3[i].length - 1; j >= 0; j--) {
//				System.out.print(macierz3[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		// wypisz z powyzszej macierzy przekatna od lewej górnej do prawej dolnej
//		for (int i = 0; i < macierz3.length; i++) {
//			for (int j = 0; j < macierz3[i].length; j++) {
//				if (i == j) {
//					System.out.print(macierz3[i][j]);
//				} else {
//					System.out.print("   ");
//				}
//			}
//			System.out.println();
//		}
//
//		Random losowanie = new Random();
//
//		for (int i = 1; i <= 20; i++) { // 0-14 + 5 = 5- 19
//			System.out.print(losowanie.nextInt(15) + 5 + " ");
//		}
//
//		// \n - znak nowego weirsza
//		// \t - znak tabulacji
//		System.out.println("\n");
//
//		// zadeklaruj macierz o wymiarach 5x8, wypelnij ja liczbami losowymi z zakresu
//		// 10-90, znajdz najwieksza i najmniejsza wartosc oraz srednia arytmetyczna
//		// sprawdz czy wiecej jest liczb mniejszych od 50 czy wiekszych badz rownych 50
//
//		int[][] lotto = new int[5][8];
//
////		int min = lotto[0][0];
////		int max = lotto[0][0];
//
//		int min = Integer.MAX_VALUE;
//		int max = Integer.MIN_VALUE;
//
//		for (int i = 0; i < lotto.length; i++) {
//			for (int j = 0; j < lotto[i].length; j++) {
//				lotto[i][j] = losowanie.nextInt(81) + 10;
//				System.out.print(lotto[i][j] + " ");
//
//				if (lotto[i][j] < min) {
//					min = lotto[i][j];
//				}
//				if (lotto[i][j] > max) {
//					max = lotto[i][j];
//				}
//			}
//			System.out.println();
//}

		// Wczytaj skanerem 3 liczby typu int, wyswietl ich sume na konsoli

//	Scanner scan = new Scanner(System.in);System.out.println("Podaj liczbę nr 1");
//	int liczba1 = scan.nextInt();System.out.println("Podaj liczbę nr 2");
//	int liczba2 = scan.nextInt();System.out.println("Podaj liczbę nr 1");
//	int liczba3 = scan.nextInt();
//
//	System.out.println(liczba1+liczba2+liczba3);

		// Wczytaj skanerem 3 napisy, wyswietl ten ktory jest najdluzszy
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Podaj słowo nr 1");
//		String napis1 = scan.nextLine();
//		System.out.println("Podaj słowo nr 2");
//		String napis2 = scan.nextLine();
//		System.out.println("Podaj słowo nr 3");
//		String napis3 = scan.nextLine();
//
//		if (napis1.length() > napis2.length() && napis1.length() > napis3.length()) {
//			System.out.println(napis1);
//		}
//		if (napis2.length() > napis1.length() && napis2.length() > napis3.length()) {
//			System.out.println(napis2);
//		}
//		if (napis3.length() > napis1.length() && napis3.length() > napis2.length()) {
//			System.out.println(napis3);
//		}

		// Stwórz kalkulator za pomocą skanera, uzytkownik wprowadza liczbe (double),
		// znak, druga liczbe
		// w zaleznosci od tego czy poda +,-,/,* to wykonujemy taka operacje matematycna

//		System.out.println("Podaj liczbę nr 1");
//		int liczba1 = scan.nextInt();
//		System.out.println("Podaj liczbę nr 2");
//		int liczba2 = scan.nextInt();
//		scan.nextLine();
//		System.out.println("Podaj rodzaj działania:");
//		String operator = scan.nextLine();
//
//		if (operator.equals("+")) {
//			System.out.println(liczba1 + liczba2);
//		}
//		if (operator.equals("-")) {
//			System.out.println(liczba1 - liczba2);
//		}
//
//		if (operator.equals("*")) {
//			System.out.println(liczba1 * liczba2);
//		}
//
//		if (operator.equals("/")) {
//			System.out.println(liczba1 / liczba2);
//		}

		// Uzytkownik wprowadza liczby. Na poczatku uzytkownik deklaruje ile liczb chce
		// wprowadzic. Nastepnie wprowadza
		// tyle liczb ile podał. Chcemy policzyc ich sume, element najmniejsz,
		// najwiekszy oraz srednia arytmetyczna.

//		System.out.println("ile liczb chcesz wprowadzic");
//		int ileLiczb = scan.nextInt();
//		int suma = 0;
//		int min = Integer.MAX_VALUE;
//
//		for (int i = 0; i < ileLiczb; i++) {
//			System.out.println("Podaj liczbe");
//			int liczba = scan.nextInt();
//			suma += liczba;
//			if (liczba < min) {
//				min = liczba;
//			}
//		}
//		System.out.println("Suma liczb to : " + (suma));
//		System.out.println("Najmniejsza z nich to: " + (min));

		// Symulacja wprowadzania hasla przez uzytkownika. Uzytkownik wprowadza hasło,
		// tak dlugo az jest
		// niepoprawne, wyswietlamy napis ze haslo jst niepoparwne, wprowadz poprawne
		// hasło.
		// Jesli uzytkownik wprowadzi poprawne haslo to wyswietlamy komunikat ze haslo
		// jest poprawne.

//		String haslo = "Omlet";
//		String proba = "";
//		while (true) {
//			System.out.println("wpisz haslo");
//			proba = scan.next();
//
//			if (haslo.equals(proba)) {
//				System.out.println("Haslo poprawne");
//				break;
//			}
//		}

		// Wprowadz za pomoca okienka dialogowego jakis napis. Jesli jego dlugosc jest
		// wieksza niz 15, wyswietl
		// za pomoca okienka napis ze jest za dlugi tekst, a jesli nie to wyswietl ze
		// jest ok.

//		System.out.println("Wpisz slowo");
//		String slowo = scan.nextLine();
//		if (slowo.length() > 15) {
//			System.out.println("Za długi");
//		} else {
//			System.out.println(slowo);
//		}

		// Za pomoca JOPtionPane wczytaj 3 liczby i wyswietl ta ktora jest najwieksza

//		String liczba1 = JOptionPane.showInputDialog("Podaj liczbę nr 1:");
//		int liczba11 = Integer.parseInt(liczba1);
//
//		String liczba2 = JOptionPane.showInputDialog("Podaj liczbę nr 2:");
//		int liczba22 = Integer.parseInt(liczba2);
//
//		String liczba3 = JOptionPane.showInputDialog("Podaj liczbę nr 3:");
//		int liczba33 = Integer.parseInt(liczba3);
//
//		// System.out.println(liczba11 + liczba22 + liczba33);
//
//		if (liczba11 > liczba22 && liczba11 > liczba33) {
//			System.out.println(liczba1);
//		} else if (liczba22 > liczba11 && liczba22 > liczba33) {
//			System.out.println(liczba22);
//
//		}

		// Za pomoc JOptionpane (confrim dialog) zadaj pytanie uzytkownikowi o to czy
		// chce zlozyc zamowienie.
		// W zaleznosci od zaznaczonej odpowiedzi wyswietl odpowiedni napis

//		int tekst1 = JOptionPane.showConfirmDialog(null, "Czy chcesz złożyć zamówienie?", "Zamówienie",
//				JOptionPane.YES_NO_OPTION);
//
//		System.out.println(tekst1);
//
//		if (tekst1 == 0) {
//			JOptionPane.showMessageDialog(null, "OKI");
//		} else {
//			JOptionPane.showMessageDialog(null, "Innym razem...");
//		}

		// Za pomoca JOPtionpane uzytkwonik podaje imiona. Dopoki nie poda tomek to moze
		// je wprowadzac dalej i wypisujemy je na konsoli
		// Gdy wpisze Tomek przerywamy wprowadzanie i podajemy komunikat w okienku
		// dialogowym ze wpisano brzydkie imie.
//
//		String tomek = "Tomek";
//		String proba = "";
//
//		while (true) {
//			String imie = JOptionPane.showInputDialog("Wpisz imie");
//			proba = imie;
//			System.out.println(proba);
//			if (imie.equals(tomek)) {
//				JOptionPane.showMessageDialog(null, "Wpisano brzydkie imie.");
//				break;
//			}
//		}

		// Uzytkownik podaje najpierw ile liczb chce zsumowac, a potem podaje te liczby,
		// wypiszmy sume tych, ich srednia arytmetyczna,
		// najwieksza liczbe, najmniejsza liczbe.

		// BYŁO

		// Wpisujemy imiona za pomoca JOPtionPane tak dlugo az uzytkownik nie
		// zrezygnuje. Przypisujemy te wartosci do wczesniej utworzonej
		// zmiennej typu String, wyswietlamy ja na koncu

//		String proba = "";
//		while (true) {
//			String imie = JOptionPane.showInputDialog("Wpisz imie");
//			proba = proba + " " + imie;
//			System.out.println(proba + " ");

//		}
		// nie wiem jak zrobic zeby dzialaly guziki cancel i X

//		 Uzytkownik wybiera dwie opcje, tak lub nie dopoki nie nacisnie cancel. Policz
//		 czy uzytkownik wybral wiecej razy tak, nie czy bylo ich tyle samo.

//		int c = 0;
//		int t = 0;
//		int n = 0;
//
////		System.out.println(c);
//
//		while (c != -1) {
//			// for (int i = 0; i >= 5; i++) {
//			c = JOptionPane.showConfirmDialog(null, "Dawaj Klikaj:", "Klikaj", JOptionPane.YES_NO_OPTION);
//			if (c == 0) {
//				
//				t++;
//			}
//			if (c == 1) {
//				n++;
//			}
//
//		}
//		System.out.println("TAK " + t);
//		System.out.println("NIE " + n);
//	}
//
//}
// File, FileWriter, FileReader i BufferedReader

// Zapisz do pliku kilka nazw zwierzat, odczytaj je i wypisz

//		FileReader fr = null;
//		String linia = "";
//
//		try {
//			fr = new FileReader("E:\\tekst.txt");
//		} catch (FileNotFoundException e) {
//			System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
//			System.exit(1);
//		}
//
//		BufferedReader bfr = new BufferedReader(fr);
//		
//		try {
//			while ((linia = bfr.readLine()) != null) {
//				System.out.println(linia);
//			}
//		} catch (IOException e) {
//			System.out.println("BŁĄD ODCZYTU Z PLIKU!");
//			System.exit(2);
//		}
//
//		
//		try {
//			fr.close();
//		} catch (IOException e) {
//			System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
//			System.exit(3);
//		}
//	}
//}

// Stworz plik z 10 liczbami, wczytaj je i przypisz do tablicy, wyswietl cala
// tablice

		FileReader fr = null;
		String linia = "";
		String[] tablica = new String[10];
		int a = 0;

		try {
			fr = new FileReader("E:\\tekst.txt");
		} catch (FileNotFoundException e) {
			System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
			System.exit(1);
		}

		BufferedReader bfr = new BufferedReader(fr);

		try {
			while ((linia = bfr.readLine()) != null) {
				tablica[a] = linia;
				a++;
			}
		} catch (IOException e) {
			System.out.println("BŁĄD ODCZYTU Z PLIKU!");
			System.exit(2);
		}

		try {
			fr.close();
		} catch (IOException e) {
			System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
			System.exit(3);
		}
		for (int i = 0 ; i<tablica.length ; i++) {
			System.out.println(tablica[i]);
		}
	}

}

// Stwórzmy program ktory pozwala zapisac do pliku 3 imiona podane przez
// uzytkownika. Nastepnie odczytajmy te imiona i

// Stworz plik slownik z kilkunastoma wyrazami. Wsrod tych wyrazow wsadz kilka
// kurde, kurcze i kurka.
// Program ma za zadanie kazdy wyraz brzydki zastapic **** i zapisac
// całosc do nowego pliku ktory sie nazywa
// slownikPoprawiony

// W pliku tekstowym sa wyrazy. Wypisz te ktore sa palindromami np kajak, ala
