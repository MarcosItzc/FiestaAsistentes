package GUI;


import TDA.Graficos;
import TDA.Almacenar;
import TDA.Asistente;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
//import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class GUI extends JFrame implements ActionListener{
    
    private Almacenar lista;
    private Container contenedor;
    private JTextField campoNombre, campoEdad;
    private JLabel nombre, edad, sexo, estadoC, total;
    private JButton añadir, eliminar, eliminarTodo, reporte, graSexos, graEstCiv, graEdad;
    private JList listaAsistentes;
    private DefaultListModel modelo;
    private JScrollPane scrollLista;
    //private JCheckBox sexoh, sexom;
    private JRadioButton soltero, casado, viudo, divorciado, sexoh, sexom;
    private ButtonGroup grupoEstado, grupoSexo;
    private char sexor;
    private String estadoCivil;
    
    public GUI(){
        lista = new Almacenar();
        inicio();
        setTitle("Captura Asistentes");
        setSize(400, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void inicio(){
        contenedor = getContentPane();
        contenedor.setLayout(null);
        nombre = new JLabel();
        nombre.setText("Nombre: ");
        nombre.setBounds(10, 10, 100, 30);
        campoNombre = new JTextField();
        campoNombre.setBounds(60, 10, 150, 30);
        
        edad = new JLabel();
        edad.setText("Edad: ");
        edad.setBounds(10, 50, 150, 30);
        campoEdad = new JTextField();
        campoEdad.setBounds(60, 50, 150, 30);
        
        sexo = new JLabel();
        sexo.setText("Sexo: ");
        sexo.setBounds(10, 90, 150, 30);
        
        grupoSexo = new ButtonGroup();
        
        //sexoh = new JCheckBox();
        sexoh = new JRadioButton();
        sexoh.setText("Hombre");
        sexoh.setBounds(10, 110, 100, 30);
        grupoSexo.add(sexoh);
        sexoh.addActionListener(this);
        
        //sexom = new JCheckBox();
        sexom = new JRadioButton();
        sexom.setText("Mujer");
        sexom.setBounds(120, 110, 100, 30);
        grupoSexo.add(sexom);
        sexom.addActionListener(this);
        
        estadoC = new JLabel();
        estadoC.setText("Estado Civil: ");
        estadoC.setBounds(10, 140, 100, 30);
        
        grupoEstado = new ButtonGroup();
        
        soltero = new JRadioButton();
        soltero.setText("Soltero");
        soltero.setBounds(10, 170, 70, 30);
        grupoEstado.add(soltero);
        soltero.addActionListener(this);
        
        casado = new JRadioButton();
        casado.setText("Casado");
        casado.setBounds(80, 170, 70, 30);
        grupoEstado.add(casado);
        casado.addActionListener(this);
        
        viudo = new JRadioButton();
        viudo.setText("Viudo");
        viudo.setBounds(150, 170, 70, 30);
        grupoEstado.add(viudo);
        viudo.addActionListener(this);
        
        divorciado = new JRadioButton();
        divorciado.setText("Divorciado");
        divorciado.setBounds(220, 170, 100, 30);
        grupoEstado.add(divorciado);
        divorciado.addActionListener(this);
        
        total = new JLabel();
        total.setText("No. Registro: ");
        total.setBounds(20, 310, 135, 23);
        
        añadir = new JButton();
        añadir.setText("Añadir");
        añadir.setBounds(10, 340, 80, 23);
        añadir.addActionListener(this);
        
        eliminar = new JButton();
        eliminar.setText("Eliminar");
        eliminar.setBounds(100, 340, 80, 23);
        eliminar.addActionListener(this);
        
        eliminarTodo = new JButton();
        eliminarTodo.setText("Vaciar");
        eliminarTodo.setBounds(190, 340, 80, 23);
        eliminarTodo.addActionListener(this);
        
        reporte = new JButton();
        reporte.setText("Reporte");
        reporte.setBounds(280, 340, 80, 23);
        reporte.addActionListener(this);
        
        graSexos = new JButton();
        graSexos.setText("Grafica Sexos");
        graSexos.setBounds(90, 380, 120, 23);
        graSexos.addActionListener(this);
        
        graSexos = new JButton();
        graSexos.setText("Grafica Sexos");
        graSexos.setBounds(10, 380, 120, 23);
        graSexos.addActionListener(this);
        
        graEstCiv = new JButton();
        graEstCiv.setText("Grafica Estados Civiles");
        graEstCiv.setBounds(140, 380, 170, 23);
        graEstCiv.addActionListener(this);
        
        graEdad = new JButton();
        graEdad.setText("Grafica Edad");
        graEdad.setBounds(10, 420, 120, 23);
        graEdad.addActionListener(this);
        
        listaAsistentes = new JList();
        listaAsistentes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modelo = new DefaultListModel();
        
        scrollLista = new JScrollPane();
        scrollLista.setBounds(10, 210, 280, 100);
        scrollLista.setViewportView(listaAsistentes);
        
        
        contenedor.add(nombre);
        contenedor.add(campoNombre);
        contenedor.add(edad);
        contenedor.add(campoEdad);
        contenedor.add(sexo);
        contenedor.add(sexoh);
        contenedor.add(sexom);
        contenedor.add(estadoC);
        contenedor.add(soltero);
        contenedor.add(casado);
        contenedor.add(viudo);
        contenedor.add(divorciado);
        contenedor.add(total);
        contenedor.add(añadir);
        contenedor.add(eliminar);
        contenedor.add(eliminarTodo);
        contenedor.add(reporte);
        contenedor.add(scrollLista);
        contenedor.add(graSexos);
        contenedor.add(graEstCiv);
        contenedor.add(graEdad);
    }
    
    public CategoryDataset datosSexos(){
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.setValue(lista.tAsiMujeres(),"Mujeres" , "Mujeres");
        datos.setValue(lista.tAsiHombres(), "Hombres", "Hombres");
        return datos;
    }
    
    public CategoryDataset datosEstCiv(){
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.setValue(lista.tAsiSolteros(),"Solteros" , "Solteros");
        datos.setValue(lista.tAsiCasados(), "Casados", "Casados");
        datos.setValue(lista.tAsiViudos(), "Viudos", "Viudos");
        datos.setValue(lista.tAsiDivorciados(), "Divorciados", "Divorciados");
        return datos;
    }
    
    public CategoryDataset datosEdades(){
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.setValue(lista.tAsiMayores(),"Mayores" , "Mayore");
        datos.setValue(lista.tAsiMenores(), "Menores", "Menores");
        return datos;
    }
    
    @Override
    public void actionPerformed(ActionEvent evento){
        if(evento.getSource() == sexoh){
            sexor = 'H';
        }
        if(evento.getSource() == sexom){
            sexor = 'M';
        }
        if(evento.getSource() == soltero){
            estadoCivil = "Soltero";
        }
        if(evento.getSource() == casado){
            estadoCivil = "Casado";
        }
        if(evento.getSource() == viudo){
            estadoCivil = "Viudo";
        }
        if(evento.getSource() == divorciado){
            estadoCivil = "Divorciado";
        }
        if(evento.getSource() == añadir){
            añadirAsistente();
        }
        if(evento.getSource() == eliminar){
            eliminarAsistente(listaAsistentes.getSelectedIndex());
        }
        if(evento.getSource() == eliminarTodo){
            quitartodos();
        }
        if(evento.getSource() == reporte){
            reporte();
        }
        if(evento.getSource() == graSexos){
            if(lista.tAsiHombres() == 0 && lista.tAsiMujeres() == 0)
                JOptionPane.showMessageDialog(null, "No existen datos que graficar");
            else
                Graficos.grafica3D(datosSexos(), "Sexos");
            
        }
        if(evento.getSource() == graEstCiv){
            if(lista.tAsiSolteros()== 0 && lista.tAsiCasados()== 0 && lista.tAsiViudos() == 0 && lista.tAsiDivorciados() == 0)
                JOptionPane.showMessageDialog(null, "No existen datos que graficar");
            else
                Graficos.graficaArea(datosEstCiv(), "Estado Civil");
            
        }
        if(evento.getSource() == graEdad){
            if(lista.tAsiMayores()== 0 && lista.tAsiMenores()== 0)
                JOptionPane.showMessageDialog(null, "No existen datos que graficar");
            else{
                Graficos.graficaBarra(datosEdades(), "Edades");
            }
            
        }
    }
    
    private void añadirAsistente(){
        Asistente p = new Asistente(campoNombre.getText(), sexor, (Byte.parseByte(campoEdad.getText())), estadoCivil);
        String cad = campoNombre.getText() + " " + sexor + " " + campoEdad.getText() + " " + estadoCivil;
        lista.añadir(p);
        modelo.addElement(cad);
        listaAsistentes.setModel(modelo);
        int x = modelo.getSize();
        total.setText("No. Registro: " + x);
        campoNombre.setText("");
        campoEdad.setText("");
        grupoEstado.clearSelection();
        grupoSexo.clearSelection();
        //sexoh.setSelected(false);
        //sexom.setSelected(false);
    }
    
    private void eliminarAsistente(int indice){
        if(indice >= 0){
            modelo.removeElementAt(indice);
            lista.eliminar(indice);
            int x = modelo.getSize();
            total.setText("No. Registro: " + x);
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento");
        }
    }
    
    private void quitartodos(){
        lista.borrarTodo();
        modelo.clear();
        int x = modelo.getSize();
        total.setText("No. Registro: " + x);
    }
    
    private void reporte(){
        JOptionPane.showMessageDialog(null,"Total de asistentes: " + lista.totalAsi() + "\n Mayores de Edad: " + lista.tAsiMayores()+
                "\nMenores de Edad: " + lista.tAsiMenores() + "\nHombres: " + lista.tAsiHombres() +
                "\nMujeres: " + lista.tAsiMujeres() + "\nSolteros: " + lista.tAsiSolteros() +
                "\nCasados: " + lista.tAsiCasados() + "\nViudos: " + lista.tAsiViudos() +
                "\nDivorciados: " + lista.tAsiDivorciados() + "\nPorcentaje de Hombres: " + lista.porH() +
                "%\nPorcentaje de Mujeres: " + lista.porM() + "%");
    }
    
}
