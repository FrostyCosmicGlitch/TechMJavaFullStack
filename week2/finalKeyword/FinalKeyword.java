final class FinalClass {
    final int MAX_SPEED = 120;
    public final void showSpeedLimit() {
        System.out.println("Speed limit is " + MAX_SPEED + " km/h");
    }
}

class FinalKeyword {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.showSpeedLimit();
    }
}
