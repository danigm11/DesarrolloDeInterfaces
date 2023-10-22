/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanelimagen;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author Dani
 */
public class ImagenFondoPropertyEditorSupport extends PropertyEditorSupport{
    
    private ImagenFondoPanel imagenFondoPanel = new ImagenFondoPanel();
    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return imagenFondoPanel;
    }

    @Override
    public String getJavaInitializationString() {
        return super.getJavaInitializationString();
    }

    @Override
    public Object getValue() {
        return imagenFondoPanel.getSelectedValue();
    }
    
}
