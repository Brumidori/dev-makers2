package entities;

import java.time.LocalDate;
import java.util.Date;

public class Gato {
    private Long id;
    private String nome;
    private String dono;
    private Date datanascimento;

    @Override
    public String toString() {
        return "Gato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dono='" + dono + '\'' +
                ", datanascimento=" + datanascimento +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDono() {
        return dono;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }
}
