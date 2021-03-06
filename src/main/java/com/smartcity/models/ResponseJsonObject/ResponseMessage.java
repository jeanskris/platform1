package com.smartcity.models.ResponseJsonObject;

import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;

/**
 * Created by ZJDX on 2016/6/25.
 */
@ResponseBody
public class ResponseMessage implements Serializable{
    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    private Object message;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    private int result;
    @Override
    public String toString(){
        return "message:"+this.getMessage()+"  result:"+this.getResult();
    }
}
