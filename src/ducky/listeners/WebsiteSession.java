package ducky.listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by KV on 17/12/2016.
 */

public class WebsiteSession implements HttpSessionListener {

	public static int numberOfSession = 0;

	@Override
	public void sessionCreated(HttpSessionEvent event) {
		event.getSession().getServletContext().log("A new session was created " + ++numberOfSession);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		event.getSession().getServletContext().log("A session was destroyed "+ --numberOfSession);
	}
}
