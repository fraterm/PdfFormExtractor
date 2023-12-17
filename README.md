
# PdfFormExtractor

Java Command Line Application
Reads data from pdf forms in pdf documents and exports them to text and other formats.
1. Uses [Maven](https://maven.apache.org) to build
2. Uses [picocli](https://picocli.info) for command line argument parsing
3. Uses [PDFBox](https://pdfbox.apache.org) for PDF manipulation
    - This brings in Apache Commons Logging but doesn't force any particular logger.
