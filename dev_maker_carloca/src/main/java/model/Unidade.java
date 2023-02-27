package model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "UNIDADE")
public class Unidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String endereco;

    @NotNull
    private String telefone;

}
