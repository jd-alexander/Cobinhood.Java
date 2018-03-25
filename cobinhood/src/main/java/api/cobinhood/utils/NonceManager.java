package api.cobinhood.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by joel on 3/24/18.
 */

public class NonceManager {

    private static NonceManager nonceManager;
    private List<Long> nonces;

    public static NonceManager getInstance() {
        if (nonceManager == null) {
            nonceManager = new NonceManager();
        }

        return nonceManager;
    }

    public Long getNonce()
    {

        if(nonces==null)
        {
            nonces = new ArrayList<>();
        }

        long value = new Date().getTime()/1000;

        if(nonces.contains(value))
            return getNonce();

        if(nonces.size() > 50)
            nonces.subList(0, 50).clear();

        nonces.add(value);

        return value;
    }

}
