import java.util.Scanner;

public class Exercicio_15 {

    public static void main(String[] args) throws Exception {

        int horastrabalhadas;

        double ganhahora, salariobruto, ir, inss, sindicato, descontos, salarioliquido;

        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");

        ganhahora = input.nextDouble();

        System.out.println("Quantas horas você trabalhou no mês?");

        horastrabalhadas = input.nextInt();

        input.close();

        salariobruto = horastrabalhadas * ganhahora;

        ir = (salariobruto * 11) / 100;

        inss = (salariobruto * 8) / 100;

        sindicato = (salariobruto * 5) / 100;

        descontos = salariobruto - ir - inss - sindicato;

        salarioliquido = descontos;

        System.out.println("Seu salário bruto é: R$ " + salariobruto);

        System.out.println("Você pagou ao INSS: R$ " + inss);

        System.out.println("Você pagou ao sindicato: R$ " + sindicato);

        System.out.println("Seu salário líquido é: R$ " + salarioliquido);

        System.out.println("+ Salário Bruto : R$ " + salariobruto);

        System.out.println("- IR (11%) : R$ " + ir);

        System.out.println("- INSS (8%) : R$ " + inss);

        System.out.println("- Sindicato (5%) : R$ " + sindicato);

        System.out.println("= Salário Líquido : R$ " + salarioliquido);

    }
    
}