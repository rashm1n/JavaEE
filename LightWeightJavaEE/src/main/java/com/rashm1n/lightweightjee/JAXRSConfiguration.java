package com.rashm1n.lightweightjee;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Configuring the JAXRS application. Could use <servlet-mapping> inside web.xml or a programming approach as seen here.
 */
@ApplicationPath("resources")
public class JAXRSConfiguration extends Application {
}
