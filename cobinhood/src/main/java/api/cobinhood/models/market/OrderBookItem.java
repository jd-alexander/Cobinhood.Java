package api.cobinhood.models.market;

import java.util.List;

/**
 * Created by joel on 3/19/18.
 */

public class OrderBookItem {

    private int sequence;
    private List<Offer> bids;
    private List<Offer> asks;

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public List<Offer> getBids() {
        return bids;
    }

    public void setBids(List<Offer> bids) {
        this.bids = bids;
    }

    public List<Offer> getAsks() {
        return asks;
    }

    public void setAsks(List<Offer> asks) {
        this.asks = asks;
    }
}
