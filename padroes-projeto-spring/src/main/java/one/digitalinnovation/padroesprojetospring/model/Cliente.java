package one.digitalinnovation.padroesprojetospring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * <p>Cliente class.</p>
 *
 * @author WeversonCelio
 * @version $Id: $1.0
 */
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String nome;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @ManyToOne
    private Endereco endereco;

    /**
     * <p>getId.</p>
     *
     * @return a {@link java.lang.Long} object.
     */
    public Long getId() {
        return Id;
    }

    /**
     * <p>setId.</p>
     *
     * @param id a {@link java.lang.Long} object.
     */
    public void setId(Long id) {
        Id = id;
    }

    /**
     * <p>Getter for the field <code>endereco</code>.</p>
     *
     * @return a {@link one.digitalinnovation.padroesprojetospring.model.Endereco} object.
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * <p>Setter for the field <code>endereco</code>.</p>
     *
     * @param endereco a {@link one.digitalinnovation.padroesprojetospring.model.Endereco} object.
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
    
}
