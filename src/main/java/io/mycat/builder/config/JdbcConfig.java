package io.mycat.builder.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@EnableJdbcRepositories("io.mycat.builder") // 这里的扫描目录要写好了
public class JdbcConfig {
    // @Bean
    // public DataSource dataSource() {

    // EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
    // return builder.setType(EmbeddedDatabaseType.HSQL).build();
    // }
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        return jdbcTemplate;
    }
}