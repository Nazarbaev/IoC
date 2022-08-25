package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //demo.ClassicMusic music =(demo.ClassicMusic) context.getBean("class");
        //MusicPlayer player = (MusicPlayer) context.getBean("musicPlayer");
       //player.playMusic(Genre.CLASSIC);

        MusicPlayer music = (MusicPlayer) context.getBean("musicPlayer");
        music.playMusic();



}}
