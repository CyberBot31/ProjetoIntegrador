public class Empregado extends Empresa{
    private String _id;
    private String _nome;
    private double _salario;

    public Empregado(String id, String nome, double salario) {
          _id = id;
          _name = nome;
          _salary = salario;
    }

    public String getId() {
          return _id;
    }

    public String getNome() {
          return _nome;
    }

    public double getSalario() {
          System.out.println("Salário do empregado.");
          return _salario;
    }
}