package com.xworkz.assignment.music;

public class MusicRunner {
    public static void main(String[] args) {

        System.out.println("\n10. MusicPlayer");
        Music player = new Music();
        player.play("Imagine Dragons - 'ENEMY' ");
        player.changeVolume(75);
        player.pause();
    }
}
