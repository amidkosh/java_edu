package creational.object_pool;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

abstract public class ObjectPool<T> {
    ConcurrentLinkedQueue<T> pool;
    ScheduledExecutorService executorService;

    ObjectPool(final int minObjects){
        initialize(minObjects);
    }

    ObjectPool(final int minObjects,final int maxObjects, final long validationInterval){
        initialize(minObjects);
        executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                int size = pool.size();
                if(size < minObjects){
                    int sizeToBeAdded = minObjects + size;
                    for(int i =0;i<sizeToBeAdded;i++){
                        pool.add(createObject());
                    }
                }
                if(size > maxObjects){
                    int sizeToBeremoved = size - maxObjects;
                    for (int i= 0; i<sizeToBeremoved; i++){
                        pool.poll();
                    }
                }
            }
        },validationInterval,validationInterval, TimeUnit.SECONDS);
    }

    public T borrowObject() {
        T object;
        if ((object = pool.poll()) == null){
            object = createObject();
        }
        return object;
    }

    void returnObject(T object){
        if (object == null) {
            return;
        }
        pool.offer(object);
    }

    void shutdown(){
        if (executorService != null){
            executorService.shutdown();
        }
    }

    protected abstract T createObject();

    private void initialize(final int minObjects) {
        pool = new ConcurrentLinkedQueue<T>();
        for(int i= 0;i<minObjects;i++){
            pool.add(createObject());
        }
    }

}
