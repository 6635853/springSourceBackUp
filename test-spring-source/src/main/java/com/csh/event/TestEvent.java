package com.csh.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author csh
 * @version 1.0
 * @date 2020/7/1
 * @package com.csh.event
 */
public class TestEvent extends ApplicationEvent {

	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public TestEvent(Object source) {
		super(source);
	}

	public String msg;

	public TestEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	public void print() {
		System.out.println(msg);
	}
}
