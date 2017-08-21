package com.jx.jebe.api.classloader;

import com.jx.jebeapi.spat.BaseHandler;

import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiaowei on 17/8/21.
 */
public class JebeClassloader {
    public static JebeClassloader jebeClassloader = new JebeClassloader();
    private static Map kvmap = new HashMap();
    public void readAction(String url){
        if(null == url || "".equals(url))
            return;
        String[] url_arry = url.split("/");
        if(null == url_arry || url_arry.length < 2)
            return;
        String key = url_arry[1];
        if(kvmap.containsKey(key)){

        }

    }
    public static void main(String[] args){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL url = classLoader.getResource("/opt/argo/jebeapi/workflow");
        URL[] url_arry = new URL[]{url};
        MyclassLoader myclassLoader = new MyclassLoader(url_arry);
        Class<BaseHandler> handler = null;
        try {
            handler = (Class<BaseHandler>) myclassLoader.loadClass("com.jx.api.workflow.handlers.Handler");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            BaseHandler h = handler.newInstance();
            try {
                Method method = handler.getMethod("sayHello");
                method.invoke(h,null);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }

}
