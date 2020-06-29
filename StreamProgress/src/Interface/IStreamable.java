package Interface;

public abstract class IStreamable {
    private int length;
    private int bytesSent;

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * @return the bytesSent
     */
    public int getBytesSent() {
        return bytesSent;
    }

    /**
     * @param bytesSent the bytesSent to set
     */
    public void setBytesSent(int bytesSent) {
        this.bytesSent = bytesSent;
    }
    
}
