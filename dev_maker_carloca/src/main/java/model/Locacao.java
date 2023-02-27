package model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
    @Table(name = "LOCACAO")
    public class Locacao {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotNull
        private String modelo;

        @NotNull
        private LocalDate data_locacao;

        @NotNull
        private LocalDate data_devolucao;

        @NotNull
        private String categoria;

        @NotNull
        private double quilometragem_inicial;

        @NotNull
        private double quilometragem_final;

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinTable(
            name = "LOCACAO_UNIDADE",
            joinColumns = @JoinColumn(name = "ID_LOCACAO", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "ID_UNIDADE", referencedColumnName = "id")
    )
    private Unidade unidade_locacao;

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinTable(
            name = "DEVOLUCAO_UNIDADE",
            joinColumns = @JoinColumn(name = "ID_LOCACAO", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "ID_UNIDADE", referencedColumnName = "id")
    )
    private Unidade unidade_devolucao;

}
