public class Employee {
    private String nome;
    private double salario;

    public Employee() {
        this.nome = "";
        this.salario = 0;
    }
    public Employee(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
}
