// Nama Program: Chain of Responsibility
// Nama/NRP: 2072025/Sherly Santiadi

package targets;

import request.ClientRequest;

public class Jona extends Child{
    @Override
    public void processRequest(ClientRequest motherRequest) {
        if(motherRequest.getShelf().equals(Rak.ICE_CREAM_SMALL))
            System.out.println("Jona mengambil ice cream berukuran small dari rak.");
        else
            getNextChild().processRequest(motherRequest);
    }
}
