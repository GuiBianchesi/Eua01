import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        Paciente paciente = new Paciente();
        System.out.println("Insira seu nome:");
        paciente.nome = in.nextLine();
        System.out.println("Insira seu RG:");
        paciente.rg = in.nextLine();
        System.out.println("Insira seu endereço:");
        paciente.endereco = in.nextLine();
        System.out.println("Insira seu telefone");
        paciente.telefone = in.nextLine();
        System.out.println("Insira seu nascimento:");
        paciente.dataNascimento = in.nextLine();
        System.out.println("Insira sua profissão:");
        paciente.profissao = in.nextLine();

        System.out.println("Nome: "+ paciente.nome);
        System.out.println("RG: "+ paciente.rg);
        System.out.println("Endereço: "+ paciente.endereco);
        System.out.println("Telefone: "+ paciente.telefone);
        System.out.println("Data de Nascimento: "+ paciente.dataNascimento);
        System.out.println("Profissão: "+ paciente.profissao);

        
        System.out.println("Insira seu nome:");
        String nome = in.nextLine();
        Paciente paciente2 = new Paciente(nome);
        System.out.println("Insira seu RG:");
        paciente2.rg = in.nextLine();
        System.out.println("Insira seu endereço:");
        paciente2.endereco = in.nextLine();
        System.out.println("Insira seu telefone");
        paciente2.telefone = in.nextLine();
        System.out.println("Insira seu nascimento:");
        paciente2.dataNascimento = in.nextLine();
        System.out.println("Insira sua profissão:");
        paciente2.profissao = in.nextLine();

        System.out.println("Nome: "+ paciente2.nome);
        System.out.println("RG: "+ paciente2.rg);
        System.out.println("Endereço: "+ paciente2.endereco);
        System.out.println("Telefone: "+ paciente2.telefone);
        System.out.println("Data de Nascimento: "+ paciente2.dataNascimento);
        System.out.println("Profissão: "+ paciente2.profissao);

        in.close();

    }
}
class Paciente {
    String nome;
    String rg;
    String endereco;
    String telefone;
    String dataNascimento;
    String profissao;

    Paciente() {
        
    }
    Paciente(String nome) {
       this.nome = nome;
    }
}