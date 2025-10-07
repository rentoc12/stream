package test.java;

import Main.java.Pessoa;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class PessoaTest {

    @Test
    public void TestandoMulheres() {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Mariana", "F"),
                new Pessoa("Renato", "M"),
                new Pessoa("Maiara", "F"),
                new Pessoa("Diego", "M"),
                new Pessoa("Greice", "F")
        );

        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("F"))
                .collect(Collectors.toList());

        Assert.assertTrue(mulheres.stream().allMatch(p -> p.getSexo().equalsIgnoreCase("F")));
    }

}
