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
public class VODisciplina {
    String nome, sigla, ementa;
    VODisciplina pre1, pre2, pre3;
    int cod_disciplina;
    int numHoras;
    int numCreditos;
    int periodo;
    String status;
    boolean obrigatoria;
    VOProfessor voProfessor;
    
}