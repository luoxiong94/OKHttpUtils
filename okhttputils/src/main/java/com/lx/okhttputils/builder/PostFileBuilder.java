package com.lx.okhttputils.builder;


import com.lx.okhttputils.OkHttpUtils;
import com.lx.okhttputils.request.PostFileRequest;
import com.lx.okhttputils.request.RequestCall;

import java.io.File;
import java.util.HashMap;

import okhttp3.MediaType;

/**
 * Created by luoXiong on 16/07/28.
 */
public class PostFileBuilder extends OkHttpRequestBuilder<PostFileBuilder> {
    private File file;
    private MediaType mediaType;


    public OkHttpRequestBuilder file(File file) {
        this.file = file;
        return this;
    }

    public OkHttpRequestBuilder mediaType(MediaType mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    @Override
    public RequestCall build() {
        return new PostFileRequest(url, tag, params, headers, file, mediaType, id).build();
    }


}
