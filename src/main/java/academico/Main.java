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
public class Main {
    public static void main(String[] args) {
        //Objetos Professor e Aluno
        Professor prof = new Professor();
        prof.setNome("Alexandre");
        prof.setRegistro("P001");
        
        Aluno ana = new Aluno();
        ana.setNome("Ana");
        ana.setMatricula("2026001");
        
        Aluno bruno = new Aluno();
        bruno.setNome("Bruno");
        bruno.setMatricula("2026002");
        
        //Objetos Disciplina TP e BD
        Disciplina tp = new Disciplina();
        tp.setNome("Técnicas de Programação");
        tp.setCargaHoraria(80);
        tp.setProfessor(prof);
        
        Disciplina bd = new Disciplina();
        bd.setNome("Banco de Dados");
        bd.setCargaHoraria(80);
        bd.setProfessor(prof);
        
        //Lista com as disciplinas que a turma cursa
        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(tp);
        disciplinas.add(bd);
        
        //Turma 2º DSM
        Turma dsm2 = new Turma();
        dsm2.setCodigo("F-109-2026-2");
        dsm2.setAno(2026);
        dsm2.setProfessor(prof);
        dsm2.setDisciplinas(disciplinas);
        System.out.println("Turma: "+ dsm2.getCodigo());
        System.out.println("Professor: "+dsm2.getProfessor().getNome()
                   + " (Registro: "+ dsm2.getProfessor().getRegistro()+")");
        System.out.println("Disciplinas da turma: "+dsm2.getDisciplinas().size());

        //Secretaria: matricular
        Secretaria secretaria = new Secretaria();
        secretaria.matricular(ana, dsm2);
        secretaria.matricular(bruno, dsm2);
        System.out.println();
        System.out.println("Matriculas: "+ secretaria.getMatriculas().size());
        System.out.println("Alunos matriculados na turma "+dsm2.getCodigo()+":");
        for(Aluno a : dsm2.getAlunos()){
            System.out.println("- "+a.getNome() 
                    + " (Matricula: "+a.getMatricula()+")");
        }
        
        //Secretaria: cancelar
        secretaria.cancelarMatricula(bruno, dsm2);
        System.out.println();
        System.out.println("Matricula cancelada: "+bruno.getNome());
        System.out.println("Matriculas depois de cancelar: "+secretaria.getMatriculas().size());
        System.out.println("Alunos matriculados na turma "+dsm2.getCodigo()+":");
        for(Aluno a : dsm2.getAlunos()){
            System.out.println("- "+a.getNome() 
                    + " (Matricula: "+a.getMatricula()+")");
        }
        
        //Diário de Classe: notas e frequências
        DiarioDeClasse diario = new DiarioDeClasse();
        diario.registrarNota(ana, tp, 8.5);
        diario.registrarNota(ana, bd, 0.0);
        diario.registrarFrequencia(ana, tp, true);
        diario.registrarFrequencia(ana, bd, false);
        System.out.println();
        System.out.println("Notas registradas: "+diario.getNotas().size());
        System.out.println("Frequencias registradas: "+diario.getFrequencias().size());
        
        //Consultas
        System.out.println();
        System.out.println("Notas da aluna Ana em " +tp.getNome()+":");
        for(Nota n : diario.getNotas()){
            if(n.getAluno() == ana && n.getDisciplina() == tp){
                System.out.println("- "+ n.getValor());
            }
        }
        
        System.out.println();
        System.out.println("Frequencias da aluna Ana em "+ bd.getNome() + ":");
        for(Frequencia f : diario.getFrequencias()){
            if(f.getAluno() == ana && f.getDisciplina() == bd){
                if(f.getPresente()){
                    System.out.println("- Presente");
                }else{
                    System.out.println("- Ausente");
                }
            }
        }
    }
}
