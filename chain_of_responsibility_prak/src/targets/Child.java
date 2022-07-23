// Nama Program: Chain of Responsibility
// Nama/NRP: 2072025/Sherly Santiadi

package targets;

import request.ClientRequest;

public abstract class Child {
    private Child nextChild;

    public abstract void processRequest(ClientRequest motherRequest);

    public Child getNextChild() {
        return nextChild;
    }

    public void setNextChild(Child nextChild) {
        this.nextChild = nextChild;
    }
}
