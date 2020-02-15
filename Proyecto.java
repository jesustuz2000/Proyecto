import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.System.exit;
public class Proyecto extends JFrame{
	//DECLARACIÓN DE MIEMBROS DE CLASE O ATRIBUTOS
	//variables con ambito de clase
		JLabel ValorAbs, ValorRel, RER, REA, TER,TEA;
		JTextField ValAb, ValRe, ReER, ReEA, TruER, TruEA;
		JButton Calcular, Cancelar, Salir;
		JCheckBox Redondeo,Truncamiento;
    public Proyecto() {
    	super("Metodos Numericos");
    	setSize(500,300);
    	this.setLocationRelativeTo(null);
    	
    	//creamos el administrador de eventos
        ManejadorEventos manejador=new ManejadorEventos();
    	
    	//Inicializando Atributos y panel de datos
    	
    	ValorAbs=new JLabel("Valor Absoluto");
    	ValAb=new JTextField(15);
    	ValorRel=new JLabel("Valor Relativo");
    	ValRe=new JTextField(15);
    	REA=new JLabel("Redondeo EA");
    	ReEA=new JTextField(15);
    	RER=new JLabel("Redondeo ER");
    	ReER=new JTextField(15);
    	TER=new JLabel("Truncamiento ER");
    	TruER=new JTextField(15);
    	TEA=new JLabel("Truncamiento EA");
    	TruEA=new JTextField(15);
    	Calcular = new JButton("Calcular");
    	Calcular.addActionListener(manejador);//le indicamos el manejador de eventos
    	Cancelar = new JButton("Limpiar");
    	Cancelar.addActionListener(manejador);//le indicamos el manejador de eventos
    	Salir = new JButton("Salir");
    	Salir.addActionListener(manejador);//le indicamos el manejador de eventos


//Panel Datos
    	JPanel Datos = new JPanel();
        GridLayout gl = new GridLayout(7,0,0,10);
        Datos.setLayout(gl);
    	Datos.add(ValorAbs);
    	Datos.add(ValAb);
    	Datos.add(ValorRel);
    	Datos.add(ValRe);
    	Datos.add(REA);
    	Datos.add(ReEA);