package poo2.estoque.repository;

public class FornecedorRepositorio {
    public ClasseProdutoRepositorio(){
        ClasseProdutoFakeDB db = new ClasseProdutoFakeDB();
        this.storage = db.getLista();
    }

    @Override
    public ClasseProduto Create(ClasseProduto instancia) {
        ClasseProduto p = this.storage.getLast();
        Long novoCodigo = p.getCodigo() + 1;
        instancia.setCodigo(novoCodigo);
        this.storage.add(instancia);    
        return instancia;
    }

    @Override
    public ClasseProduto Read(Long codigo) {
        for (ClasseProduto p : this.storage) {
            if (p.getCodigo() == codigo){
                return p;
            }
        }
        return null;    }

    @Override
    public ClasseProduto Update(ClasseProduto instancia) {
        ClasseProduto p = this.Read(instancia.getCodigo());
        if (p != null) {
            p.setDescricao(instancia.getDescricao());
            return p;
        }
        else {
            return null;
        }    
    }

    @Override
    public ClasseProduto Delete(Long codigo) {
        ClasseProduto p = this.Read(codigo);
        if (p != null){
            this.storage.remove(p);
            return p;
        }
        else {
            return null;
        }
    }
}