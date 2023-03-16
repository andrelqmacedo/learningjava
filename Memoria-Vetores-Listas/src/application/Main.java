package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrix = new int[n][n]; //Instancia a matriz na memoria;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Main diagonal: ");
        for(int i=0; i<n; i++){
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        int countNegativos = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] < 0){
                    countNegativos++;
                }
            }
        }
        System.out.println("Negative numbers = " + countNegativos);

        sc.close();
    }
}