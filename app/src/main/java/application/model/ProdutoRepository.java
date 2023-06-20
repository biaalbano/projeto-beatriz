package application.model;

import org.springframework.data.repository.CrudRepository;
public class ProdutoRepository extends CrudRepository<Produto, Integer>{

    public Object findAll() {
        return null;
    }
}
