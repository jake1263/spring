package com.irish.testspringboot.listener;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.irish.testspringboot.register.UserRegisterEvent;

//采用注解的方式添加事件监听
@Component
public class RegisterUserEmailListener
{
    /**
     * 发送邮件监听实现
     * @param userRegisterEvent 用户注册事件
     */
    @EventListener
    @Async
    public void sendMail(UserRegisterEvent userRegisterEvent)
    {
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("用户注册成功，发送邮件。");
    }
}