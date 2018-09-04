package com.github.epietras220.todo.list;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class SaveCsvFile {
    public static void main(String[] args) {
        // nazwa pliku do ktorego zapiszemy i z ktorego odczytamy tekst
        String nazwaPliku = "dane.csv";
        //tablica z danymi do zapisu

        double[][] dane = {{2.3, 2.2, 2.1, 2.0, 1.8},
                {2.2, 2.1, 2.1, 2.3, 2.0},
                {2.2, 2.2, 2.1, 1.9, 1.8}
        };
        zapiszPlik(nazwaPliku, dane);
        double[][] odczyt = odczytajPlik(nazwaPliku);
        obliczenia(odczyt);

    }

    public static void zapiszPlik(String nazwaPliku, double[][] dane) {
        //Tworzymy obiekt typu Path
        Path sciezka = Paths.get(nazwaPliku);
        ArrayList<String> out = new ArrayList<>();

        //pobieranie kolejnego rzedu danych
        for (double[] seria : dane) {
            String s = Arrays.toString(seria);

            //Arrays.toString(seria) zwraca dane w postaci:
            //[2.3, 2.2, 2.1, 2.0, 1.8]
            //trzeba usunac nawiasy kwadratowe
            s = s.replace("[", "");
            s = s.replace("]", "");
            out.add(s);
        }
        try {
            Files.write(sciezka, out);
        } catch (IOException ex) {
            System.out.println("nie moge zapisac pliku");
        }
    }

    public static double[][] odczytajPlik(String nazwaPliku) {
        Path sciezka = Paths.get(nazwaPliku);
        //lista bedzie przechowywala kolejne linie odczytane z pliku jako string
        ArrayList<String> odczyt = new ArrayList<>();
        try {
            //od razu odczytane zostaja wszystkie linie pliku i umieszczone na liscie
            odczyt = (ArrayList) Files.readAllLines(sciezka);
        } catch (IOException ex) {
            System.out.println("Brak pliku!");
        }
        //teraz trzeba lancuchy znakow dla kazdej linii przekonwertowac
        //na dane liczbowe i umiescic je w tablicy

        //tablica dla odczytywanych danych
        //na razie wiemy tylko ile bedzie rzedow


        double[][] daneOdczytane = new double[odczyt.size()][];
        // bedziemy potrzebowali indeksu linii
        int nrLinii = 0;
        //pobieranie kolejnych linii z pliku (z listy)
        for (String linia : odczyt) {
            //rozbijamy linie na poszzczegolne elementy zawarte w tej linii
            String[] liniaDaneString = linia.split(",");
            //tablica do przechowywania danych w formie liczb double
            double[] liniaDouble = new double[liniaDaneString.length];

            //petla ktora pobiera pojedyncze wartosci z tablicy stringow
            //konwertuje je na double i zapisuje w tablicy typu double

            for (int i = 0; i < liniaDouble.length; i++) {
                liniaDouble[i] = Double.parseDouble(liniaDaneString[i]);
            }
            //dodajemy tablice z seria danych do tablicy z wszystkimi danymi
            daneOdczytane[nrLinii] = liniaDouble;
            nrLinii++;
        }
        return daneOdczytane;
    }

    //robimy cos z tymi danymi
    public static void obliczenia(double[][]dane){
        double suma = 0.0;
        for (double[] rzad: dane){
            for(double dana: rzad){
             suma += dana;
            }
            System.out.println("Dane: " + Arrays.toString(rzad)
            + " suma: " + suma
            + " srednia: " + suma/rzad.length);
        }
    }
}

