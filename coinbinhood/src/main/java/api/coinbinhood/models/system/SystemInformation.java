package api.coinbinhood.models.system;

import api.coinbinhood.models.BaseModel;

/**
 * Created by joel on 3/18/18.
 */

public class SystemInformation extends BaseModel {
    private SystemInformationResult result;

    public SystemInformationResult getResult() {
        return result;
    }

    public void setResult(SystemInformationResult result) {
        this.result = result;
    }
}
