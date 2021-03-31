import java.util.ArrayList;
import java.util.Collections;

public class Acao implements II_Ibovespa, Comparable<Acao>{

    private String nome;
    private float preco;
    private float valorizacao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public float getValorizacao() {
        return valorizacao;
    }
    public void setValorizacao(float valorizacao) {
        this.valorizacao = valorizacao;
    }
    
    @Override
    public String toString() {
        return "Acao [nome=" + nome + ", preco=" + preco + ", valorizacao=" + valorizacao + "]";
    }
    //Métodos referentes a Interface
    @Override
    public void listar(ArrayList<Acao> acoes) {
        
        System.out.println("Lista de evolução da ação");
    
        for (Acao minhaAcao : acoes) {
            System.out.println(minhaAcao);   
        }
        
    }
    @Override
    public void ordenar(ArrayList<Acao> acoes) {

        System.out.println("Lista Ordenada da ação");  

        Collections.sort(acoes); //Ordenação

        for (Acao minhaAcao : acoes) {
            System.out.println(minhaAcao);   
        }
    }

    @Override
    public int compareTo(Acao precoAcao) {
        return (int) (this.preco - precoAcao.getPreco()); // Orden crescente
    }

}
