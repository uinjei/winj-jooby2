package com.winj;

import java.util.List;
import java.util.function.Function;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.ebean.Model;

public class EbeanService {
    
    private static final EbeanServer ebean = Ebean.getDefaultServer();
    
    public static <T extends Model> String insert(T t, Function<String,String> handler) {
        t.insert();
        return handler.apply("success");
    }
    
    public static <T> T findOne(Class<T> clazz, Long id, Function<T,T> handler) {
        return handler.apply(ebean.find(clazz, id));
    }
    
    public static <T> List<T> findAll(Class<T> clazz, Function<List<T>,List<T>> handler) {
        return handler.apply(ebean.find(clazz).findList());
    }
}
