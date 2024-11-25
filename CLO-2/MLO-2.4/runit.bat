echo off
cls
rem path="C:\Users\yolan\OneDrive\Documents\GitHub\java-projects";%path%
del *.class

javac -cp .; Proj09.java
java -cp .; Proj09

pause