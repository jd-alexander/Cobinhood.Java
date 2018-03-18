package api.coinbinhood.models.system;

/**
 * Created by joel on 3/18/18.
 */

public class Info {
    private String phase;
    private String revision;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }
}
