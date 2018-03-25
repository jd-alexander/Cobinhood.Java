package api.cobinhood.api.models.market;

import java.util.List;

/**
 * Created by joel on 3/19/18.
 */

public class OrderBookItem {

    private int sequence;
    private List<OfferItem> bids;
    private List<OfferItem> asks;

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public List<OfferItem> getBids() {
        return bids;
    }

    public void setBids(List<OfferItem> bids) {
        this.bids = bids;
    }

    public List<OfferItem> getAsks() {
        return asks;
    }

    public void setAsks(List<OfferItem> asks) {
        this.asks = asks;
    }
}
