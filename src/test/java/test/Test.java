package test;

import com.caojx.pdf.PDFContents;
import com.caojx.pdf.PDFUtil;

import java.io.IOException;

/**
 * Created by ifnoelse on 2017/2/25 0025.
 */
public class Test {
    public static void main(String[] args) throws IOException {

        //Get catalog information for books
        String contents = PDFContents.getContentsByUrl("http://product.china-pub.com/223565");


        //Add a table of contents to a book
        PDFUtil.addBookmark(PDFUtil.generateBookmark(contents, 14), "Pdf path to add bookmarks", "Pdf output path after adding bookmark");


    }
}
