/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.beatrizmc.model;

import java.util.Date;

/**
 *
 * @author guest01
 */
public class Produto {
    private int cod;
    private String descricao;
    private int codBarras;
    private CategoriaProduto categoria;
    private int qtdEstoque;
    private Double precoVenda;
    private Double precoCusto;
    private Date dtValidade;
    private String status;
    
}
