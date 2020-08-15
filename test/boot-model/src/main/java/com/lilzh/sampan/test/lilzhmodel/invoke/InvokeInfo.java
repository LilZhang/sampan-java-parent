package com.lilzh.sampan.test.lilzhmodel.invoke;

import com.lilzh.sampan.test.lilzhmodel.base.BaseEntity;


public class InvokeInfo extends BaseEntity {

    private String name;

    private int idx;

    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "InvokeInfo{" +
                "name='" + name + '\'' +
                ", idx=" + idx +
                ", value='" + value + '\'' +
                '}';
    }
}
