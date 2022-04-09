# DMIT2015 Assignment 8
1. Configure the *wildfly-jar-maven-plugin* in `pom.xml` to:

    1. Add a `layer` element for `ee-security`
    1. Add a `layer` element for `undertow-https`
    1. Add a `cli-session` to enable Jakarat EE Security

1. Add a secrity constraint in `web.xml` to force the use HTTPS for all URLs in the application.

1. Add a security constraint in `web.xml` to restrict access to the following url patterns and role names.

| url-pattern | role-name |
|:------------|:---------:|
|/bills/create.xhtml<br>/bills/edit.xhtml| Finance

4. Add a security constraint in `web.xml` to restrict access to the following url patterns and role names.

| url-pattern | role-name |
|:------------|:---------:|
|/bills/delete.xhtml<br>/bills/payments/create.xhtml<br>/bills/payments/edit.xhtml<br>/bills/payments/delete.xhtml| Accounting|

5. Add a security constraint in `web.xml` to restrict access to the following url patterns and role names.

| url-pattern | role-name |
|:------------|:---------:|
|/bills/index.xhtml<br>/bills/details.xhtml<br>/bills/detailsContenxt.xhtml<br>/bills/payments/index.xhtml<br>/bills/payments/details.xhtml<br>/bills/payments/detailsContenxt.xhtml | Accounting<br>Finance<br>Executive

6. Configure the project (`ApplicationConfig.java`, `customLogin.xhtml`, `Login.java`, `Logout.java`) to use a Custom Form Authentication mechanism.

1. Configure the project (`ApplicationConfig.java`) to use a LDAP identity store to the Windows 2019 Server VM.

1. Modify the JSF layout file `/src/main/webapp/WEB-INF/jsf-templates/layout.xhml` with a link to login and a link logout.

1. Modify `Bill.java` and add a property for the authenticated `username`.

1. Using either an CDI Interceptor or modify the `BillRepository.java` method `create()` directly to set the `username` of the Bill before it is persisted.

1. Modify `BillRepository.java` method `findAll()` directly to work as follows:

    If the caller is anonymous (non-authenticated) user then throw an `RuntimeException`.

    If the caller is the role *Finance* then return a list of Bill entity filter by the username of the caller.

    If the caller is the role *Accounting* or *Executive* then return a list of a Bill entity.

    If the caller is not in the role *Finance* or *Accounting* or *Executive* then return a empty list.

1. Modify `BillPaymentRepository.java` method `findAll()` to work as follows:

    If the caller is anonymous (non-authenticated) user then throw an `RuntimeException`.

    If the caller is the role *Finance* then return a list of Bill entity filter by the username of the caller.

    If the caller is the role *Accounting* or *Executive* then return a list of a Bill entity.

    If the caller is not in the role *Finance* or *Accounting* or *Executive* then return a empty list.

1. Using either Jakarta Security Annotations or CDI Interceptors restrict access to the methods `create()` and `update()` to the role *Finance* in `BillRepository.java` and `BillPaymentRepository.java`.

1. Using either Jakarta Security Annotations or CDI Interceptors restrict access to the methods `remove()` and `delete()` to the role *Accounting* in `BillRepository.java` and `BillPaymentRepository.java`.

1. Using either Jakarta Security Annotations or CDI Interceptors restrict access to the method `findOneById()` to the roles *Finance*, *Accounting*, *Executive*.

1. Using either Jakarta Security Annotations or CDI Interceptors restrict access to the methods `remove()` and `delete()` to the role *Finance*.

1. Restrict access to all methods in BillRepository.java and BillPaymentRepository.java to authenticated users with the role *Finance*, *Accounting*, or *Executive*.
   
1. Configure your project to display custom error pages for error codes 403, 404, and 500.

1. Test your application that you can login using an *Finance* account and create/edit Bills and BillPayments. You can now open *persistence.xml* change the property `javax.persistence.schema-generation.database.action` value from `drop-and-create` to `none` to avoid losing all your data each time your application starts.
