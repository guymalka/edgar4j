package org.jds.edgar4j.startup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "edgar4j.elasticsearch.startup.enabled", havingValue = "true", matchIfMissing = false)
@Slf4j
public class ElasticsearchStartup implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        log.info("Elasticsearch startup is disabled (elasticsearch dependency not available)");
    }
}
