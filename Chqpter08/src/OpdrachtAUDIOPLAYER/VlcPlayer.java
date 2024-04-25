package OpdrachtAUDIOPLAYER;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
public void playVLC(String fileName){
        System.out.println("Plaing- VLC file. Name:"+fileName);
    }
    @Override
    public void playMP4(String fileName){
        //empty
    }
}
