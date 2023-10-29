find . -type f -name "*.class" -exec rm -f {} \;
javac -cp . student/TestCriterio.java
echo "TestCriteriolication compilation complete"
sleep 1
java -cp . student/TestCriterio.java
echo "TestCriterio execution."
