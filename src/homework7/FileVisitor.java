package homework7;

public interface FileVisitor {
// add visitor function for every file subclass
    void visit(DocxFileDetails docx);
    void visit(HtmlFileDetails html);
    void visit(JpgFileDetails jpg);
    void visit(Mp3FileDetails mp3);
    void visit(PptxFileDetails pptx);
    void visit(TxtFileDetails txt);
}
