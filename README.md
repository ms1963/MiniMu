MiniMu
======

MiniMu basiert auf Mu (https://github.com/bkiers/Mu), das Bart Kier entwickelt hat.
MiniMu is based upon Mu which has been provided by Bart Kier (https://github.com/bkiers/Mu).
MiniMu implementiert einen Beispielsparser für ANTLR 4, der die Nutzung der  `-visitor` Funktionalität von ANTLR 4 demonstriert. Das Beispiel dient als Basis für meinen Artikel zum Thema ANTLR. 
Mu ist noch mächtiger, da die Sprache auch if-then-else-Anweisungen und while-Anweisungen unterstützt.
Wer MiniMu versteht, hat keine Probleme, Mu zu verstehen.

Um das MiniMu-Demo-Programm test.minimu ...



        b1 = 10 * 3 > 5 * 5;

        b2 =  b1 && true;

        write "b1 = b2 && true == " + b2;

        n = (3 * 4 + 6) / 9;

        m = 4*4 - 3*3;

        write "n == " + n;

        write "m == " + m;




... zu übersetzen, sind folgende Maven-Befehle im Verzeichnis MiniMu notwendig:



        mvn clean install

        mvn -q exec:java



Ergebnis der Programmausführung ist: -->


        parsing: src/main/minimu/test.minimu

        b1 = b2 && true == true

        n == 2.0

        m == 7.0


