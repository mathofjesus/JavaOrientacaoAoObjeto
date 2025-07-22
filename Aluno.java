public class Aluno extends Pessoa {

    double nota1;
    double nota2;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    double getMedia() {
        return (nota1 + nota2) / 2;
    }

    public static void main(String[] args) {
        // Example usage
        Aluno aluno = new Aluno();
        aluno.setNota1(8.0);
        aluno.setNota2(7.0);
        System.out.println("Média: " + aluno.getMedia());
    }
}