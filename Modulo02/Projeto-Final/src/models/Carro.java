package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Carro {
    private static List<Carro> listCarro = new ArrayList<>();
    private String chassi;
    private String placa;
    private String modelo;
    private LocalDate ano;
    private String rodizio;

    public Carro(String chassi, String placa, String modelo, LocalDate ano, String rodizio) {
        this.chassi = chassi;
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.rodizio = rodizio;
        listCarro.add(this);
    }

    public List<Carro> getListCarro() { return listCarro; }
    public void ListListCarro(List<Carro> listCarro) { Carro.listCarro = listCarro; }

    public String getChassi() { return chassi; }
    public void ListChassi(String chassi) { this.chassi = chassi; }

    public String getPlaca() { return placa; }
    public void ListPlaca(String placa) { this.placa = placa; }

    public String getModelo() { return modelo; }
    public void ListModelo(String modelo) { this.modelo = modelo; }

    public LocalDate getAno() { return ano; }
    public void ListAno(LocalDate ano) { this.ano = ano; }

    public String getRodizio() { return this.rodizio; }
    public void setRodizio(String rodizio) { this.rodizio = rodizio; }

    public int getBy(Carro carro){
        return listCarro.indexOf(carro);
    }

    public Carro getById(int id) {
        return listCarro.get(id);
    }

    public static class CarroBuilder{
        private String chassi;
        private String placa;
        private String modelo;
        private LocalDate ano;
        private String rodizio;

        public CarroBuilder chassi(String chassi){ this.chassi = chassi; return this;}
        public CarroBuilder placa(String placa){ this.placa = placa; return this;}
        public CarroBuilder modelo(String modelo){ this.modelo = modelo; return this;}
        public CarroBuilder ano(LocalDate ano){ this.ano = ano; return this;}
        public CarroBuilder rodizio(String rodizio){ this.rodizio = rodizio; return this;}

        public Carro build(){
            return new Carro(chassi, placa, modelo,  ano, rodizio);
        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "chassi='" + chassi + '\'' +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", rodizio='" + rodizio + '\'' +
                '}';
    }
}