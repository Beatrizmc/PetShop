/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.beatrizmc.model;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author guest01
 */
public class Venda {
    private int cod;
    private Date dataVen;
    private Time horaVen;
    private Funcionario funcionario;
    private Cliente cliente;
    private FormaPagamento formaPag;
    
}
