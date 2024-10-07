echo off
cls
rem path="C:\Users\yolan\OneDrive\Documents\_ACC\_ITSE-2321\CLO-1\MLO-1.1";%path%
del *.class

javac -cp .; Proj01.java
java -cp .; Proj01 

pause