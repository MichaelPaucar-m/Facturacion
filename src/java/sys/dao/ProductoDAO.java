
package sys.dao;

import java.util.List;
import sys.modelo.Producto;
import sys.modelo.Vendedor;

public interface ProductoDAO {
    
    public List<Producto> select();
    public void insert(Producto producto);
    public void update(Producto producto);
    public void delete(Producto producto);
}

