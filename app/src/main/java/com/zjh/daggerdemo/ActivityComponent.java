package com.zjh.daggerdemo;

import dagger.Component;

/**
 * Created by zjh on 2016/7/4.
 * Component就是一个将Module生产的实例注入Container中的注入器
 */
@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
