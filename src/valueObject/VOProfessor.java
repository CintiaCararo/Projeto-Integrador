/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valueObject;

/**
 *
 * @author mateus
 */
public class VOProfessor extends VOPessoa {

    private String matricula;
    private VODepartamento departamento;
    private boolean isCHefe, isHabilitadoCFE;

    public boolean isChefeDepartamento() {
        return true;
    }
}
