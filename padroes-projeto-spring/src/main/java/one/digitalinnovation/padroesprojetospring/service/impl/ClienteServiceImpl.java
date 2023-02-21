package one.digitalinnovation.padroesprojetospring.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.padroesprojetospring.model.Cliente;
import one.digitalinnovation.padroesprojetospring.model.ClienteRepository;
import one.digitalinnovation.padroesprojetospring.model.Endereco;
import one.digitalinnovation.padroesprojetospring.model.EnderecoRepository;
import one.digitalinnovation.padroesprojetospring.service.ClienteService;
import one.digitalinnovation.padroesprojetospring.service.ViaCepService;

/**
 * <p>
 * ClienteServiceImpl class.
 * </p>
 *
 * @author WeversonCelio
 * @version $Id: $1.0
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    /** {@inheritDoc} */
    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();

    }

    /** {@inheritDoc} */
    @Override
    public Cliente BuscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    /** {@inheritDoc} */
    @Override
    public void inserir(Cliente cliente) {
        cliente = salvarClienteComCep(cliente);
        clienteRepository.save(cliente);

    }

    /** {@inheritDoc} */
    @Override
    public void atualizar(Long id, Cliente cliente) {
        // fazer a buscar do cliente
       Optional<Cliente> clienteBd = clienteRepository.findById(id);
       if(clienteBd.isPresent()){
        cliente = salvarClienteComCep(cliente);
        cliente.setId(id);
        clienteRepository.save(cliente);
       }
       


    }

    /** {@inheritDoc} */
    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    
    private Cliente salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();

        //caso nao exista, o endereco sera integrado via API
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });

        // Criar endereco
         cliente.setEndereco(endereco);
         return cliente;
    }


}
