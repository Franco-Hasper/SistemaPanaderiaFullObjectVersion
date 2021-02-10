package operacionesConfiguracion;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;
import principal.PrincipalAdministrador;

public class ConfiguracionTxt {

    private final ColorTema color = new ColorTema();
    private PrincipalAdministrador principalAdministrador;

    public PrincipalAdministrador getPrincipalAdministrador() {
        return principalAdministrador;
    }

    public void setPrincipalAdministrador(PrincipalAdministrador principalAdministrador) {
        this.principalAdministrador = principalAdministrador;
    }
    
    

    /**
     * Recibe 6 valores, 3 RGB para crear color primario y 3 RGB para crear el
     * color secundario de la interfaz grafica.
     *
     * @param pr colorPrimarioRed
     * @param pg colorPrimarioGreen
     * @param pb colorPrimarioBlue
     * @param sr colorSecundarioRed
     * @param sg colorSecundarioGreen
     * @param sb colorSecundarioBlue
     */
    public void setColor(Integer pr, Integer pg, Integer pb, Integer sr, Integer sg, Integer sb) {
        color.setPrincipalBlue(pb);
        color.setPrincipalGreen(pg);
        color.setPrincipalRed(pr);
        color.setSecundarioBlue(sb);
        color.setSecundarioGreen(sg);
        color.setSecundarioRed(sr);
        color.setColorPrimario(new Color(color.getPrincipalRed(), color.getPrincipalGreen(), color.getPrincipalBlue()));
        color.setColorSecundario(new Color(color.getSecundarioRed(), color.getSecundarioGreen(), color.getSecundarioBlue()));
    }

    /**
     * Inserta el color principal previamente definido en el panel prmario y los
     * botones de la ventana principal y el color secundario en los paneles
     * secundarios.
     */
    public void setTema() {
        principalAdministrador.getPanelPrincipalTop().setBackground(color.getColorPrimario());
        principalAdministrador.getPanelPrincipalBody().setBackground(color.getColorSecundario());
        principalAdministrador.getBtnConfiguracion().setBackground(color.getColorPrimario());
        principalAdministrador.getBtnGestionCliente().setBackground(color.getColorPrimario());
        principalAdministrador.getBtnGestionCaja().setBackground(color.getColorPrimario());
        principalAdministrador.getBtnGestionMateriPrima().setBackground(color.getColorPrimario());
        principalAdministrador.getBtnGestionVentas().setBackground(color.getColorPrimario());
        principalAdministrador.getBtnGestionProducto().setBackground(color.getColorPrimario());
        principalAdministrador.getBtnGestionProveedor().setBackground(color.getColorPrimario());
        principalAdministrador.getBtnGestionGastos().setBackground(color.getColorPrimario());
    }

    /**
     * recupera los valores almacenados en el archivo ConfiguracionColor.txt
     * para definir el color de la interfaz grafica al iniciar una nueva sesion.
     */
    public void leerArchivoConfig() {
        try {
            LinkedList valores = new LinkedList();
            Scanner input = new Scanner(new File("ConfiguracionColor.txt"));

            while (input.hasNextLine()) {
                valores.add(input.nextLine());
            }
            color.setPrincipalRed(Integer.valueOf(valores.get(0).toString()));
            color.setPrincipalGreen(Integer.valueOf(valores.get(1).toString()));
            color.setPrincipalBlue(Integer.valueOf(valores.get(2).toString()));
            color.setSecundarioRed(Integer.valueOf(valores.get(3).toString()));
            color.setSecundarioGreen(Integer.valueOf(valores.get(4).toString()));
            color.setSecundarioBlue(Integer.valueOf(valores.get(5).toString()));
            color.setColorPrimario(new Color(color.getPrincipalRed(), color.getPrincipalGreen(), color.getPrincipalBlue()));
            color.setColorSecundario(new Color(color.getSecundarioRed(), color.getSecundarioGreen(), color.getSecundarioBlue()));
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Abre el archivo ConfiguracionColor.txt e inserta en el los valores
     * devueltos en el metodo contenidoConfig.
     */
    public void guardarColor() {
        try {
            String ruta = "ConfiguracionColor.txt";
            String contenido = contenidoConfig();
            File file = new File(ruta);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Devuelve una cadena con los valores que conponen el color principal y
     * secundario de la interfaz grafica.
     *
     */
    public String contenidoConfig() {
        return color.getPrincipalRed() + "\n"
                + color.getPrincipalGreen() + "\n"
                + color.getPrincipalBlue() + "\n"
                + color.getSecundarioRed() + "\n"
                + color.getSecundarioGreen() + "\n"
                + color.getSecundarioBlue();
    }

}
