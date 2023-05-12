import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaFicha{

    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        String nome;
        int idade;
        float altura;
        float peso;
        char sexo;
        try{
            Pessoa pessoa = new Pessoa();

            System.out.print("Digite seu nome:");
            nome = leitura.nextLine();
            pessoa.setNome(nome);

            System.out.print("Digite sua idade:");
            idade = leitura.nextInt();
            pessoa.setIdade(idade);

            System.out.print("Digite sua altura:");
            altura = leitura.nextFloat();
            pessoa.setAltura(altura);

            System.out.print("Digite seu peso:");
            peso = leitura.nextFloat();
            pessoa.setPeso(peso);

            System.out.print("Digite seu sexo:");
            sexo = (char) System.in.read();
            pessoa.setSexo(sexo);

            pessoa.imprimirDados();
        }catch (IOException ex){
            Logger.getLogger(JavaFicha.class.getName()).log(Level.SEVERE, null, ex);

        } catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}