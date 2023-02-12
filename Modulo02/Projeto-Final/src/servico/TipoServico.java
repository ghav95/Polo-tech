package servico;

public class TipoServico {
    private byte complexidade;
    private boolean alvenaria;
    private boolean eletronico;
    private boolean eletrica;
    private boolean serralheria;

    public byte getComplexidade() { return complexidade; }
    public void setComplexidade(byte complexidade) { this.complexidade = complexidade; }

    public boolean isAlvenaria() { return alvenaria; }
    public void setAlvenaria(boolean alvenaria) { this.alvenaria = alvenaria; }

    public boolean isEletronico() { return eletronico; }
    public void setEletronico(boolean eletronico) { this.eletronico = eletronico; }

    public boolean isEletrica() { return eletrica; }
    public void setEletrica(boolean eletrica) { this.eletrica = eletrica; }

    public boolean isSerralheria() { return serralheria; }
    public void setSerralheria(boolean serralheria) { this.serralheria = serralheria; }
}
