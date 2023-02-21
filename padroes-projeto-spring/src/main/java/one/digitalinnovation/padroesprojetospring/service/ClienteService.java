package one.digitalinnovation.padroesprojetospring.service;


import one.digitalinnovation.padroesprojetospring.model.Cliente;

/**
 * <p>ClienteService interface.</p>
 *
 * @author WeversonCelio
 * @version $Id: $1.0
 */
public interface ClienteService {
    /**
     * <p>buscarTodos.</p>
     *
     * @return a {@link java.lang.Iterable} object.
     */
    Iterable<Cliente> buscarTodos();

    /**
     * <p>BuscarPorId.</p>
     *
     * @param id a {@link java.lang.Long} object.
     * @return a {@link one.digitalinnovation.padroesprojetospring.model.Cliente} object.
     */
    Cliente BuscarPorId(Long id);

    /**
     * <p>inserir.</p>
     *
     * @param cliente a {@link one.digitalinnovation.padroesprojetospring.model.Cliente} object.
     */
    void inserir(Cliente cliente);

    /**
     * <p>atualizar.</p>
     *
     * @param id a {@link java.lang.Long} object.
     * @param cliente a {@link one.digitalinnovation.padroesprojetospring.model.Cliente} object.
     */
    void atualizar(Long id, Cliente cliente);

    /**
     * <p>deletar.</p>
     *
     * @param id a {@link java.lang.Long} object.
     */
    void deletar(Long id);

    
    
}
