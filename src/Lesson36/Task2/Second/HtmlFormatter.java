package Lesson36.Task2.Second;

public class HtmlFormatter implements InvoiceFormatter {
    @Override
    public void format(String invoice) {
        System.out.println("Invoice HTML formatında: " + invoice);
    }
}
