package demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.Random;

public class MusicPlayer {







    private Music music;



    @Getter @Setter
    private String name;
    @Getter @Setter
    private int volume;


    public MusicPlayer(Music music){
      this.music=music;
    }


    public void playMusic(){
        System.out.println("Playing" + music.getSong());


    }


}
