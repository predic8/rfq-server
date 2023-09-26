# RFQ-Server

# About

## Setup Azure

1. Create Wep App

```
az webapp create --name rfq-server \
--plan small \
-g demo \
-r "JAVA:17-java17"
```

2. Azure Portal
3. Overview Web App
4. Download publish profile
5. Datei öffnen und Inhalt kopieren
6. github: Settings/Secrets and Variables/Actions/New Repository Secret 
   Name: AZ_PUBLISH_PROFILE
   Content: << Einfügen >>

# Setup Intellij

1. target/generated-sources/openapi/src/main/java als source path hinzufügen 



# Reference

Liste der Runtimes
```
az webapp list-runtimes
```

```
az webapp deployment list-publishing-profiles --name rfq-server --resource-group demo
```
