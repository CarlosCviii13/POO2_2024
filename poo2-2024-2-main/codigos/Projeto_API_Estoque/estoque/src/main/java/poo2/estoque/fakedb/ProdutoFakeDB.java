package poo2.estoque.fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import poo2.estoque.domain.Produto;

public class ProdutoFakeDB extends BaseFakeDB<Produto> {

    public ProdutoFakeDB(){
        super();
    }

    @Override
    protected void preencherLista() {
        if (this.lista == null){
            this.lista = new ArrayList<>();
        }
        double valorProduto = 22;
        this.lista.add(new Produto(1L, LocalDate.now(), null, "Queijo", 1L, valorProduto));
    }    
}