package one.digital.inovation.singleton;
/**
 * Singleton "lazer Holder"
 */
public class SingletonLazyHolder {
    private static class Holder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();

    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
       return Holder.instancia;
    }
 
}
