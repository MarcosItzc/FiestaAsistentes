package TDA;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graficos{
    public static CategoryDataset creaDatosCategory(){
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.setValue(45, "Estructura de Datos", "Luis");
        datos.setValue(70, "Estructura de Datos", "Antonio");
        datos.setValue(100, "Estructura de Datos", "Pedro");
        datos.setValue(98,"Estructura de datos","Carlos");
        datos.setValue(85,"Admon Orga de datos","Angel");
        datos.setValue(90,"Programacion avanzada","Luis");
        datos.setValue(68,"Programacion avanzada","Antonio");
        datos.setValue(100,"Programacion avanzada","Pedro");
        datos.setValue(87,"Programacion avanzada","Carlos");
        datos.setValue(77,"Programacion avanzada","Angel");
        return datos;
    }
    
    public static void panelJframe(JFreeChart grafica){
        ChartPanel panel= new ChartPanel(grafica);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(500,300));
        JFrame ventana = new JFrame("Grafica");
        ventana.setVisible(true);
        ventana.setSize(800, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(panel);
    }
    
    public static void grabaFileJPG(JFreeChart grafica) throws IOException{
        try{
            ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\Usuario\\Desktop\\Prueba.jpg"), grafica, 800, 500);
            
        } catch (IOException e) {
            System.err.println("Error creando grafico.");
        }
    }
    
    public static void graficaArea(CategoryDataset datos, String nombre){
        JFreeChart grafico;
        grafico = ChartFactory . createAreaChart (nombre, "" , "Cantidad", datos, PlotOrientation.VERTICAL, false, true, false);
        panelJframe(grafico);
    }
    
    public static void graficaBarra(CategoryDataset datos, String nombre){
        JFreeChart grafico;
        grafico = ChartFactory . createBarChart (nombre, "", "Cantidad", datos, PlotOrientation.VERTICAL, false, true, false);
        panelJframe(grafico);
    }
    
    public static void grafica3D(CategoryDataset datos, String nombre){
        JFreeChart grafico;
        grafico=ChartFactory.createBarChart3D(nombre, "", "Cantidad", datos, PlotOrientation.VERTICAL, false, true, false);
        panelJframe(grafico);
    }
    
    public static void graficaLineas(CategoryDataset datos, String nombre){
        JFreeChart grafico;
        grafico=ChartFactory . createLineChart (nombre, "", "Cantidad", datos, PlotOrientation.VERTICAL, false, true, false);
        panelJframe(grafico);
    }
    
    public static void graficaLineas3D(CategoryDataset datos){
        JFreeChart grafico;
        grafico=ChartFactory . createLineChart ("Calificaciones", "Estudiantes", "Califaciones", datos, PlotOrientation.VERTICAL, true, true, false);
        panelJframe(grafico);
    }
}
