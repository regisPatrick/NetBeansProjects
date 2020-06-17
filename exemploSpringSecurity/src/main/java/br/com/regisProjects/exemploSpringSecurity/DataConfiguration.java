/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisProjects.exemploSpringSecurity;

import java.io.File;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

/**
 *
 * @author user
 */
@Configuration
public class DataConfiguration {
    
        @Bean
        public DataSource dataSource(){
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName("org.firebirdsql.jdbc.FBDriver");
            dataSource.setUrl("jdbc:firebirdsql:localhost/3050:C:" + File.separator + "BD" + File.separator + "LOGIN_SENHA.FDB");
            dataSource.setUsername("SYSDBA");
            dataSource.setPassword("masterkey");
            return dataSource;
        }
        
        @Bean
        public JpaVendorAdapter jpaVendorAdapter(){
            HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
            adapter.setDatabase(Database.DEFAULT);
            adapter.setShowSql(true);
            adapter.setGenerateDdl(true);
            adapter.setDatabasePlatform("org.hibernate.dialect.FirebirdDialect");
            adapter.setPrepareConnection(true);
            return adapter;
        }

    
}
