public class Main {

    public static void main(String[] args) {
        DocumentCreatorFacade doc = new DocumentCreatorFacade();

        String header = "coder4life";
        String body = "Hello World!";
        String footer = "Copyright 2021";

        doc.writeDocument(DocumentType.PDF, header, body, footer);
        doc.writeDocument(DocumentType.HTML, header, body, footer);
        doc.writeDocument(DocumentType.WORD, header, body, footer);
    }

}
