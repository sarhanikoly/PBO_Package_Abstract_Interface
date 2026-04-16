public class Toshiba implements Laptop {
    private int volume;
    private boolean isPowerOn;

    public Toshiba() { this.volume = 40; }

    @Override
    public void powerOn() { isPowerOn = true; System.out.println("Toshiba ON... Innovation!"); }
    @Override
    public void powerOff() { isPowerOn = false; System.out.println("Toshiba OFF."); }
    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) volume += 10;
        System.out.println("Volume Toshiba: " + volume);
    }
    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) volume -= 10;
        System.out.println("Volume Toshiba: " + volume);
    }
}