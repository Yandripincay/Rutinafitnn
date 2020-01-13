package com.example.rutinafitnn.pecho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.rutinafitnn.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Main74Activity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener,YouTubePlayer.PlaybackEventListener {
    String ClaveYoutube="AIzaSyBHTwlGGm3eQ48mr4Y-P3XlonSMB3ely0E";
    YouTubePlayerView mYoutube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main74);
        mYoutube=(YouTubePlayerView)findViewById(R.id.video_youtube74);
        mYoutube.initialize(ClaveYoutube,this);

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean fuerestaurado) {
        if (!fuerestaurado){
            youTubePlayer.cueVideo("OjgcZt8UXCg");
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        if (youTubeInitializationResult.isUserRecoverableError()){
            youTubeInitializationResult.getErrorDialog(this,1).show();
        }else{
            String error="error al inicializar youtube"+youTubeInitializationResult.toString();
            Toast.makeText(getApplication(),error,Toast.LENGTH_LONG).show();
        }
    }
    protected void onActivityResult(int requestCode, int resultcode, Intent data){
        if (resultcode==1){
            getYoutubePlayerProvider().initialize(ClaveYoutube,this);
        }
    }
    protected YouTubePlayer.Provider getYoutubePlayerProvider(){
        return mYoutube;
    }

    @Override
    public void onPlaying() {

    }

    @Override
    public void onPaused() {

    }

    @Override
    public void onStopped() {

    }

    @Override
    public void onBuffering(boolean b) {

    }

    @Override
    public void onSeekTo(int i) {

    }
}