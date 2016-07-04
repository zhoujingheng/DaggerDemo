package com.zjh.daggerdemo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zjh on 2016/7/4.
 * Model其实就是一个依赖制造工厂，我们只要为其添加制造依赖的方法即可
 * 一个完整的Module必须拥有@Module与@Provides注解
 */
@Module//注解@Module注明本类属于Module
public class ActivityModule {

    @Provides//注解@Provides注明该方法是用来提供依赖对象的特殊方法
    public UserModel provideUserModel(){
        return new UserModel("1", "hjx", "man");
    }
}
