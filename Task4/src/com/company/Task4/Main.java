package com.company.Task4;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
	    SberCorporateCulture sberCorporateCulture = new SberCorporateCulture();
	    while (true) {
            try {
                sberCorporateCulture.showCorporateCulture();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
