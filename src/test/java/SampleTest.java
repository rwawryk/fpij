import org.junit.Test;

/**
 * Created by rafal.wawryk on 13/07/16.
 */
public class SampleTest {

    @Test
    public void test() {
        setParam(new Object[]{"1", "2","3"});
        setParam(new String[]{"1", "2","3"});
        setParam(new Integer[]{1, 2,3});


    }

    private void setParam(Object[] array) {
        System.out.println(array);
    }

}
