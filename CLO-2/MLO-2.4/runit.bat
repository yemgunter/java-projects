echo off
cls
rem path="C:\Users\yolan\OneDrive\Documents\GitHub\java-projects";%path%
del *.class

javac -cp .; Proj08.java
java -cp .; Proj08

pause