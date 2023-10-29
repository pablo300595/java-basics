find . -type f -name "*.class" -exec rm -f {} \;
javac -cp . exceptions/MainApp.java
echo "MainApp compilation complete"
sleep 1
java -cp . exceptions/MainApp.java
echo "MainApp execution."