@echo off
java -version
echo
java --enable-native-access=ALL-UNNAMED -cp . runDLL
java createFolder
rundll32.exe .\test.dll,Start
pause