public class DocumentWriter {

    public void writeToPdf(Document doc) {
        System.out.println("Writing output to PDF document:");
        System.out.println("Header: " + doc.getHeader().data);
        System.out.println("Body: " + doc.getBody().data);
        System.out.println("Footer: " + doc.getFooter().data);
        System.out.println("-------------------------------");
    }

    public void writeToHtml(Document doc) {
        System.out.println("Writing output to HTML document:");
        System.out.println("Header: " + doc.getHeader().data);
        System.out.println("Body: " + doc.getBody().data);
        System.out.println("Footer: " + doc.getFooter().data);
        System.out.println("-------------------------------");
    }

    public void writeToWord(Document doc) {
        System.out.println("Writing output to Word document:");
        System.out.println("Header: " + doc.getHeader().data);
        System.out.println("Body: " + doc.getBody().data);
        System.out.println("Footer: " + doc.getFooter().data);
        System.out.println("-------------------------------");
    }

}
