package sltest.debug.SlTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger log = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( System.getenv("classpath") );
        
        
        log.debug("Hello World!----1 debug");
        log.info( "Hello World!----1 info" );

        log.error("error Hello World!----1 info");
        
        System.out.println("============================");
        System.setProperty("org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY", "TRACE");
        //System.setProperty("org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY", "FINE");

        final org.slf4j.Logger log2 = LoggerFactory.getLogger(App.class);

        log2.trace("trace----21");
        log2.debug("debug----2");
        log2.info("info----2");
        log2.warn("warning----2");
        log2.error("error----2");

    }
}
