package com.jx.jebe.api.classloader;

import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandlerFactory;

/**
 * Created by xiaowei on 17/8/21.
 */
public class MyclassLoader extends URLClassLoader {

    public MyclassLoader(URL[] urls, ClassLoader parent) {
        super(urls, parent);
    }

    public MyclassLoader(URL[] urls) {
        super(urls);
    }

    public MyclassLoader(URL[] urls, ClassLoader parent, URLStreamHandlerFactory factory) {
        super(urls, parent, factory);
    }
}
