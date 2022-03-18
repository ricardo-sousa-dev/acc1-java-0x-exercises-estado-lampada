package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

public class Lampada {
  /**
   * Método inicial.
   *
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    boolean isLigada = true;

    System.out.println("A lampada ligada: " + isLigada + "!");
    scan.close();
  }

}
