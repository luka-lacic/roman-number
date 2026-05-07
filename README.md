Roman Numbers

Membri del gruppo:  
JATIN BAJAJ 2138010  
LUKA LACIC 2145595

[![Java CI Pipeline](https://github.com/luka-lacic/roman-number/actions/workflows/pipeline.yml/badge.svg?branch=main)](https://github.com/luka-lacic/roman-number/actions/workflows/pipeline.yml)

[![Coverage Status](https://coveralls.io/repos/github/luka-lacic/roman-number/badge.svg?branch=1fc3af7ae6a18be65b4ada3d55b81178dcf38306)](https://coveralls.io/github/luka-lacic/roman-number?branch=1fc3af7ae6a18be65b4ada3d55b81178dcf38306)

- Note sullo Sviluppo e Pipeline CI/CD

Durante la configurazione iniziale del progetto, abbiamo riscontrato e risolto un problema tecnico relativo alle GitHub Actions.
Problema: Path Errato nella Pipeline. Inizialmente, la pipeline di build falliva con l'errore:
[ERROR] The goal you specified requires a project to execute but there is no POM file in this directory.

Causa: Il repository è strutturato con una cartella radice che contiene a sua volta la cartella del progetto Maven (roman-number). Di default, le GitHub Actions cercano il file pom.xml nella cartella principale (root), non trovandolo.

Soluzione: Configurazione della Working Directory
Per risolvere il problema, abbiamo modificato il file di configurazione della pipeline (.github/workflows/pipeline.yml), specificando esplicitamente la working-directory per tutti i passaggi di Maven (Build, Test, Checkstyle, Coveralls).

defaults:  
    run:  
        working-directory: ./roman-number
    
Grazie a questa modifica, ogni comando Maven viene eseguito correttamente all'interno della sottocartella corretta, permettendo il completamento con successo della build e l'invio dei dati di copertura a Coveralls.

- Comando per l'esecuzione dentro la cartella roman-number: mvn compile exec:java "-Dexec.mainClass=it.unipd.mtss.App"
