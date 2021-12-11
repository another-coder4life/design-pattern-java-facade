public class DocumentCreatorFacade {

    public static void writeDocument(DocumentType type, String headerData, String bodyData, String footerData) {
        Document doc = new Document();

        doc.setHeader(new DocumentHeader(headerData));
        doc.setBody(new DocumentBody(bodyData));
        doc.setFooter(new DocumentFooter(footerData));

        DocumentWriter writer = new DocumentWriter();

        switch (type) {
            case HTML -> writer.writeToHtml(doc);
            case PDF -> writer.writeToPdf(doc);
            case WORD -> writer.writeToWord(doc);
        }
    }

}
