@echo off
cd /d C:\Users\ADMIN\OneDrive\Desktop\OOP_JAVA

echo ------------------------------------
echo Dang them tat ca cac thay doi...
git add .

echo ------------------------------------
echo Commit thay doi...
git commit -m "Update code" || echo Khong co thay doi nao de commit

echo ------------------------------------
echo Dang day code len GitHub...
git push origin main --force

echo ------------------------------------
echo Done ! Da day code len github.
echo Code by Meoconsoma.
pause
