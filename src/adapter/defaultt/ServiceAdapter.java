package adapter.defaultt;

/**
 * 适配器模式的用意是要改变源的接口，以便于目标接口相容。
 * 缺省适配的用意稍有不同，它是为了方便建立一个不平庸的适配器类而提供的一种平庸实现。
 */
public abstract class ServiceAdapter implements AbstractService{

    @Override
    public void serviceOperation1() {
    }

    @Override
    public int serviceOperation2() {
        return 0;
    }

    @Override
    public String serviceOperation3() {
        return null;
    }

}
