package currency;


public class CryptoBase {
    private String timestamp;
    private boolean success;
    private String error;
    private Ticker ticker;

    public CryptoBase(Ticker ticker, String timeStamp, boolean success, String error) {
        this.timestamp = timeStamp;
        this.success = success;
        this.error = error;
        this.ticker = ticker;
    }

    public CryptoBase() {
    }

    public Ticker getTicker() {
        return ticker;
    }

    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "CryptoBase{" +
                "timeStamp=" + timestamp +
                ", success=" + success +
                ", error='" + error + '\'' +
                ", ticker=" + ticker +
                '}';
    }
}
