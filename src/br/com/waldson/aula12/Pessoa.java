package br.com.waldson.aula12;


import java.util.ArrayList;
import java.util.List;

//observado
public class Pessoa implements Observable {
    private List<FilaBanco> observers = new ArrayList();
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome  = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        this.notifyObservers();
    }

    @Override
    public void registerObserver(FilaBanco filaBanco) {
            observers.add(filaBanco);
    }

    @Override
    public void removeObserver(FilaBanco filaBanco) {
            observers.remove(filaBanco);
    }

    @Override
    public void notifyObservers() {
        for (FilaBanco ob : observers) {
            System.out.println("Notificando observers!");
            ob.update(this);
        }


    }
}
