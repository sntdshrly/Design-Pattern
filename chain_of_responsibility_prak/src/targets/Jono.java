// Nama Program: Chain of Responsibility
// Nama/NRP: 2072025/Sherly Santiadi

package targets;

import request.ClientRequest;

public class Jono extends Child{
    @Override
    public void processRequest(ClientRequest motherRequest) {
        if(motherRequest.getShelf().equals(Rak.ICE_CREAM_LARGE))
            System.out.println("Jona mengambil ice cream berukuran large dari rak.");
        else
            throw new UnsupportedOperationException("Request tidak dikenali!");
    }
}
