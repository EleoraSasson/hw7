package homework7;

/* FileSizeVisitor - the visitor will print the total size of files in bytes. */

public class FileSizeVisitor implements FileVisitor {
    @Override
    public void visit(DocxFileDetails docx) { docx.getSize(); }

    @Override
    public void visit(HtmlFileDetails html) { html.getSize(); }

    @Override
    public void visit(JpgFileDetails jpg) {
        jpg.getSize();
    }

    @Override
    public void visit(Mp3FileDetails mp3) {
        mp3.getSize();
    }

    @Override
    public void visit(PptxFileDetails pptx) {
        pptx.getSize();
    }

    @Override
    public void visit(TxtFileDetails txt) {
        txt.getSize();
    }

}