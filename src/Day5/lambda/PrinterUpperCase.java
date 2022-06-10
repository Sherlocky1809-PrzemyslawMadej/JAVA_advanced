package Day5.lambda;

import jdk.swing.interop.SwingInterOpUtils;

public class PrinterUpperCase implements IPrinter {

    @Override
    public void print(String text) {
        System.out.println(text.toUpperCase());
    }
}
