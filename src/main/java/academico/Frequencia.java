/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academico;

/**
 *
 * @author Alexandre
 */
public class Frequencia {

    private Aluno aluno;
    private Disciplina disciplina;
    private Boolean presente;

    public Aluno getAluno() {
        return aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Boolean getPresente() {
        return presente;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void setPresente(Boolean presente) {
        this.presente = presente;
    }
}