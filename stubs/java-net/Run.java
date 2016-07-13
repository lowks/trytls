import java.net.URL;
import java.io.*;

public class Run
{
  public static void main(String [] args) {

    if (args.length != 2) {
      System.out.println("UNSUPPORTED");	//for now
      System.exit(2);
    }

    String host = args[0];
    String port = args[1];

    String https_url = String.format("https://%s:%s", host, port);

    try {
      new java.net.URL(https_url).getContent();
      System.out.println("VERIFY SUCCESS");
    } catch (javax.net.ssl.SSLHandshakeException e){
      System.out.println("VERIFY VAILURE");
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println(e.getCause().getMessage());
			System.exit(3);
    }
    System.exit(0);
  }
}