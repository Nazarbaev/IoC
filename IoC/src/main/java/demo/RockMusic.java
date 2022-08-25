package demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class RockMusic implements Music {
    List<String> rockSongs = new ArrayList<>();

    {rockSongs.add("AC/DC");
        rockSongs.add("Pink Floyd");
        rockSongs.add("Heart");}
    public List<String> getSong(){
        return rockSongs;
    }
}
