/*
 * Classe do fileChooser que irá customizar o tipo de arquivo que poderá ser selecionado
*/
package view;

import java.io.File;

public class FiltroCustomizado extends javax.swing.filechooser.FileFilter {
    @Override
    public boolean accept(File file) {
        // aceita apenas diretorios e arquivos jp,jpeg,png
        return file.isDirectory() || file.getAbsolutePath().endsWith(".jpg") || file.getAbsolutePath().endsWith(".jpeg")|| file.getAbsolutePath().endsWith(".png") ;
    }
    @Override
    public String getDescription() {
        return "";
    }
}
