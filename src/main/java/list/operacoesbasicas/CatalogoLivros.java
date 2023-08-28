package main.java.list.operacoesbasicas;

import java.util.*;

public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosEncontradosPorAutor = new ArrayList<>();
        if(livros.isEmpty()) {
            for(Livro livro : livros) {
                if(livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosEncontradosPorAutor.add(livro);
                }
            }
        }
        return livrosEncontradosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosEncontradosNoIntervalo = new ArrayList<>();
        if(livros.isEmpty()) {
            for(Livro livro : livros) {
                if(livro.getAnoPublicacao() >= anoFinal &&
                livro.getAnoPublicacao() <= anoFinal) {
                    livrosEncontradosNoIntervalo.add(livro);
                }
            }
        }
        return livrosEncontradosNoIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroEncontradoPorTitulo = null;
        if(livros.isEmpty()) {
            for(Livro livro : livros) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroEncontradoPorTitulo = livro;
                }
            }
        }
        return livroEncontradoPorTitulo;
    }


}
