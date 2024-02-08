@echo off
REM Check if GCC is installed

where gcc > nul 2>&1

if %errorlevel% equ 0 (
    echo Compiling and running C program...
    gcc demo.c -o demo.exe
    demo.exe
) else (
    echo GCC is not installed
)
