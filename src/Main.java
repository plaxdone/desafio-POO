import java.time.LocalDate;

import br.com.dio.bootcamp.dominio.Curso;
import br.com.dio.bootcamp.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Curso de teste", "Descrição do curso de teste", 20);

        Mentoria mentoria = new Mentoria("Mentiroria teste", "Descrição de teste", LocalDate.of(2023, 05, 10));
        
        System.out.println(curso);
        System.out.println(mentoria);
    }
}