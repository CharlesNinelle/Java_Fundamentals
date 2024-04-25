package OpdrachtAUDIOPLAYER;

public class AudioPlayer {
    private MediaAdapter mediaAdapter;

    public void play(String audioType, String fileName){
        if (audioType.equalsIgnoreCase("MP3")){
            System.out.println("Playing MP3 file. Name:"+fileName);
        }else if (audioType.equalsIgnoreCase("VLC")||audioType.equalsIgnoreCase("MP4")){
            mediaAdapter=new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);

        }else {
            System.out.println("Not supported format: "+audioType);
        }
    }
}
