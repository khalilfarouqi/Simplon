package DAO_Brief;

public interface DAO <T>{

    public void Ajouter(T t);

    public void supprimer(T t);

    public void modifier(T t);

    public void lister(T t);


}
