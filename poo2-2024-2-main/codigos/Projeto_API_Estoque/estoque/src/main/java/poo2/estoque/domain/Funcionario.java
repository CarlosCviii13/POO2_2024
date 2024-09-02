package poo2.estoque.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class Funcionario extends BasePessoa{
    private int codigoTipoFunc;

    public int getCodigoTipoFunc() {
        return codigoTipoFunc;
    }

    public void setCodigoTipoFunc(int codigoTipoFunc) {
        this.codigoTipoFunc = codigoTipoFunc;
    }

    public Funcionario() {
    }

    public Funcionario(Long codigo, LocalDate dataDeInclusao, LocalDate dataDeAlteracao, String endereco, String cidade,
            String estado, String cep, String telefone, String email, int codigoTipoFunc) {
        super(codigo, dataDeInclusao, dataDeAlteracao, endereco, cidade, estado, cep, telefone, email);
        this.codigoTipoFunc = codigoTipoFunc;
    }


}
