package poo2.estoque.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class SubClasseProduto extends BaseParametro {
    private Long codigoClasse;

    public Long getCodigoClasse() {
        return codigoClasse;
    }

    public void setCodigoClasse(Long codigoClasse) {
        this.codigoClasse = codigoClasse;
    }
    
    public SubClasseProduto(){
        super();
    }

    public SubClasseProduto(Long codigo, LocalDate dataDeInclusao, LocalDate dataDeAlteracao, String descricao,
            Long codigoClasse) {
        super(codigo, dataDeInclusao, dataDeAlteracao, descricao);
        this.codigoClasse = codigoClasse;
    }

}
