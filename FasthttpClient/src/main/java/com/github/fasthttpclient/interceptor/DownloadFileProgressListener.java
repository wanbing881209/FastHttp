package com.github.fasthttpclient.interceptor;

/**
 * 
 * @author icecooly
 *
 */
public interface DownloadFileProgressListener {
	void updateProgress(long downloadLenth, long totalLength, boolean done);
}