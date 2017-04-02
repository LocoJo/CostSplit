import java.util.*;
import java.io.*;
import java.io.IOException;

public class FileScanner
{
  protected File file;
  protected Scanner scanner;

  public FileScanner(File inFile) throws FileNotFoundException
  {
    file = inFile;
    scanner = new Scanner(inFile);
    System.out.println("Loading Spend Map...");
    System.out.println("First 10 lines:");
    this.printFileContents(10);
  }

  public void printFileContents() throws FileNotFoundException
  {
    while (scanner.hasNextLine())
      {
        String line = scanner.nextLine();
        System.out.println(line);
      }
  }

  public void printFileContents(int noLines) throws FileNotFoundException
  {
    int i = 0;
    while (scanner.hasNextLine() && i < noLines)
      {
        String line = scanner.nextLine();
        System.out.println(line);
        i++;
      }
  }
}
