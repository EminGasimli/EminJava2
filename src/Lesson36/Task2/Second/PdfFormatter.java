package Lesson36.Task2.Second;

public class PdfFormatter implements InvoiceFormatter {
    @Override
    public void format(String invoice) {
        System.out.println("Invoice PDF formatında: " + invoice);
    }
}
