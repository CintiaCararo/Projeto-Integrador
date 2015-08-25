/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valueObject;

import java.util.Date;

/**
 *
 * @author mateus
 */
public class VOPessoa {
    
    private String nome, email1, email2, nacionalidade,
        estado_civil, CPF;
    char sexo;
    Date data_de_nascimento;
    VOTelefone tel1, tel2, tel3;
    VOEndereco endereco;
}
