package uk.co.sammy.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

/**
 * Created by smlif on 25/01/2016.
 */
public class SqlConnector {
    private JdbcTemplate connector;

    public SqlConnector(DataSource dataSource) {
        connector = new JdbcTemplate(dataSource);
    }
}
