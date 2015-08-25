/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valueObject;

import java.util.List;

/**
 *
 * @author mateus
 */
public class VOTurma {
    String cod;
    private List<VOAluno> alunos;
    VOProfessor professor;
    VODisciplina disciplina;
}