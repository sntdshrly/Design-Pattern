public class VendingMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public VendingMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("You can't insert another coins");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You inserted a coin");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't insert a coin, the machine is sold out");
        } else if (state == SOLD) {
            System.out.println("Please wait, we're already giving you a bottle");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Coin returned");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("You haven't inserted a coin");
        } else if (state == SOLD) {
            System.out.println("Sorry, you already turned the crank");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't eject, you haven't inserted a coin yet");
        }
    }

    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("Turning twice doesn't get you another bottle!");
        } else if (state == NO_QUARTER) {
            System.out.println("You turned but there's no coins");
        } else if (state == SOLD_OUT) {
            System.out.println("You turned, but there are no bottles");
        } else if (state == HAS_QUARTER) {
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }
    }

    private void dispense() {
        if (state == SOLD) {
            System.out.println("A bottle comes rolling out the slot");
            count = count - 1;
            if (count == 0) {
                System.out.println("Oops, out of bottles!");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("You need to pay first");
        } else if (state == SOLD_OUT) {
            System.out.println("No bottle dispensed");
        } else if (state == HAS_QUARTER) {
            System.out.println("No bottle dispensed");
        }
    }

    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = NO_QUARTER;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("Inventory: " + count + " bottle");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        if (state == SOLD_OUT) {
            result.append("sold out");
        } else if (state == NO_QUARTER) {
            result.append("waiting for quarter");
        } else if (state == HAS_QUARTER) {
            result.append("waiting for turn of crank");
        } else if (state == SOLD) {
            result.append("delivering a bottle");
        }
        result.append("\n");
        return result.toString();
    }
}
