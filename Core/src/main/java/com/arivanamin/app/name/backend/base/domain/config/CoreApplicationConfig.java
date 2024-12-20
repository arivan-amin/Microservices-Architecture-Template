package com.arivanamin.app.name.backend.base.domain.config;

import java.nio.file.Path;
import java.time.ZoneId;

import static java.lang.System.getProperty;
import static java.nio.file.Paths.get;

public final class CoreApplicationConfig {
    
    public static final String APPLICATION_DIRECTORY_NAME = "App-Name";
    
    public static final String BASE_PACKAGE = "com.arivanamin.app.name.backend";
    
    public static final String LIQUIBASE_CHANGELOG_PATH =
        "classpath:db/changelog/changelog-master.xml";
    
    public static final String APP_TIMEZONE = "Asia/Baghdad";
    public static final ZoneId ZONE_ID = ZoneId.of(APP_TIMEZONE);
    
    static final String USER_HOME_DIRECTORY_PROPERTY = "user.home";
    
    private CoreApplicationConfig () {
    }
    
    public static Path getApplicationConfigDirectory () {
        return get(getUserHomeDirectory(), "Apps", APPLICATION_DIRECTORY_NAME);
    }
    
    private static String getUserHomeDirectory () {
        return getProperty(USER_HOME_DIRECTORY_PROPERTY);
    }
}
