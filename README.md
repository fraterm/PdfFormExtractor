
# pdfformextractor

## A Java Command Line Application

### What it (eventually) does:
- Reads data from pdf forms in pdf documents
- Exports the data in the forms to various outputs
    - text 
    - csv
    - other formats

### How it is built and how it works

1. Uses [Maven](https://maven.apache.org) to build
    - Using [diffplug](https://www.diffplug.com) [spotless](https://github.com/diffplug/spotless) for auto-code formatting
    - Using [maven-shade-plugin](https://maven.apache.org/plugins/maven-shade-plugin) to make an uber-jar
    - Using [spotless](https://github.com/diffplug/spotless) for auto-code formatting for the java and pom \(and maybe others later\)
2. Uses [picocli](https://picocli.info) for command line argument parsing
3. Uses [PDFBox](https://pdfbox.apache.org) for PDF manipulation
    - This brings in [Apache Commons](https://commons.apache.org) Logging but doesn't force any particular logger.
