package one.digitalinovation.gof.singleton;

/**
 *
 * Singleton 'preguiçoso'
 * num primeiro momento ele não disponibiliza
 *
 *
 * **/
public class SingletonLazy {
    private static SingletonLazy instancia;

    //Construtor privado para que ninguém externamente instancie essa classe
    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
