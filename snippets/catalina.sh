#Add OpenEJB javaagent

if [ -r "$CATALINA_HOME"/lib/openejb-javaagent.jar ]; then

	JAVA_OPTS = ""-javaagent:$CATALINA_HOME/lib/openejb-javaagent.jar" 
					$JAVA_OPTS "

fi