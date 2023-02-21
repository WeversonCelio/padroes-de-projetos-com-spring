package one.digitalinnovation.padroesprojetospring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * <p>Endereco class.</p>
 *
 * @author WeversonCelio
 * @version $Id: $1.0
 */
@Entity
public class Endereco {
    @Id
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    

    /**
     * <p>Getter for the field <code>cep</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getCep() {
        return cep;
    }
    /**
     * <p>Setter for the field <code>cep</code>.</p>
     *
     * @param cep a {@link java.lang.String} object.
     */
    public void setCep(String cep) {
        this.cep = cep;
    }
    /**
     * <p>Getter for the field <code>logradouro</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getLogradouro() {
        return logradouro;
    }
    /**
     * <p>Setter for the field <code>logradouro</code>.</p>
     *
     * @param logradouro a {@link java.lang.String} object.
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    /**
     * <p>Getter for the field <code>complemento</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getComplemento() {
        return complemento;
    }
    /**
     * <p>Setter for the field <code>complemento</code>.</p>
     *
     * @param complemento a {@link java.lang.String} object.
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    /**
     * <p>Getter for the field <code>bairro</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBairro() {
        return bairro;
    }
    /**
     * <p>Setter for the field <code>bairro</code>.</p>
     *
     * @param bairro a {@link java.lang.String} object.
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    /**
     * <p>Getter for the field <code>localidade</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getLocalidade() {
        return localidade;
    }
    /**
     * <p>Setter for the field <code>localidade</code>.</p>
     *
     * @param localidade a {@link java.lang.String} object.
     */
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    /**
     * <p>Getter for the field <code>uf</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getUf() {
        return uf;
    }
    /**
     * <p>Setter for the field <code>uf</code>.</p>
     *
     * @param uf a {@link java.lang.String} object.
     */
    public void setUf(String uf) {
        this.uf = uf;
    }
    /**
     * <p>Getter for the field <code>ibge</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getIbge() {
        return ibge;
    }
    /**
     * <p>Setter for the field <code>ibge</code>.</p>
     *
     * @param ibge a {@link java.lang.String} object.
     */
    public void setIbge(String ibge) {
        this.ibge = ibge;
    }
    /**
     * <p>Getter for the field <code>gia</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getGia() {
        return gia;
    }
    /**
     * <p>Setter for the field <code>gia</code>.</p>
     *
     * @param gia a {@link java.lang.String} object.
     */
    public void setGia(String gia) {
        this.gia = gia;
    }
    /**
     * <p>Getter for the field <code>ddd</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDdd() {
        return ddd;
    }
    /**
     * <p>Setter for the field <code>ddd</code>.</p>
     *
     * @param ddd a {@link java.lang.String} object.
     */
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
    /**
     * <p>Getter for the field <code>siafi</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSiafi() {
        return siafi;
    }
    /**
     * <p>Setter for the field <code>siafi</code>.</p>
     *
     * @param siafi a {@link java.lang.String} object.
     */
    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

    
    
}
