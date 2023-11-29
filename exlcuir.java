public class exlcuir {
    

    public void excluir(){
        System.out.println("Digite o ra do aluno que deseja excluir ");
        String ra=leia.nextLine();
        int i=pesquisar(ra);
        if(i<=0){
           alunos[i]=null;

        }

    }
}
