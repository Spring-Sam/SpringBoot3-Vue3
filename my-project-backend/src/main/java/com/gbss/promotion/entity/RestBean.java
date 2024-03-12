package com.gbss.promotion.entity;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;

public class  RestBean<T> {

    private int code;

    private T data;

    private String message;

    public RestBean() {

    }


    public String asJsonString(){
        return JSONObject.toJSONString(this, JSONWriter.Feature.WriteNulls);

    }


    public RestBean(int code, T data, String message){
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public RestBean<T> Success(int code, T data, String message){
        return  new RestBean<>(code,data,message);
    }

    public RestBean<T> Failed(int code, T data, String message){
        return  new RestBean<>(code,data,message);
    }



    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
