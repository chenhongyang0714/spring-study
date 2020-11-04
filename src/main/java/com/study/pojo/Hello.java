package com.study.pojo;

/**
 * 该类已被Spring托管
 */
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    // Spring 将会利用 set方法 进行注入
    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
