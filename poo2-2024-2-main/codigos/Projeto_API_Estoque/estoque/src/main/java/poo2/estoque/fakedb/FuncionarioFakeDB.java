package poo2.estoque.fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import poo2.estoque.domain.Funcionario;

public class FuncionarioFakeDB extends BaseFakeDB<Funcionario> {

    public FuncionarioFakeDB(){
        super();
    }

    @Override
    protected void preencherLista() {
        if (this.lista == null){
            this.lista = new ArrayList<>();
        }
        this.lista.add(new Funcionario(1L, LocalDate.now(), null, "Rua X", "Cidade X", "Estado X", "57270-972", "(64) 2389-2691", "x@gmail.com.br", 1));

    }    
}