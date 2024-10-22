package sample.cloud.framework.lock;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Component;

@Component
public class RedisILock implements ILock {

    private final RedissonClient redissonClient;

    public RedisILock(RedissonClient redissonClient) {
        this.redissonClient = redissonClient;
    }


    @Override
    public boolean tryLock() {
        RLock lock = redissonClient.getLock("lock");
        try {
            return lock.tryLock(10, 10, java.util.concurrent.TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void unlock() {
        RLock lock = redissonClient.getLock("lock");
        lock.unlock();
    }
}
