package ch.netstal.roberto.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import ch.netstal.roberto.osgi.api.Timable;

public class Activator implements BundleActivator {

	ServiceRegistration<Timable> serviceRegistration;

	public void start(BundleContext context) throws Exception {
		serviceRegistration = context.registerService(Timable.class, new Timer(), null);
	}
	
	public void stop(BundleContext context) throws Exception {
		System.out.println("Timable Service stopped");
	}
}
