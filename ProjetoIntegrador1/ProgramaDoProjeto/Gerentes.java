public class Gerentes extends Empresa{
    private String _id;
    private String _nome;
    private String _senhas;

    public Gerentes(String id, String nome, String senhas) {
          _id = id;
          _name = nome;
          _senhas = senhas;
    }

    public String getId() {
          return _id;
    }

    public String getNome() {
          return _nome;
    }
    public String getSenhas() {
        return _senhas;
  }
}
