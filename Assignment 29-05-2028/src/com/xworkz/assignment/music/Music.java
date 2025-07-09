package com.xworkz.assignment.music;

public class Music {
    //9.Create a MusicPlayer class with currentSong and volume. Add methods to play, pause, and change volume.
    String currentSong;
    int volume;

    public void play(String currentSong){
        this.currentSong=currentSong;
        System.out.println("Now playing "+"--"+currentSong+"--");
    }
    public void pause(){
        this.currentSong=currentSong;
        System.out.println("Paused "+currentSong);
    }
    public void changeVolume(int volume){
        this.volume=volume;
        System.out.println("Volume is set to :"+volume);
    }
}
