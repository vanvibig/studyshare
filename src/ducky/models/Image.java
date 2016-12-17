package ducky.models;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * Created by KV on 17/12/2016.
 */

public class Image implements HttpSessionBindingListener, HttpSessionActivationListener {
	private String name;
	private int width, height;

	public Image(String name, int width, int height) {
		this.name = name;
		this.width = width;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		event.getSession().getServletContext().log("Image in the session" + getName());
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		event.getSession().getServletContext().log("Image out the session" + getName());
	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent httpSessionEvent) {

	}

	@Override
	public void sessionDidActivate(HttpSessionEvent httpSessionEvent) {

	}
}
