package net.approachzero.apps;

import java.io.File;
import java.util.concurrent.Callable;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(
    name = "PdfFormExtractorApp",
    mixinStandardHelpOptions = true,
    version = "PdfFormExtractorApp 1.0",
    description = "Extracts PDF form data to text and other formats")
/** Hello world! */
public class pdfformextractor implements Callable<Integer> {

  @Parameters(index = "0", description = "Pdf File From which to Extract Form Data")
  private File file;

  @Option(
      names = {"-h", "--help"},
      usageHelp = true,
      description = "display a help message")
  private boolean helpRequested = false;

  @Override
  public Integer call() throws Exception {
    System.out.println("PdfFormExtractorApp main entrypoint been run!");
    System.out.println("Printing Command Line Args Soon");
    System.out.println("Is in a callable");
    return 0;
  }

  public static void main(String[] args) {
    int exitCode = new CommandLine(new pdfformextractor()).execute(args);
    System.exit(exitCode);
  }
}
