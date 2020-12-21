echo off
set path=C:\Program Files\Java\jdk1.8.0_181\bin
set include=C:\Program Files\Java\jdk1.8.0_181\include
set lib=C:\Program Files\Java\jdk1.8.0_181\lib
set link=C:\Program Files\Java\jdk1.8.0_181\bin
javac -version Initials.java
java Initials
pause
javap -c initials >1.txt
javadoc initials.java -d 1