package gov.usgs.cida.wqp.util;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.log4j.Logger;

public class JndiUtils {
	private static final Logger LOG = Logger.getLogger(JndiUtils.class);
	
	private static Context envContext;

	static {
		try {
			Context initContext = new InitialContext();
			envContext  = (Context)initContext.lookup("java:/comp/env");
		} catch (NamingException e) {
			envContext = null;
			// TODO should fail fast here
			LOG.error("JNDI ERROR: Cannot access Tomcat java:/comp/env", e);
		}
	}
	
	public static DataSource jndiDataSource(String lookupResource) { // TODO Throw App Exception
		
		DataSource ds = null; // TODO custom exception instead
		try {
			ds = (DataSource) envContext.lookup(lookupResource);
		} catch (NamingException e) {
			LOG.error("JNDI ERROR: Cannot access Tomcat " + lookupResource, e);
		} catch (ClassCastException e) {
			LOG.error("JNDI ERROR: This resouce is not a DataSource. " + lookupResource, e);
		}
		
		return ds;
		
	}

}
