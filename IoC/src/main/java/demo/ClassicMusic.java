package demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class ClassicMusic implements Music{


    List<String> classicSongs = new ArrayList<>();
    {classicSongs.add("Mozart");
      classicSongs.add("Beethoven");
        classicSongs.add("Bach");
    }
    public List<String> getSong (){
        return classicSongs;
    }
}
