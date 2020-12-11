package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import dao.pharantasses_checker;



public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("C:\\Users\\Computer\\IdeaProjects\\Laborator 4 OOP\\src\\main");
        File file2 = new File("C:\\Users\\Computer\\IdeaProjects\\Laborator 4 OOP\\src\\main");
        System.out.println("-------- File 1 --------");
        Scanner scanner1 = new Scanner(file1);
        int numara_linii = 1;
        while (scanner1.hasNextLine()) {
            System.out.print("line " + numara_linii + ": ");
            System.out.println(pharantasses_checker.Verifica_Paranteze(scanner1.nextLine()));
            numara_linii++;
        }

        System.out.println("\n-------- File 2 --------");
        Scanner scanner2 = new Scanner(file2);
        numara_linii = 1;
        while (scanner2.hasNextLine()) {
            System.out.print("line " + numara_linii + ": ");
            System.out.println(pharantasses_checker.Verifica_Paranteze(scanner2.nextLine()));
            numara_linii++;
        }
    }
}
