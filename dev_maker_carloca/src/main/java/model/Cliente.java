package model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;


@Entity
    @Table(name = "CLIENTE")
    public class Cliente {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotNull
        private String nome;

        @NotNull
        private String endereco;

        @NotNull
        private String telefone;

        @NotNull
        private List<Locacao> locacoes;

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinTable(
            name = "CLIENTE_LOCACAO",
            joinColumns = @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "ID_LOCACAO", referencedColumnName = "id")
    )
        private List<Locacao> locacaos;
}
