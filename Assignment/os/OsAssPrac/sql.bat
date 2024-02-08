@echo off
REM Check if SQL*Plus is installed or not installed

where sqlplus> nul 2>&1

if %errorlevel% equ 0 (
    echo Executing SQL script...
    sqlplus ajay/ajay @script.sql
) else (
    echo SQL*Plus for Oracle is not installed.
)
