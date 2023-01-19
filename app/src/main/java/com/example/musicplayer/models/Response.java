package com.example.musicplayer.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("hasVideo")
	private boolean hasVideo;

	@SerializedName("image")
	private Image image;

	@SerializedName("releaseDate")
	private String releaseDate;

	@SerializedName("album")
	private Album album;

	@SerializedName("localized")
	private boolean localized;

	@SerializedName("title")
	private String title;

	@SerializedName("duration")
	private int duration;

	@SerializedName("copyrighted")
	private boolean copyrighted;

	@SerializedName("artists")
	private List<ArtistsItem> artists;

	@SerializedName("id")
	private String id;

	@SerializedName("audio")
	private Audio audio;

	@SerializedName("lyrics")
	private String lyrics;

	@SerializedName("downloadCount")
	private String downloadCount;

	public boolean isHasVideo(){
		return hasVideo;
	}

	public Image getImage(){
		return image;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public Album getAlbum(){
		return album;
	}

	public boolean isLocalized(){
		return localized;
	}

	public String getTitle(){
		return title;
	}

	public int getDuration(){
		return duration;
	}

	public boolean isCopyrighted(){
		return copyrighted;
	}

	public List<ArtistsItem> getArtists(){
		return artists;
	}

	public String getId(){
		return id;
	}

	public Audio getAudio(){
		return audio;
	}

	public String getLyrics(){
		return lyrics;
	}

	public String getDownloadCount(){
		return downloadCount;
	}
}