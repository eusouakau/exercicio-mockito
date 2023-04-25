package ifrs.dev;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class VolumeUtilTest {

    @Mock
    AudioManager audioManager;

    @InjectMocks
    VolumeUtil volumeUtil = new VolumeUtil();


    @Test
    public void testAudioManagerSetVolume() {
        
        volumeUtil.maximizeVolume(1);
 
        verify(audioManager, times(1)).setVolume(1);

    }

}
