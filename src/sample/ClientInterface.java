package sample;

import java.io.IOException;
import java.io.InputStream;
import java.rmi.Remote;

public interface ClientInterface extends Remote{
    public void saveFile(InputStream input) throws IOException;

}