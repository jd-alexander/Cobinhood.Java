package api.cobinhood.tests;


import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by joel on 3/25/18.
 */

public abstract class BaseTest {

    protected <T> void AssertList(List<T> result)
    {
        assertNotNull(result);

        assertTrue(result.size() >=  1);

        System.out.print(result.get(0).toString());

    }

    protected <T> void Assert(T result)
    {
        assertNotNull(result);


        System.out.print(result.toString());

    }


}
