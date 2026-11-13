/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academico;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alexandre
 */
public class Secretaria implements Matriculavel {

    private List<Matricula> matriculas = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno, Turma turma) {
        Matricula m = new Matricula();
        m.setAluno(aluno);
        m.setTurma(turma);
        m.setDataMatricula(new Date());
        matriculas.add(m);
        turma.getAlunos().add(aluno);
    }

    @Override
    public void cancelarMatricula(Aluno aluno, Turma turma) {
        Matricula achada = null;
        for (Matricula m : matriculas) {
            if (m.getAluno() == aluno && m.getTurma() == turma) {
                achada = m;
            }
        }
        matriculas.remove(achada);
        turma.getAlunos().remove(aluno);
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }
}