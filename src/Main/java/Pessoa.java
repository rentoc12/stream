package Main.java;

import java.util.*;
import java.util.stream.Collectors;

public class Pessoa {
    private String nome;
    private String sexo; // "M" para masculino, "F" para feminino

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return nome + " (" + sexo + ")";
    }
}

class Main {
    public static void main(String[] args) {
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

        List<Pessoa> homens = pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("M"))
                .collect(Collectors.toList());

        System.out.println("Criando com a classe de mulheres");
        mulheres.forEach(System.out::println);
        System.out.println("Criando com a classe de homens");
        homens.forEach(System.out::println);
    }
}