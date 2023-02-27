package entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "TB_GATOS")
public class Gato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(name = "DATANASCIMENTO")
    private Date datanascimento;

    @Column(name = "ID_DONO")
    private Integer idDono;

    @Override
    public String toString() {
        return "Gato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dono='" + idDono + '\'' +
                ", datanascimento=" + datanascimento +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdDono() {
        return idDono;
    }

    public void setIdDono(Integer idDono) {
        this.idDono = idDono;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Date getDatanascimento() {
        return datanascimento;
    }
}
