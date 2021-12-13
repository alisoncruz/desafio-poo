import br.com.poo.dominio.Bootcamp;
import br.com.poo.dominio.Curso;
import br.com.poo.dominio.Dev;
import br.com.poo.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso Javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev alison = new Dev();
        alison.setNome("Alison");
        alison.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + alison.getConteudosIncritos());
        System.out.println("Conteudos concluídos" + alison.getConteudosConcluidos());
        System.out.println("Total XP" + alison.calcularTotalXp());

        alison.progredir();

        System.out.println("Conteudos inscritos" + alison.getConteudosIncritos());
        System.out.println("Conteudos concluídos" + alison.getConteudosConcluidos());
        System.out.println("Total XP" + alison.calcularTotalXp());



    }
}
