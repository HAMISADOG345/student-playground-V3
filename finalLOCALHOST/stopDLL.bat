@echo off

tasklist /FI "IMAGENAME eq rundll32.exe" 2>NUL | find /I "rundll32.exe">NUL
if "%ERRORLEVEL%"=="0" (
    echo stopping rundll32
    taskkill /F /IM rundll32.exe
) else (
    echo rundll32 is not running
)

pause