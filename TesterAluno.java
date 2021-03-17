import java.util.Scanner;

public class TesterAluno {
    
  public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    Aluno alunoT = new Aluno();

    System.out.println("Entre com seu nome: ");
    alunoT.setNome(teclado.next());

    System.out.println("Entre com sua matricula: ");
    alunoT.setMatricula(teclado.next());

    System.out.println("Entre com o seu Curso: ");
    alunoT.setCurso(teclado.next());

    alunoT.listar();

    teclado.close();
    }
}
