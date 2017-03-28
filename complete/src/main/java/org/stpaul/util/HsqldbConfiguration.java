package org.stpaul.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.hsqldb.Server;
import org.hsqldb.persist.HsqlProperties;

import java.util.Properties;

/**
 * Created by tjc4h on 3/28/2017.
 */
@Configuration
public class HsqldbConfiguration {
    @Bean(initMethod = "start")
    public HsqldbServer hsqldbServer(){
        Properties props = new Properties();
        props.setProperty("server.database.0", "mem:testdb");
        props.setProperty("server.dbname.0", "testdb");
        props.setProperty("server.remote.open", "true");
        props.setProperty("hsqldb.reconfig_logging", "false");
        return new HsqldbServer(props);
    }
}
