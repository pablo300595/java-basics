find . -type f -name "*.class" -exec rm -f {} \;
javac -cp . collections/MainApp.java
echo "MainApp compilation complete"
sleep 1
java -cp . collections/MainApp.java
echo "MainApp execution."