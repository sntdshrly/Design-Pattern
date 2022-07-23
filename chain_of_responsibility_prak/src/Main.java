// Nama Program: Chain of Responsibility
// Nama/NRP: 2072025/Sherly Santiadi

import request.ClientRequest;
import targets.*;

public class Main {
    public static void main(String[] argv){
        ClientRequest clientRequest1 = new ClientRequest(Rak.ICE_CREAM_SMALL); // jona yang handle
        ClientRequest clientRequest2 = new ClientRequest(Rak.ICE_CREAM_MEDIUM); // joni yang handle
        ClientRequest clientRequest3 = new ClientRequest(Rak.ICE_CREAM_LARGE); // jono yang handle
        ClientRequest clientRequest = new ClientRequest(Rak.ICE_CREAM); // ga ada yang handle

        Child jona = new Jona();
        Child joni = new Joni();
        Child jono = new Jono();

        // jona --> joni --> jono
        // nanti coba ke si jona dulu, kalo ga sesuai dipass ke joni, kalo di joni ga sesuai dipass ke jono
        jona.setNextChild(joni);
        joni.setNextChild(jono);

        // si jona yang bakal proses request client pertama kali
        jona.processRequest(clientRequest1);
        jona.processRequest(clientRequest2);
        jona.processRequest(clientRequest3);
        jona.processRequest(clientRequest);
    }
}
