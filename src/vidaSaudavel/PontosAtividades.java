/*
Um programa de vida saudável quer dar pontos atividades físicas  que podem ser trocados por dinheiro. 
O sistema funciona assim: 
Cada hora de atividade física no mês vale pontos: 

→ Até 10h de atividade no mês: ganha 2 pontos por hora 
→ De 10h até 20h de atividade no mês: ganha 5 pontos por hora 
→ Acima de 20h de atividade no mês: ganha 10 pontos por hora 

A cada ponto ganho, o cliente fatura R$0,05 (5 centavos).

Faça um programa que leia quantas horas de atividade uma pessoa teve por mês, calcule e mostre quantos pontos
ela teve e quanto dinheiro ela conseguiu ganhar.
*/
package vidaSaudavel;

import java.util.Scanner;

public class PontosAtividades {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o tempo da atividade: ");

		int HrMes = scan.nextInt();
		int pontos;
		double valorReceber;

		if (HrMes <= 10) {
			pontos = HrMes * 2;
		} else if (HrMes > 10 && HrMes <= 20) {
			pontos = HrMes * 5;
		} else {
			pontos = HrMes * 10;
		}

		valorReceber = pontos * 0.05;
		System.out.println("Valor recebido: R$ " + valorReceber + "\rPontos do Mês: " + pontos);
	}
}
