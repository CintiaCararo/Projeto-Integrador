/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regraDeNegocio;

import java.util.List;
import valueObject.VOCurso;

/**
 *
 * @author mateus
 */
public class RNCurso {

    private VOCurso voCurso;

    public boolean inserir() {
        return false;
    }

    public boolean remover() {
        return false;
    }

    public boolean alterar() {
        return false;
    }

    public VOCurso consultar(String nome) {
        return null;
    }

    public List<VOCurso> listar() {
        return null;
    }

    public VOCurso getVoCurso() {
        return voCurso;
    }

    public void setVoCurso(VOCurso voCurso) {
        this.voCurso = voCurso;
    }

}
