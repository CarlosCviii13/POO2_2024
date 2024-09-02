package poo2.estoque.fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import poo2.estoque.domain.Fornecedor;

public class FornecedorFakeDB extends BaseFakeDB<Fornecedor> {

    public FornecedorFakeDB(){
        super();
    }

    @Override
    protected void preencherLista() {
        if (this.lista == null){
            this.lista = new ArrayList<>();
        }
        this.lista.add(new Fornecedor(1L, LocalDate.now(), null, "Rua X", "Cidade X", "Estado X", "57270-972", "(64) 2389-2691", "x@gmail.com.br", "92.336.827/0001-99"));

    }    
}