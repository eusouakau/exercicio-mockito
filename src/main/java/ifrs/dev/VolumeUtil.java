package ifrs.dev;

public class VolumeUtil {

    private AudioManager audioManager = new AudioManager();

    public void maximizeVolume(int max) {
        audioManager.setVolume(max);
    }
}


