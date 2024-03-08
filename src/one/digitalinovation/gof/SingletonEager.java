package one.digitalinovation.gof;
/**
 *
 * Singleton "Apressado"
 * **/
public class SingletonEager {

    public static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instancia;
    }
}
