
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class ReadFromFileoneline
{
  String strMsgType;
  String MessageRef;
  String FTRNINC;
  String Description;
  String BatchNumber = null;
  String GroupID = null;
  String ErrorCode = null;

  public void FileRead() { File file = new File("C:\\Users\\Desktop\\Docs\\Test.txt");
    try
    {
      BufferedReader br = new BufferedReader(new FileReader(file));
      try
      {
        String st;
        while ((st = br.readLine()) != null)
        {
          
          String[] var = st.split(",");

          String Name = var[0];

          System.out.println("Name1:" + Name);
          this.strMsgType = var[0];
          this.MessageRef = var[1];
          this.FTRNINC = var[2];
          this.Description = var[3];
          System.out.println("strMsgType:" + this.strMsgType);
          System.out.println("MessageRef:" + this.MessageRef);
          System.out.println("FTRNINC:" + this.FTRNINC);
          System.out.println("Description:" + this.Description);
        }
      }
      catch (IOException e) {
        e.printStackTrace();
      }
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    } }

  public void storeproc()
  {
    System.out.println("strMsgType storeproc:" + this.strMsgType);
    System.out.println("MessageRef:" + this.MessageRef);
    System.out.println("FTRNINC:" + this.FTRNINC);
    System.out.println("Description:" + this.Description);
    try
    {
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      String connectionUrl = "jdbc:sqlserver://TREASSQLQASVR63.logon.ds.ge.com:6333;databaseName=gewebcash;user=Hotscan;password=*******;";

      Connection conn = DriverManager.getConnection(connectionUrl);
      CallableStatement cstmt = 
        conn.prepareCall("{call GE_PR_UPDATECONTROLSTAMPS(?, ?, ?, ?)}");
      cstmt.setString(1, this.strMsgType);
      cstmt.setString(2, this.MessageRef);
      cstmt.setString(3, this.FTRNINC);
      cstmt.setString(4, this.Description);
      cstmt.execute();

      cstmt.close();
      conn.close();
    } catch (Exception e) {
      System.out.println("Exception :::::" + e);
    }
  }

  public static void main(String[] args)
  {
	  ReadFromFileoneline FR = new ReadFromFileoneline();
    FR.FileRead();
    FR.storeproc();
  }
}
