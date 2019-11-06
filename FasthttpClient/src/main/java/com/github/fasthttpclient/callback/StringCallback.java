package com.github.fasthttpclient.callback;

import java.io.IOException;

import com.github.fasthttpclient.Response;
import okhttp3.Call;

/**
 * 
 * @author icecooly
 *
 */
public abstract class StringCallback extends Callback{
	//
	@Override
	public void onResponse(Call call, Response response, int id) {
		try {
			onSuccess(call,response.body().string(),id);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//
	public void onSuccess(Call call,String response,int id) {
		
	}
}
