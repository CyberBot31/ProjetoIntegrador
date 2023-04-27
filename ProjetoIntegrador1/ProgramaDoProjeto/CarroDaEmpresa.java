public class CarroDaEmpresa extends Empresa{
    private String _marca;
    private String _hodometro;

    public CarroDaEmpresa(String marca, String hodometro) {
        _marca = marca;
        _hodometro = hodometro;
  }

    public String getMarca() {
    return _marca;
}

    public String getHodometro() {
    return _hodometro;
}
}
