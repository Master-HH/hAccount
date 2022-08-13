import framework.m_printer.CMDPrinter;
import framework.m_printer.Printer;

public class MAccunt {

  public static void main(String[] args) {
    CMDPrinter printer = new CMDPrinter();


    start(printer);
  }

  public static void start(Printer printer){
    printer.println("start "+ MAccunt.class.getSimpleName());
    printer.println();
    printer.println();


  }
}
