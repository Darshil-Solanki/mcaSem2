@echo off
set /p num=Enter a number:

setlocal enabledelayedexpansion

for /l %%i in (1, 1, 10) do (
    set /a result= !num! * %%i
    echo !num! * %%i = !result!
)

endlocal
