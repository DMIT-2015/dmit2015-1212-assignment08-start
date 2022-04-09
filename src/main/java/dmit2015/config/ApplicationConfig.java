package dmit2015.config;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.annotation.sql.DataSourceDefinitions;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.annotation.FacesConfig;

// TODO: Set the Jakarta EE Authentication Mechanism

// TODO: Set the Jakarta EE Identity Store

@DataSourceDefinitions({

		@DataSourceDefinition(
			name="java:app/datasources/mssqlDS",
			className="com.microsoft.sqlserver.jdbc.SQLServerDataSource",
			url="jdbc:sqlserver://DMIT-Capstone1.ad.sast.ca;databaseName=DMIT2015_1212_A01_swu2015;TrustServerCertificate=true",   // change A01 to E01 if you are in section E01, change yourNaitUsername
			user="swu2015",
			password="RemotePassword200012345"),

//			name="java:app/datasources/mssqlDS",
//			className="com.microsoft.sqlserver.jdbc.SQLServerDataSource",
//			url="jdbc:sqlserver://localhost;databaseName=DMIT2015_1212_CourseDB;TrustServerCertificate=true",
//			user="user2015",
//			password="Password2015"),

})

@FacesConfig
@ApplicationScoped
public class ApplicationConfig {

}