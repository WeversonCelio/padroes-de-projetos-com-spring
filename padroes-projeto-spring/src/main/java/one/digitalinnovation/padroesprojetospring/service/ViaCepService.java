package one.digitalinnovation.padroesprojetospring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import one.digitalinnovation.padroesprojetospring.model.Endereco;

/**
 * <p>ViaCepService interface.</p>
 *
 * @author WeversoNB
 * @version $Id: $Id
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
    /**
     * <p>consultarCep.</p>
     *
     * @param cep a {@link java.lang.String} object.
     * @return a {@link one.digitalinnovation.padroesprojetospring.model.Endereco} object.
     */
    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
    
}
