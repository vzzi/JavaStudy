package com.tencent.util;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.lang.reflect.Type;

public class JSON {

    private static final Gson gson = new Gson();


    public static String toJson(final Object obj) {
        return gson.toJson(obj);
    }

    public static <T> T fromJson(final String str, Class<T> cls) {
        return gson.fromJson(str, cls);
    }


    public static JsonElement toJsonTree(final Object obj) {
        return gson.toJsonTree(obj);
    }


    public static <T> T fromJson(final String str, Type type) {
        return gson.fromJson(str, type);
    }
}
