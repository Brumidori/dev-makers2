package model;

import com.sun.istack.NotNull;
import javax.persistence.*;
import java.util.List;


@Entity
    @Table(name = "CARRO")
    public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String modelo;

    @NotNull
    private String montadora;

    @NotNull
    private Cor cor;

    @NotNull
    private String categoria;

    @NotNull
    private Double quilometragem_atual;

    @NotNull
    private boolean alocado;

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinTable(
            name = "LOCACAO_CARRO",
            joinColumns = @JoinColumn(name = "ID_CARRO", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "ID_LOCACAO", referencedColumnName = "id")
    )
    private List<Locacao> locacoes;
}
