package models;

import java.util.ArrayList;
import java.util.List;

public class Contato {
    public static List<Contato> listContato = new ArrayList<>();
    private int idContato;
    private String email;
    private String celular;
    private String whatsapp;

    public Contato(String email, String celular, String whatsapp) {
        this.email = email;
        this.celular = celular;
        this.whatsapp = whatsapp;
        listContato.add(this);
        this.idContato = listContato.indexOf(this);
    }

    public static List<Contato> getListContato() { return listContato; }

    public int getIdContato() { return idContato; }
    public void setIdContato(int idContato) { this.idContato = idContato; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }

    public String getWhatsapp() { return whatsapp; }
    public void setWhatsapp(String whatsapp) { this.whatsapp = whatsapp; }

    public int getBy(Contato contato){
        return listContato.indexOf(contato);
    }

    public static class ContatoBuilder{

        private String email;
        private String celular;
        private String whatsapp;

        public ContatoBuilder email(String email){ this.email = email; return this;}
        public ContatoBuilder celular(String celular){ this.celular = celular; return this;}
        public ContatoBuilder whatsapp(String whatsapp){ this.whatsapp = whatsapp; return this;}
        public Contato build(){ return new Contato(email, celular, whatsapp); }
    }

    @Override
    public String toString() {
        return "Contato{" +
                "idContato=" + idContato +
                ", email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                ", whatsapp='" + whatsapp + '\'' +
                '}';
    }
}
