@echo off
java -version
echo
set "USER=rowan"
setx JAVA_HOME ""C:\Users\%USER%\OneDrive\Documentos\student-playground-V3\test\javaDLLtest\jdk-26.0.2.1"" /M
setx PATH "%PATH%;%JAVA_HOME%\bin" /M
java --enable-native-access=ALL-UNNAMED -cp . runDLL
java createFolder
rundll32.exe .\test.dll,Start
pause