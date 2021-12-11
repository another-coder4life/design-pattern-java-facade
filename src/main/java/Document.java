public class Document {

    private DocumentHeader header;
    private DocumentBody body;
    private DocumentFooter footer;

    public DocumentHeader getHeader() {
        return header;
    }

    public void setHeader(DocumentHeader header) {
        this.header = header;
    }

    public DocumentBody getBody() {
        return body;
    }

    public void setBody(DocumentBody body) {
        this.body = body;
    }

    public DocumentFooter getFooter() {
        return footer;
    }

    public void setFooter(DocumentFooter footer) {
        this.footer = footer;
    }

}
