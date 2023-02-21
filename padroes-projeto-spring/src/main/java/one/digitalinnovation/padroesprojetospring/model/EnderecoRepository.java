package one.digitalinnovation.padroesprojetospring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>EnderecoRepository interface.</p>
 *
 * @author WeversonCelio
 * @version $Id: $1.0
 */
@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
    
}
