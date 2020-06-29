package Model;

import Interface.IStreamable;

public class File extends IStreamable {
    private String name;
    
    public File(String name, int length, int bytessSent ) {
        this.name = name;
        super.setLength(length);
        super.setBytesSent(bytessSent);
    }
    
    @Override
    public int getLength() {
        return super.getLength();
    }
    
    @Override 
    public void setLength(int length) {
        super.setLength(length);
    }
    
    @Override 
    public int getBytesSent() {
        return super.getBytesSent();
    }
    
    @Override 
    public void setBytesSent(int bytesSent) {
        super.setBytesSent(bytesSent);
    }
}
