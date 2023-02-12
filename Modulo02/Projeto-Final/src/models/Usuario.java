package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario extends Pessoa{
    public static List<Usuario> listUsuario = new ArrayList<>();
    private String nomeUsuario;
    private String senhaUsuario;
    private Date dataInicio;
    private Date dataFim;
    private Boolean usuarioAtivo;

    public Usuario(String nomeUsuario, String senhaUsuario) {
        super();
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
        listUsuario.add(this);
    }

    public String getNomeUsuario() { return nomeUsuario; }
    public void setNomeUsuario(String nomeUsuario) { this.nomeUsuario = nomeUsuario; }

    public String getSenhaUsuario() { return senhaUsuario; }
    public void setSenhaUsuario(String senhaUsuario) { this.senhaUsuario = senhaUsuario; }

    public Date getDataInicio() { return dataInicio; }
    public void setDataInicio(Date dataInicio) { this.dataInicio = dataInicio; }

    public Date getDataFim() { return dataFim; }
    public void setDataFim(Date dataFim) { this.dataFim = dataFim;  }

    public Boolean getUsuarioAtivo() { return usuarioAtivo; }
    public void setUsuarioAtivo(Boolean usuarioAtivo) { this.usuarioAtivo = usuarioAtivo; }
}
