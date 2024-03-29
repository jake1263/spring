package com.irish.testspringboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.irish.testspringboot.model.UserBean;
import com.irish.testspringboot.register.UserRegisterEvent;

@Component
public class RegisterListener implements ApplicationListener<UserRegisterEvent>
{
    /**
     * 实现监听
     * @param userRegisterEvent
     */
    @Override
    @Async
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //获取注册用户对象
        UserBean user = userRegisterEvent.getUser();
        //../省略逻辑
        //输出注册用户信息
        System.out.println("注册信息，用户名："+user.getName()+"，密码："+user.getPassword());
    }
}