cd /hms/apps/apache-tomcat-8.5.5/webapps
rm -rf pms-web.war pms-web/
cd /home/jaliya/github/pms_spring
mvn clean install
cp web/target/pms-web.war /hms/apps/apache-tomcat-8.5.5/webapps/
cd /hms/apps/apache-tomcat-8.5.5/bin
export JPDA_ADDRESS=5005
export JPDA_TRANSPORT=dt_socket 

./catalina.sh jpda run
