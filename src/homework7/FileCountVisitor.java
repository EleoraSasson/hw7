package homework7;

/* FileCountVisitor - the visitor will calculate the total number of files. */

public class FileCountVisitor implements FileVisitor{

    int actualCount_docx;
    @Override
    public void visit(DocxFileDetails docx) {
        actualCount_docx++;
        System.out.println("Directory docx has" + actualCount_docx + "files."); //print "Directory docx has # files"
    }

    int actualCount_html;
    @Override
    public void visit(HtmlFileDetails html) { actualCount_html++; }

    int actualCount_jpg;
    @Override
    public void visit(JpgFileDetails jpg) {
        actualCount_jpg++;
    }

    int actualCount_mp3;
    @Override
    public void visit(Mp3FileDetails mp3) {
        actualCount_mp3++;
    }

    int actualCount_pptx;
    @Override
    public void visit(PptxFileDetails pptx) {
        actualCount_pptx++;
    }

    int actualCount_txt; //ask for actual count from the object after the visit
    @Override
    public void visit(TxtFileDetails txt) {
        // actual counting calculation
        actualCount_txt++; //each visit increases the count
    }

}
