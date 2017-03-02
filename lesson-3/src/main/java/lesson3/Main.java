package lesson3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
//@Configuration
//@EnableCaching
//@EnableScheduling
//@ComponentScan({"cabuki", "cdms", "jp.ixam_drive"})
//@EntityScan({"jp.ixam_drive.facebook.model.entity", "cabuki.general.entity", "cdms.models"})
//@EnableJpaRepositories({"jp.ixam_drive.facebook.model.repository", "cabuki.facebook.web.repository", "cabuki.general" +
//        ".repository", "cdms.repository"})
//@EnableConfigurationProperties({S3BucketsProperties.class, FacebookS3ClientProperties.class})
//@EnableAutoConfiguration(exclude = ElastiCacheAutoConfiguration.class)
public class Main {

    public static void main(String... args) {
        SpringApplication.run(Main.class, args);
    }

//    @Bean
//    public Jackson2ObjectMapperBuilder jacksonBuilder() {
//        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
//        builder.modules(new FacebookAdsModule());
//        return builder;
//    }

//    @Bean
//    public CacheManager cacheManager() {
//        SimpleCacheManager cacheManager = new SimpleCacheManager();
//
//        List<ConcurrentMapCache> cacheTargetList = Lists.newArrayList();
//        cacheTargetList.add(new ConcurrentMapCache(CacheValueKeys.TARGETING_BEHAVIORS));
//        cacheTargetList.add(new ConcurrentMapCache(CacheValueKeys.TARGETING_COUNTRIES));
//        cacheTargetList.add(new ConcurrentMapCache(CacheValueKeys.TARGETING_INTERESTS));
//        cacheTargetList.add(new ConcurrentMapCache(CacheValueKeys.TARGETING_LOCALES));
//        cacheTargetList.add(new ConcurrentMapCache(CacheValueKeys.TARGETING_REGIONS));
//        cacheTargetList.add(new ConcurrentMapCache(CacheValueKeys.TARGETING_USER_DEVICE));
//        cacheManager.setCaches(cacheTargetList);
//        return cacheManager;
//    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Main.class);
    }
}
