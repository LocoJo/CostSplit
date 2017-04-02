import java.util.*;
import java.io.*;
import java.io.IOException;

public class FileStringGrabber extends FileScanner implements Retriever
{
  public FileStringGrabber(File inFile) throws FileNotFoundException
  {
    super(inFile);
  }
  public String getType(String spendString)
  {
    int i = 0;
    int j;
    String line;
    String testString;
    while (scanner.hasNextLine() && i < 100)
      {
        line = scanner.nextLine();
        testString = "";
        j = 0;
        while (line.charAt(j) != ',')
        {
          testString += line.charAt(j);
          j++;
        }
        if (spendString.equals(testString))
        {
          return line.substring(j + 1);
        }
        i++;
        System.out.println(testString);
      }
    return "None Found";
  }
}
