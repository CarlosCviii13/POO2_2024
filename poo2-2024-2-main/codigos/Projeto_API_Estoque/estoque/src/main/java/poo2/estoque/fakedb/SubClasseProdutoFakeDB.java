package poo2.estoque.fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import poo2.estoque.domain.SubClasseProduto;

public class SubClasseProdutoFakeDB extends BaseFakeDB<SubClasseProduto> {

    public SubClasseProdutoFakeDB(){
        super();
    }

    @Override
    protected void preencherLista() {
        if (this.lista == null){
            this.lista = new ArrayList<>();
        }
        this.lista.add(new SubClasseProduto(1L, LocalDate.now(), null, "Leite tipo A", 1L));
    }    
}
