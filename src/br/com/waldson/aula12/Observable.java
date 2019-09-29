package br.com.waldson.aula12;

public interface Observable {
    public void registerObserver(FilaBanco filaBanco);
    public void removeObserver(FilaBanco filaBanco);
    public void notifyObservers();

}
