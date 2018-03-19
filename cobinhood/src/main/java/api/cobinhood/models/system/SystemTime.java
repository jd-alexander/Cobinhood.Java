package api.cobinhood.models.system;

import api.cobinhood.models.BaseModel;

/**
 * Created by joel on 3/18/18.
 */

public class SystemTime extends BaseModel {
    private SystemTimeResult result;

    public SystemTimeResult getResult() {
        return result;
    }

    public void setResult(SystemTimeResult result) {
        this.result = result;
    }
}

