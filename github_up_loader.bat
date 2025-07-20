@echo off
cd /d C:\Users\ADMIN\OneDrive\Desktop\OOP_JAVA

:: Hiển thị con mèo
echo.
echo          /^^_^^\  
echo         ( o.o ) 
echo.
echo     == MeoConSoMa ==
echo.

:: Các lệnh git
echo ------------------------------------
echo [1/3] Dang them tat ca cac thay doi...
git add .

echo ----------------------------------------
echo [2/3] Commit thay doi...
git commit -m "Update code" || echo => Khong co thay doi nao de commit.

echo ----------------------------------------
echo [3/3] Dang day code len GitHub...
git push origin main --force

echo ----------------------------------------
echo Done! Code da duoc day len GitHub.
echo Code by MeoConSoMa.
echo ----------------------------------------
pause
