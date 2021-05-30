package homework7;

/* FileStatsVisitor - the visitor will print for each file its statistics.
The visit of a directory structure will use a post-order scan (left, right, root). */

public class FileStatsVisitor implements FileVisitor{
    @Override
    public void visit(DocxFileDetails docx) {
        int numPages = docx.getPages();
        int totalWordCount = docx.getWords();
        int aveWordsPerPage = totalWordCount/numPages;
        String fileName = docx.getName() + ".docx";
        System.out.println("The file" + fileName + "has an average of" + aveWordsPerPage + "words per page.");
        //e.g. "The file word.docx has an average of 343.000000 words per page."
    }

    @Override
    public void visit(HtmlFileDetails html) {
        int numLines = html.getLines();
        String fileName = html.getName() + ".html";
        System.out.println("The file" + fileName + "contains" + numLines + "lines.");
        //e.g. "The file other.html contains 128 lines."
    }

    @Override
    public void visit(JpgFileDetails jpg) {
        //has a width and a height and size (bytes)
        int totalWidth = jpg.getWidth();
        int totalHeight = jpg.getHeight();
        int totalSize = jpg.getSize();
        int numPixels =(totalHeight * totalWidth); //number of pixels on page
        byte aveBytesPerPixel = (byte) (totalSize/numPixels); //calculating average bytes per pixel
        String fileName = jpg.getName() + ".jpg";
        System.out.println("The picture" + fileName + "has an average of" + aveBytesPerPixel + "bytes per pixel.");
        // e.g. "The picture pic.jpg has an average of 8.223214 bytes per pixel."
    }

    @Override
    public void visit(Mp3FileDetails mp3) {
        int songLength = mp3.getLengthSec();
        int songSize = mp3.getSize();
        byte songSpeed = (byte) (songSize/songLength);
        String fileName = mp3.getName() + ".mp3";
        System.out.println("The bitrate of" + fileName + "is" + songSpeed + "bytes per second.");
        // e.g. "The bitrate of song.mp3 is 22.319209 bytes per second."
    }

    @Override
    public void visit(PptxFileDetails pptx) {
        int numSlides = pptx.getSlides();
        int sizeSlides = pptx.getSize();
        byte aveSlideSize = (byte) (sizeSlides/numSlides);
        String fileName = pptx.getName() + ".pptx";
        System.out.println("The average slide size in Presentation" + fileName + "is" + aveSlideSize + ".");
        // e.g. "The average slide size in Presentation Swed.pptx is 20020.000000."
    }

    @Override
    public void visit(TxtFileDetails txt) {
        int wordCount = txt.getWords();
        String fileName = txt.getName() + ".txt";
        System.out.println("The file" + fileName + "contains" + wordCount + "words.");
        //e.g. "The file text.txt contains 583 words."
    }

}
