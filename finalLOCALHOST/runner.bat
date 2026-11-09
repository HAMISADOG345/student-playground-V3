@echo off

java --enable-native-access=ALL-UNNAMED -cp . runDLL localhost.dll LOCALHOST
java --enable-native-access=ALL-UNNAMED -cp . runDLL libuntitled8.dll Start

pause