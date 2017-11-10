/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoprograma;

/**
 *
 * Classe que define o objeto Carro
 *
 * @author Edson Melo de Souza
 */
public class Carro {

    // Atributos da classe encapsulados (visibilidade privada)
    private String chassi;
    private String cor;
    private String modelo;

    // Métodos Getters e Setters
    /**
     * Método para recuperação do valor contido no atributo chassi
     *
     * @return chassi
     */
    public String getChassi() {
        return chassi;
    }

    /**
     * Método para atribuição de valor para o atributo chassi
     *
     * @param chassi
     */
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    /**
     * Método para recuperação do valor contido no atributo cor
     *
     * @return chassi
     */
    public String getCor() {
        return cor;
    }

    /**
     * Método para atribuição de valor do atributo cor
     *
     * @param cor
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Método para recuperação do valor contido no atributo modelo
     *
     * @return chassi
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Método para atribuição de valor do atributo modelo
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
