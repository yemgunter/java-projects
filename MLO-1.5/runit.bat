echo off
cls
rem path="C:\Users\yolan\OneDrive\Documents\GitHub\java-projects";%path%
del *.class

javac -cp .; Proj05.java
java -cp .; Proj05

pause