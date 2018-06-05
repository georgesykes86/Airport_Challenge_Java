public class Plane {
    private boolean flying = false;

    public boolean isFlying() {
        return flying;
    }

    public void land() {
        if (!this.isFlying()) throw new Error("Plane already on the ground");
        flying = false;
    }

    public void takeOff() {
        if (this.isFlying()) throw new Error("Plane already flying");
        flying = true;
    }
}
