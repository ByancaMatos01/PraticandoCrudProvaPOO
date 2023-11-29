import java.util.Scanner;

import Crud.Alunos;

public class criarAlunos {
    private int indice;
    private final Alunos [] alunos =new Alunos[50];
    private Scanner leia = new Scanner(System.in);


    public void criar(){
        System.out.println("Criação de alunos");

        if(indice<=50){
            Alunos a=new Alunos();
            System.out.println("Digite o nome do aluno");
            a.setNome(leia.nextLine());
            System.out.println("Digite o Ra do aluno");
            a.setra(leia.nextLine());
            System.out.println("digite a data de nascimento");
            String date=leia.nextLine();
            a.setnascimento(date);
            a.setId(indice);
            alunos[indice]=a;
            indice++;

        }else{
            System.out.println("ERRO, não é possivel a criação de nunhum aluno");
            
        }

    }
}
