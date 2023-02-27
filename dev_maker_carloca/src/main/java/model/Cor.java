package model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "COR")
public enum Cor {
    BRANCO, PRETO, PRATA;
}
