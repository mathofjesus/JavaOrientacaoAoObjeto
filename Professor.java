public class Professor extends Pessoa {
    double salario;
    // Method to calculate INSS
    public double getInss() {
        return salario * 0.11;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    // Removed getGetInss and setGetInss as getInss is now a method

    double getSalarioLiquido() {
        return salario - getInss();
    }
}
