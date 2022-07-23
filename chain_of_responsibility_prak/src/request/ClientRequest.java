// Nama Program: Chain of Responsibility
// Nama/NRP: 2072025/Sherly Santiadi

package request;

import targets.Rak;

public class ClientRequest {
    private Rak shelf;

    public ClientRequest(Rak shelf) {
        this.shelf = shelf;
    }

    public Rak getShelf() {
        return shelf;
    }
}
