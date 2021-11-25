package application;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        List<Contribuinte> contribuintes = new ArrayList<>();

        System.out.print("Informe o numero de contribuintes:");
        int n = sc.nextInt();

        for (int i=0;i<n;++i){
            System.out.println("Contribuinte # "+ (i+1)+" Dados:");
            System.out.print("Fisica/Juridica (f/j)?");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome:");
            String nome = sc.nextLine();
            System.out.print("Renda:");
            double renda = sc.nextDouble();
            if (ch == 'f'){
                System.out.print("Gastos com Saúde:");
                double gastosSaude = sc.nextDouble();
                contribuintes.add(new PessoaFisica(nome, renda, gastosSaude));

            }else {
                System.out.print("Numero de funcionários:");
                int numeroFunc = sc.nextInt();
                contribuintes.add(new PessoaJuridica(nome, renda, numeroFunc));
            }
        }

        System.out.println("Lista de Contribuintes:");

        for (Contribuinte c: contribuintes){
            System.out.print("Contribuinte: "+c.getNome()+" - Imposto pago:"+String.format("%.2f%n", c.impostopago()));
        }
        sc.close();
    }
}
