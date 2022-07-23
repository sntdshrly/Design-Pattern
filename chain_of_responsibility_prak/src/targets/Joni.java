// Nama Program: Chain of Responsibility
// Nama/NRP: 2072025/Sherly Santiadi

package targets;

import request.ClientRequest;

public class Joni extends Child{
    @Override
    public void processRequest(ClientRequest motherRequest) {
        if(motherRequest.getShelf().equals(Rak.ICE_CREAM_MEDIUM))
            System.out.println("Joni mengambil ice cream berukuran medium dari rak.");
        else
            getNextChild().processRequest(motherRequest);
    }
}
