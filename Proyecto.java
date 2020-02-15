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
	Redondeo=new JCheckBox("Redondeo");
    	Truncamiento=new JCheckBox("Truncamiento");

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
	Datos.add(RER);
    	Datos.add(ReER);
    	Datos.add(TER);
    	Datos.add(TruER);
    	Datos.add(TEA);
    	Datos.add(TruEA);
    	
    	//Panel Botones
    	JPanel Botones = new JPanel();
        Botones.setLayout(new FlowLayout());
    	Botones.add(Calcular);
        Botones.add(Cancelar);
    	Botones.add(Salir);
    	
    	//Panel Eleccion
    	JPanel Elec=new JPanel();
    	GridLayout g2 = new GridLayout(3,0,0,10);
        Elec.setLayout(g2);
    	Elec.add(Redondeo);
    	Elec.add(Truncamiento);
    	
    	
    	//Panel Contenedor
    	Container cp=getContentPane();
    	cp.add(Datos, BorderLayout.WEST);
    	cp.add(Elec, BorderLayout.CENTER);
        cp.add(Botones, BorderLayout.SOUTH);
    }
    	public static void main(String args[]){
    	Proyecto v=new Proyecto();
    	v.setVisible(true);
    	v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
     	}
