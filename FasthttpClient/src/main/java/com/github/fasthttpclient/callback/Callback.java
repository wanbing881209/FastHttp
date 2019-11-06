package com.github.fasthttpclient.callback;

import com.github.fasthttpclient.Response;
import okhttp3.Call;

/**
 * 
 * @author icecooly
 */
public abstract class Callback{
	//
	public abstract void onFailure(Call call,Exception e,int id);
	//
	public abstract void onResponse(Call call,Response response, int id);
}