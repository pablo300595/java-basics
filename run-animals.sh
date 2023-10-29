find . -type f -name "*.class" -exec rm -f {} \;
javac -cp . animals/MainApp.java
echo "MainApplication compilation complete"
sleep 1
java -cp . animals/MainApp.java
echo "MainApp execution."
