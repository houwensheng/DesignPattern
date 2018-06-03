package singleton;

/**
 * 既可以实现线程安全地创建实例，而又不会对性能造成太大的影响。
 * 它只是第一次创建实例的时候同步，以后就不需要同步了，从而加快了运行速度。
 * 
 * 由于volatile关键字可能会屏蔽掉虚拟机中一些必要的代码优化，所以运行效率并不是很高。
 * 因此一般建议，没有特别的需要，不要使用。也就是说，虽然可以使用“双重检查加锁”机制来实现线程安全的单例，
 * 但并不建议大量采用，可以根据情况来选用。
 * @author HR
 *
 */
public class SingletonDoubleCheck {
	//被volatile修饰的变量的值，将不会被本地线程缓存，
	//所有对该变量的读写都是直接操作共享内存，从而确保多个线程能正确的处理该变量
    private volatile static SingletonDoubleCheck instance = null;
    private SingletonDoubleCheck(){}
    public static SingletonDoubleCheck getInstance(){
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if(instance == null){
            //同步块，线程安全的创建实例
            synchronized (SingletonDoubleCheck.class) {
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if(instance == null){
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
