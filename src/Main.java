import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.dio.bootcamp.dominio.Curso;
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
    }
}