CLASSPATH=engine.jar

for i in ./lib/*.jar; do
   CLASSPATH="$CLASSPATH":"$i"
done

JAVA_OPTIONS="-Xms16m -Xmx32m"

nohup smsfront $JAVA_OPTIONS com.slf.engine.main.MainEngine &
exit 0