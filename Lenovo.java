public class Lenovo implements Laptop {
    private int volume;
    private boolean isPowerOn;

    public Lenovo() { this.volume = 50; }

    @Override
    public void powerOn() { isPowerOn = true; System.out.println("Lenovo ON... Hello!"); }
    @Override
    public void powerOff() { isPowerOn = false; System.out.println("Lenovo OFF."); }
    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) volume += 10;
        System.out.println("Volume Lenovo: " + volume);
    }
    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) volume -= 10;
        System.out.println("Volume Lenovo: " + volume);
    }
}