package one.digitalinnovation.padroesprojetospring.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.padroesprojetospring.model.Cliente;
import one.digitalinnovation.padroesprojetospring.service.ClienteService;

/**
 * <p>ClienteRestController class.</p>
 *
 * @author WeversonCelio
 * @version $Id: $1.0
 */
@RestController
@RequestMapping("clientes")

public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    /**
     * <p>buscarTodos.</p>
     *
     * @return a {@link org.springframework.http.ResponseEntity} object.
     */
    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos(){
        return ResponseEntity.ok(clienteService.buscarTodos());
    }
    
    /**
     * <p>buscarPorId.</p>
     *s
     * @param id a {@link java.lang.Long} object.
     * @return a {@link org.springframework.http.ResponseEntity} object.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(clienteService.BuscarPorId(id));
    }

    /**
     * <p>inserir.</p>
     *
     * @param cliente a {@link one.digitalinnovation.padroesprojetospring.model.Cliente} object.
     * @return a {@link org.springframework.http.ResponseEntity} object.
     */
    //ResponseEntity 
    @PostMapping
	public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente) {
		clienteService.inserir(cliente);
		return ResponseEntity.ok(cliente);
	}


    /**
     * <p>atualizar.</p>
     *
     * @param id a {@link java.lang.Long} object.
     * @param cliente a {@link one.digitalinnovation.padroesprojetospring.model.Cliente} object.
     * @return a {@link org.springframework.http.ResponseEntity} object.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }

    /**
     * <p>deletar.</p>
     *
     * @param id a {@link java.lang.Long} object.
     * @return a {@link org.springframework.http.ResponseEntity} object.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        clienteService.deletar(id);
        return ResponseEntity.ok().build();

    }



    
}
