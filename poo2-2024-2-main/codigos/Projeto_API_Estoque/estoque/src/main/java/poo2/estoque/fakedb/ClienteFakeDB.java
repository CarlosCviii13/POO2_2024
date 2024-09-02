package poo2.estoque.fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import poo2.estoque.domain.Cliente;

public class ClienteFakeDB extends BaseFakeDB<Cliente> {

    public ClienteFakeDB(){
        super();
    }

    @Override
    protected void preencherLista() {
        if (this.lista == null){
            this.lista = new ArrayList<>();
        }
        this.lista.add(new Cliente(1L, LocalDate.now(), null, "Rua X", "Cidade X", "Estado X", "57270-972", "(64) 2389-2691", "x@gmail.com.br", "387.568.111-87"));
    }    
}