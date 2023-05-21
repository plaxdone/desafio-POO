import java.time.LocalDate;

import br.com.dio.bootcamp.dominio.Bootcamp;
import br.com.dio.bootcamp.dominio.Curso;
import br.com.dio.bootcamp.dominio.Dev;
import br.com.dio.bootcamp.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso teste");
        curso.setDescricao("Descrição teste");
        curso.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria teste");
        mentoria.setDescricao("Descrição de mentoria de teste");
        mentoria.setData(LocalDate.of(2023, 5, 10));
        
        System.out.println(curso);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp teste");
        bootcamp.setDescricao("Descricao de teste");;
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devJorge = new Dev();
        devJorge.setNome("Jorge");
        devJorge.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo inscrito " + devJorge.getConteudosInscritos());
        System.out.println("Conteudo concluido " + devJorge.getConteudosConcluidos());
        System.out.println("XP: " + devJorge.calcularTotalXp());
        devJorge.progredir();
        System.out.println("---------------------");
        System.out.println("Conteudo inscrito " + devJorge.getConteudosInscritos());
        System.out.println("Conteudo concluido " + devJorge.getConteudosConcluidos());
        System.out.println("XP: " + devJorge.calcularTotalXp());
        devJorge.progredir();
        System.out.println("Conteudo inscrito " + devJorge.getConteudosInscritos());
        System.out.println("Conteudo concluido " + devJorge.getConteudosConcluidos());
        System.out.println("XP: " + devJorge.calcularTotalXp());
    }
}