/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexandre
 */
public class DiarioDeClasse implements Avaliacao {

    private List<Nota> notas = new ArrayList<>();
    private List<Frequencia> frequencias = new ArrayList<>();

    @Override
    public void registrarNota(Aluno aluno, Disciplina disciplina, double nota) {
        Nota n = new Nota();
        n.setAluno(aluno);
        n.setDisciplina(disciplina);
        n.setValor(nota);
        notas.add(n);
    }

    @Override
    public void registrarFrequencia(Aluno aluno, Disciplina disciplina, boolean presente) {
        Frequencia f = new Frequencia();
        f.setAluno(aluno);
        f.setDisciplina(disciplina);
        f.setPresente(presente);
        frequencias.add(f);
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public List<Frequencia> getFrequencias() {
        return frequencias;
    }
}