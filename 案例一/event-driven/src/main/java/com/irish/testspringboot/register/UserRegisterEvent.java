package com.irish.testspringboot.register;

import org.springframework.context.ApplicationEvent;

import com.irish.testspringboot.model.UserBean;

/**
 * spring会自动将该事件注册到applicationContext中
 * 这里有通过构造方法将事件源传递进去，有些场景可以用到，本例子中的事件源是UserService
 */
public class UserRegisterEvent extends ApplicationEvent
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//注册用户对象
    private UserBean user;

    /**
     * 重写构造函数
     * @param source 发生事件的对象
     * @param user 注册用户对象
     */
    public UserRegisterEvent(Object source,UserBean user) {
        super(source);
        this.user = user;
    }

	public UserBean getUser() {
		return user;
	}
    
    
}