/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regraDeNegocio;

import java.util.List;
import valueObject.VOAluno;

/**
 *
 * @author mateus
 */
public class RNAluno {

    private VOAluno voAluno;

    public RNAluno() {
    }

    public RNAluno(VOAluno voAluno) {
        this.voAluno = voAluno;
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

    public VOAluno consultar(String ra) {
        return null;
    }

    public List<VOAluno> listar() {
        return null;
    }

    public VOAluno getVoAluno() {
        return voAluno;
    }

    public void setVoAluno(VOAluno voAluno) {
        this.voAluno = voAluno;
    }
}
