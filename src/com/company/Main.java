package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        CategoriaFilme p = new CategoriaFilme();

        System.out.println("Dados da pessoa: " + p.imprimir());
    }
}
