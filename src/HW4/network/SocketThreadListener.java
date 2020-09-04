package HW4.network;

import java.net.Socket;

public interface SocketThreadListener {

    void onSocketStart(HW4.network.SocketThread thread, Socket socket);
    void onSocketStop(HW4.network.SocketThread thread);
    void onSocketReady(HW4.network.SocketThread thread, Socket socket);
    void onReceiveString(HW4.network.SocketThread thread, Socket socket, String msg);
    void onSocketException(HW4.network.SocketThread thread, Throwable throwable);

}