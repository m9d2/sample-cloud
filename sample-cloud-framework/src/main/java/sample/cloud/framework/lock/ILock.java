package sample.cloud.framework.lock;

public interface ILock {

    boolean tryLock();

    void unlock();
}
