# TopOne

### Who am I?
TopOne is an ERP software, which supports the daily activities in e-Commerce.

### Frameworks
Spring + SpringMVC + MyBatis

### Modules
<ul>
<li>topone_parent :: Global dependencies and settings</li>
<li>topone_common :: General tools</li>
<li>topone_redis :: Caching for concurrency issues and high-traffic</li>
<li>topone_rest :: Restful API</li>
<li>topone_search :: Search engine e.g. solr</li>
<li>topone_sso :: Single Sign On</li>
<li>topone_manager :: Backoffice module</li>
<li>topone_manager_mapper :: Mybatis Mapper</li>
<li>topone_manager_pojo :: Mybatis Pojo</li>
<li>topone_manager_service :: Services</li>
<li>topone_manager_web :: Backoffice portal</li>
</ul>

### Database
MySQL 8.0.15<br/><br/>
Authentication: /topone/topone_manager/topone_manager_web/src/main/resources/properties/db.properties<br/><br/>
jdbc_url=jdbc:mysql://localhost:3306/topone_db?serverTimezone=UTC<br/>
jdbc_user=username<br/>
jdbc_password=password<br/>
jdbc_driver=com.mysql.cj.jdbc.Driver

### System completion progress
<ul>
<li>SSM frameworks are integrated.</li>
<li>Module topone_manager can run.</li>
<li>Mybatis reverse engineering does work.</li>
<li>http://localhost:8080/post/1 could load datas from database.</li>
</ul>

### Test Pages
http://localhost:8080/post/1