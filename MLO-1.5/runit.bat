echo off
cls
rem path="C:\Users\yolan\OneDrive\Documents\GitHub\java-projects";%path%
del *.class

javac -cp .; Proj04.java
java -cp .; Proj04

pause