package servico;

import models.Cliente;
import java.time.LocalDateTime;
import java.util.List;

public class OrdemDeServico {
    int idOrdemDeServico;
    private List<Servico> listServicosRealizados;
    private Cliente cliente;
    private LocalDateTime inicioServico;
    private LocalDateTime fimServico;
    double valorServico;

    public OrdemDeServico(){

    }

    public OrdemDeServico(int idOrdemDeServico, List<Servico> listServicosRealizados, Cliente cliente, LocalDateTime inicioServico, LocalDateTime fimServico, double valorServico) {
        this.idOrdemDeServico = idOrdemDeServico;
        this.listServicosRealizados = listServicosRealizados;
        this.cliente = cliente;
        this.inicioServico = inicioServico;
        this.fimServico = fimServico;
        this.valorServico = valorServico;
    }

    public int getIdOrdemDeServico() {
        return idOrdemDeServico;
    }

    public void setIdOrdemDeServico(int idOrdemDeServico) {
        this.idOrdemDeServico = idOrdemDeServico;
    }

    public List<Servico> getListServicosRealizados() {
        return listServicosRealizados;
    }

    public void setListServicosRealizados(List<Servico> listServicosRealizados) {
        this.listServicosRealizados = listServicosRealizados;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getInicioServico() {
        return inicioServico;
    }

    public void setInicioServico(LocalDateTime inicioServico) {
        this.inicioServico = inicioServico;
    }

    public LocalDateTime getFimServico() {
        return fimServico;
    }

    public void setFimServico(LocalDateTime fimServico) {
        this.fimServico = fimServico;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }
}
