package one.digitalinovation.gof;
/**
 *
 * Singleton "Lazy Holder"
 * **/
public class SingletonLazyHolder {

    public static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instancia;
    }
}
