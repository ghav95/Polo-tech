package models;

import java.util.ArrayList;
import java.util.List;

public class Endereco {

    public static List<Endereco> listEndereco = new ArrayList<>();
    private int idEndereco;
    private String cep;
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;

    public Endereco(String cep, String rua, String numero, String complemento, String bairro) {
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        listEndereco.add(this);
        idEndereco = listEndereco.indexOf(this);
    }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public String getRua() { return rua; }
    public void setRua(String rua) { this.rua = rua; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public static class EnderecoBuilder{

        private String cep;
        private String rua;
        private String numero;
        private String complemento;
        private String bairro;

        public EnderecoBuilder cep(String cep){ this.cep = cep; return this;}
        public EnderecoBuilder rua(String rua){ this.rua = rua; return this;}
        public EnderecoBuilder numero(String numero){ this.numero = numero; return this;}
        public EnderecoBuilder complemento(String complemento){ this.complemento = complemento; return this;}
        public EnderecoBuilder bairro(String bairro){ this.bairro = bairro; return this;}
        public Endereco build(){
            return new Endereco(cep, rua, numero, complemento, bairro);
        }
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "idEndereco=" + idEndereco +
                ", cep='" + cep + '\'' +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
