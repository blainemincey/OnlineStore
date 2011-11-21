package com.jboss.samples.onlinestore.rs;

import java.util.Set;
import java.util.HashSet;
import javax.ws.rs.core.Application;

public class OnlineStoreRESTApplication extends Application {

    private Set<Object> singletons = new HashSet<Object>();
    private Set<Class<?>> empty = new HashSet<Class<?>>();
    public OnlineStoreRESTApplication(){
         singletons.add(new OnlineStoreResource());
    }
    @Override
    public Set<Class<?>> getClasses() {
         return empty;
    }
    @Override
    public Set<Object> getSingletons() {
         return singletons;
    }
}
