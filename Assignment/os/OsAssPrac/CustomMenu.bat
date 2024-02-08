@echo off
:Menu
cls
echo Menu:
echo a. List all files.
echo b. Create a directory.
echo c. Display today's date and time.
echo d. Make abc.txt file as read-only.
echo e. Exit from menu

setlocal enabledelayedexpansion
set /p choice=Enter Your choice:
set dirname=
if "%choice%"=="a" (
    dir
) else if "%choice%"=="b" (
    set /p dirname=Enter directory name: 
	if not exist "!dirname!" (
	    mkdir "!dirname!"
	    echo Directory "!dirname!" created successfully.
	) else (
	    echo Directory "!dirname!" already exists.
	)
) else if "%choice%"=="c" (
    echo %date% %time%
) else if "%choice%"=="d" (
    attrib +r abc.txt
) else if "%choice%"=="e" (
    exit
) else (
    echo Invalid choice. Please try again.
)
endlocal
pause
goto Menu
