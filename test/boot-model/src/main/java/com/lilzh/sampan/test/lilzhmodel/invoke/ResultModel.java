package com.lilzh.sampan.test.lilzhmodel.invoke;

import com.lilzh.sampan.test.lilzhmodel.base.BaseEntity;

public class ResultModel extends BaseEntity {

    private boolean isSuccess;

    private String value;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ResultModel{" +
                "isSuccess=" + isSuccess +
                ", value='" + value + '\'' +
                '}';
    }
}
