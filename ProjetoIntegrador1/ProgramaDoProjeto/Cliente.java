public class Cliente extends Empresa{
    private String _id;
    private String _nome;

    public Cliente(String id, String nome) {
          _id = id;
          _name = nome;
    }

    public String getId() {
          return _id;
    }

    public String getNome() {
          return _nome;
    }
}
