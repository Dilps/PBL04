public class Pessoa { private String nome;
    private int idade;
    private float altura;
    private float peso;
    private char sexo;

    public void setNome(String nome){
        if ((nome.length() < 5) || (nome.length() > 30)){
            throw new IllegalArgumentException("Nome invalido. Minimo 6 caracteres, maximo 30 caracteres.");
        }
        else
        this.nome = nome;
    }
    public void setIdade(int idade){
        if ((idade <= 0) || (idade >= 100)){
            throw new IllegalArgumentException("Idade invalida. Minimo 1, maximo 99");
        }
       else
        this.idade = idade;
    }

    public void setAltura(float altura){
        if ((idade <= 0)){
            throw new IllegalArgumentException("Altura invalida. Altura deve ser maior que 0");
        }
        else
            this.altura = altura;
    }

    public void setPeso(float peso){
        if ((peso <= 0)){
            throw new IllegalArgumentException("Peso invalido. Altura deve ser maior que 0");
        }
        else
            this.peso = peso;

    }
    public void setSexo(char sexo){
        if( sexo != 'M' && sexo != 'F')//if(( sexo != 'M') && (sexo != 'F'))
            throw new IllegalArgumentException("Sexo invalido. 'M' OU 'F' ");
        else
            this.sexo = sexo;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public float getAltura(){
        return this.altura;
    }
    public float getPeso(){
        return this.peso;
    }
    public char getSexo(){
        return this.sexo;
    }

    public void imprimirDados(){
        System.out.print("Nome:" + nome);
        System.out.print("Idade:" + idade);
        System.out.print("Peso:" + peso);
        System.out.print("Altura:" + altura);
        System.out.print("Sexo:" + sexo);
    }
}
