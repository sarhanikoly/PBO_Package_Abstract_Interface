public class MacBook implements Laptop {
    private int volume;
    private boolean isPowerOn;

    public MacBook() { this.volume = 60; }

    @Override
    public void powerOn() { isPowerOn = true; System.out.println("MacBook ON... Ding!"); }
    @Override
    public void powerOff() { isPowerOn = false; System.out.println("MacBook OFF."); }
    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) volume += 10;
        System.out.println("Volume MacBook: " + volume);
    }
    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) volume -= 10;
        System.out.println("Volume MacBook: " + volume);
    }
}