/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regraDeNegocio;

import java.util.List;
import valueObject.VOProfessor;

/**
 *
 * @author mateus
 */
public class RNProfessor {

    private VOProfessor voProfessor;

    public RNProfessor() {
    }

    public RNProfessor(VOProfessor voProfessor) {
        this.voProfessor = voProfessor;
    }

    public boolean inserir() {
        return false;
    }

    public boolean remover() {
        return false;
    }

    public boolean alterar() {
        return false;
    }

    public VOProfessor consultar(String matricula) {
        return null;
    }

    public List<VOProfessor> listar() {
        return null;
    }

    public VOProfessor getVoProfessor() {
        return voProfessor;
    }

    public void setVoProfessor(VOProfessor voProfessor) {
        this.voProfessor = voProfessor;
    }
}
