package creational.singleton;

public final class SingletonHolder {
    private SingletonHolder() {}

    private static class Holder {
        private static final SingletonHolder _instance = new SingletonHolder();
    }

    public static SingletonHolder getInstance() {
        return Holder._instance;
    }
}