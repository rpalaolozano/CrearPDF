package crearpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Paragraph;
import java.io.FileOutputStream;

public class CrearPDF {
    public void añadirTexto() throws Exception {
        Document document = new Document();
        String parrafo = "Lentejas = 5€";
        PdfWriter.getInstance(document, new FileOutputStream("ticket_restaurante.pdf"));
        document.open();
        document.add(new Paragraph(parrafo));
        document.close();
    }

    public static void main(String args[]) {
        try {
            CrearPDF p = new CrearPDF();
            p.añadirTexto();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Hola");
        }
    }
}
