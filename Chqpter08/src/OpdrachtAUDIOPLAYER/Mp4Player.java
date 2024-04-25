package OpdrachtAUDIOPLAYER;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVLC(String fileName){
        //emtty
    }
    @Override
    public void playMP4(String fileName){
        System.out.println("Plaing- MP4 file. Name:" +fileName);
    }
}
