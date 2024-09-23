import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Silvio Sales";
        String tipoConta = "Corrente";
        double saldo = 0;
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;

        System.out.println("******************************************");
        System.out.println("Dados do cliente");
        System.out.println("Nome: " +nome);
        System.out.println("Tipo: " +tipoConta);
        System.out.println("Saldo Inicial: " +saldo);
        System.out.println("******************************************");

        String opcoes = """
                
                Operações
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Digite a opção desejada:
                """;

        while (opcao != 4){
            System.out.println(opcoes);
            opcao = leitura.nextInt();
            if (opcao == 1){
                System.out.println("Seu saldo atualizado é "+saldo);
            }else if(opcao == 2){
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
            }else if (opcao == 3){
                System.out.println("Qual o valor que deseja transferir ?");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Você não tem saldo suficiente.");
                }else{
                    saldo -= valor;
                }
            }
        }
    }
}