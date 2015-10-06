package ch.netstal.roberto.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import ch.netstal.roberto.osgi.api.Timable;

/**
 * @author alvr
 *
 */
public class Timer implements Timable {
	@Override
	public String getCurrentTime() {
		String currentTimeStr = new SimpleDateFormat("HH:mm:ss")
				.format(new Date(System.currentTimeMillis()));
		return currentTimeStr;
	}

	@Override
	public String getHello() {
		return "hello";
	}
}
