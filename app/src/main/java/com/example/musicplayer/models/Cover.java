package com.example.musicplayer.models;

import com.google.gson.annotations.SerializedName;

public class Cover{

	@SerializedName("url")
	private String url;

	public String getUrl(){
		return url;
	}
}