/*
				Desafio
Você deve fazer a leitura de 5 valores inteiros. 
Em seguida mostre quantos valores informados são pares, 
quantos valores informados são ímpares, quantos valores 
informados são positivos e quantos valores informados são negativos.

				Entrada
Você receberá 5 valores inteiros.

				Saída
Exiba a mensagem conforme o exemplo de saída abaixo, 
sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.

 
	Exemplo de Entrada			Exemplo de Saída
	
			-5					3 valor(es) par(es)
			0					2 valor(es) impar(es)
			-3					1 valor(es) positivo(s)
			-4					3 valor(es) negativo(s)
			12

*/

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class minhaClasse {
	  
    public static void main(String[] args) throws IOException {
      
        String linha;
        int numerosImpares = 0;
        int numerosPares = 0;
        int numerosNegativos = 0;
        int numerosPositivos = 0;
        int numero;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            linha = br.readLine();
            numero = Integer.parseInt(linha);
            
            if (numero % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
            
            if (numero > 0) numerosPositivos++;
            if (numero < 0) numerosNegativos++;
        }
        
        System.out.println("" + numerosPares +" valor(es) par(es)");
        System.out.println("" + numerosImpares + " valor(es) impar(es)");
        System.out.println("" + numerosPositivos + " valor(es) positivo(s)");
        System.out.println("" + numerosNegativos + " valor(es) negativo(s)");
    }	
}




