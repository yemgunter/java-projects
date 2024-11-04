echo off
cls
rem path="C:\Users\yolan\OneDrive\Documents\GitHub\java-projects";%path%
del *.class

javac -cp .; Proj06.java
java -cp .; Proj06

pause