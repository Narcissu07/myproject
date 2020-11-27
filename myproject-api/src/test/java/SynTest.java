import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName SynTest
 * @Description: TODO
 * @Author pj
 * @Date 2020/11/27
 * @Version V1.0
 **/
public class SynTest {
    private static final Logger logger = LoggerFactory.getLogger(SynTest.class);
    public static void main(String[] args) {
        SynTest synTest = new SynTest();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                synTest.update("orderId1");
            }
        });
        t.start();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synTest.update("orderId1");
            }
        });
        t1.start();



        }

    private void update(String orderId){
        //orderId = orderId.intern();
        //String orderNum = new String("Order0001");
        logger.info(""+System.identityHashCode(orderId));
        synchronized (orderId){
            logger.info("---------同步代码块测试--------");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            logger.info("---------结束--------");
        }

    }

}
