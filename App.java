public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        aluno.setNome("Matheus");
        aluno.setNota1(08.5);
        aluno.setNota2(07.5);

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Média: " + aluno.getMedia());

        professor.setNome("Dr. Steve");
        professor.setSalario(5000.00);
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Salário: " + professor.getSalarioLiquido ());
        System.out.println("INSS: " + professor.getInss());
    }
}
