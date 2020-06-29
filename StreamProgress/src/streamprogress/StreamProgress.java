package streamprogress;

import Model.File;
import Model.Music;
import Model.StreamProgressInfo;

public class StreamProgress {

    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("Test", 12, 12);
        Music music = new Music("Some name", "Cool", 15, 2222);
        
        StreamProgressInfo stramFileInfo = new StreamProgressInfo(file);
        StreamProgressInfo stramMusicInfo = new StreamProgressInfo(music);
        
        System.out.println(stramFileInfo.CalculateCurrentPercent());
        System.out.println(stramMusicInfo.CalculateCurrentPercent());
        
    }
    
}
