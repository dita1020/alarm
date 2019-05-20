import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
public class alertVoice extends alertMesssage {
    public alertVoice(){
        
    }
    @Override
    public void alert(String vpath){
        InputStream in;
        try {
            in = new FileInputStream(new File(vpath));
            AudioStream audios = new AudioStream(in);
            AudioPlayer.player.start(audios);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
