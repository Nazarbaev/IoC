package demo;

public class MusicFactory {
    public  Music createMusic(String s) {
        Music music;
        if(s=="rock"){
            return new RockMusic();
        }  else if(s=="classic"){
            return new ClassicMusic();
        }
    return null;}
}
