echo off
cls
rem path="C:\Users\yolan\OneDrive\Documents\_ACC\_ITSE-2321\CLO-1\MLO-1.2";%path%
del *.class

javac -cp .; Proj02.java
java -cp .; Proj02 

pause