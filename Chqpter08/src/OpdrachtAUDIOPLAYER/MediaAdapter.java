package OpdrachtAUDIOPLAYER;

public class MediaAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer; //AdvancedMediaPlayer - declaration of a private field
    // of a class variable that will save the instance. This field is used inside the class

 public MediaAdapter(String audioType){
     if (audioType.equalsIgnoreCase("VLC")){
         advancedMediaPlayer=new VlcPlayer();
     }else  if (audioType.equalsIgnoreCase("MP4")){
         advancedMediaPlayer=new Mp4Player();
     }
 }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("VLC")){
        advancedMediaPlayer.playVLC(fileName);
    }else if(audioType.equalsIgnoreCase("MP4")){
        advancedMediaPlayer.playMP4(fileName);
    }

    }
}
