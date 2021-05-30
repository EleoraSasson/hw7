package homework7;

/* FileShortRepVisitor - print all names of files and folders in post-order (left, right, root). */

public class FileShortRepVisitor implements FileVisitor {
    @Override
    public void visit(DocxFileDetails docx) {
        String fileName = docx.getName();
        String filePath = docx.getPath();
        System.out.println(fileName + "." + filePath); //print out the name of the file "fileName.filePath"
    }

    @Override
    public void visit(HtmlFileDetails html) {
        String fileName = html.getName();
        String filePath = html.getPath();
        System.out.println(fileName + "." + filePath); //print out the name of the file "fileName.filePath"
    }

    @Override
    public void visit(JpgFileDetails jpg) {
        String fileName = jpg.getName();
        String filePath = jpg.getPath();
        System.out.println(fileName + "." + filePath); //print out the name of the file "fileName.filePath"
    }

    @Override
    public void visit(Mp3FileDetails mp3) {
        String fileName = mp3.getName();
        String filePath = mp3.getPath();
        System.out.println(fileName + "." + filePath); //print out the name of the file "fileName.filePath"
    }

    @Override
    public void visit(PptxFileDetails pptx) {
        String fileName = pptx.getName();
        String filePath = pptx.getPath();
        System.out.println(fileName + "." + filePath); //print out the name of the file "fileName.filePath"
    }

    @Override
    public void visit(TxtFileDetails txt) {
        String fileName = txt.getName();
        String filePath = txt.getPath();
        System.out.println(fileName + "." + filePath); //print out the name of the file "fileName.filePath"
    }

}