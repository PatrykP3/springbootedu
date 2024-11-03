package org.nowpat.springbootedu.processor;

import java.util.List;
import org.nowpat.springbootedu.printer.Printer;
import org.nowpat.springbootedu.provider.PrinterProvider;
import org.springframework.stereotype.Component;

import static java.util.Objects.isNull;

@Component
public class Processor {

    private PrinterProvider printerProvider = new PrinterProvider();

    public void process(List<String> lines) {
        for (String line : lines) {
            Printer printer = printerProvider.getPrinter(line.length());
            if(!isNull(printer)) {
                printer.print(line);
            }
        }
    }
}
