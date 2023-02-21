package one.digital.inovation.singleton;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonLazy lazy2 = SingletonLazy.getInstancia();
        System.out.println(lazy2);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonEager eager2 = SingletonEager.getInstancia();
        System.out.println(eager2);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder2);
    
    }
    
}
