# jwt
This one uses Keycloak for authentication and authorization.</br>
</br>
The authentication and authorization layer only applies to the API gateway. All other services will be using infrastructure level authentication to avoid direct access.</br>
Basically, the API gateway is the only place that is accessible to the public and other services are accessible only via the API gateway.<br>
</br>
<table><tr>
<td>
Spring Cloud Components:
<li>Eureka Discovery Server</li>
<li>Config Server</li>
<li>API gateway</li>
</td>
</tr>
<tr>
<td>
Other components:
<li>Keycloak (with MySQL)</li>
<li>JWT</li>
<li>Postman</li>
<li>Docker</li>
</td>
</tr>
</table>

