MiniMu
======

Ein Beispielsparser für ANTLR 4, der die Nutzung der  `-visitor` Funktionalität von ANTLR 4 demonstriert.
Um das MiniMu-Demo-Programm

#Datei: test.minimu

# Erst prüfen wir boole'sche Operationen

b1 = 10 * 3 > 5 * 5;
b2 =  b1 && true;
write "b1 = b2 && true == " + b2;

# Prüfung von Zahlenausdrücken

n = (3 * 4 + 6) / 9;
m = 4*4 - 3*3;

write "n == " + n;
write "m == " + m;

zu übersetzen, sind folgende Maven-Befehle im Verzeichnis MiniMu notwendig:
mvn clean install
mvn -q exec:java

Ergebnis der Programmausführung ist:


parsing: src/main/minimu/test.minimu
b1 = b2 && true == true
n == 2.0
m == 7.0


