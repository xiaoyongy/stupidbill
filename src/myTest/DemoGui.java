package myTest;

import java.awt.BorderLayout;
import java.io.UnsupportedEncodingException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

//import net.sourceforge.napkinlaf.NapkinLookAndFeel;

//from web of "https://www.xuebuyuan.com/1487509.html"
public class DemoGui extends JFrame {
    private JPanel pane = new JPanel( new BorderLayout() );
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JButton button;
    private JComboBox combox = new JComboBox();
    private JCheckBox jcb = new JCheckBox();
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menu = new JMenu( "File" );
    private JMenuItem mi1 = new JMenuItem( "蕭探" );
    private JMenuItem mi2 = new JMenuItem( "Cut" );
    private JMenuItem mi3 = new JMenuItem( "Paste" );
    private JToggleButton jtb = new JToggleButton( "Button1" );
    private JToggleButton jtb1 = new JToggleButton( "Button2" );
    private JToggleButton jtb2 = new JToggleButton( "Button3" );
    private JToggleButton jtb3 = new JToggleButton( "做霜" );

    /*private JToggleButton jtb = new JToggleButton( "<html><font color='red'>做霜</font></html>" );
    private JToggleButton jtb1 = new JToggleButton( "<html><font color='green'>做霜</font></html>" );
    private JToggleButton jtb2 = new JToggleButton( "<html><font color='blue'>做霜</font></html>" );
    private JToggleButton jtb3 = new JToggleButton( "<html><font color='yellow'>做霜</font></html>" );*/

    static {

        try {
//            UIManager.setLookAndFeel( "com.birosoft.liquid.LiquidLookAndFeel" );
            UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
            //UIManager.setLookAndFeel( new NapkinLookAndFeel() );
        } catch (UnsupportedLookAndFeelException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public DemoGui() {
        try {
            button = new JButton( new String( "Button".getBytes( "ISO-8859-1" )) );
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        mi1.setMnemonic( 'd' );
        menu.add( mi1 );
        menu.add( mi2 );
        menu.add( mi3 );
        menuBar.add( menu );
        menuBar.add( jtb1 );
        menuBar.add( jtb2 );
        menuBar.add( jtb3 );
        panel1.add( button );
        panel1.add( jcb );
        panel1.add( combox );
        panel1.add( jtb );
        pane.add( panel1, BorderLayout.PAGE_START );
        pane.add( panel2, BorderLayout.PAGE_END );

        this.setJMenuBar( menuBar );
        this.setContentPane( pane );

        //this.setUndecorated( true );
        //this.getRootPane().setWindowDecorationStyle( JRootPane.FRAME );

        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setBounds( 300, 300, 600, 400 );
        this.setVisible( true );


    }
    public static void main( String[] args ) {
        new DemoGui();
    }
}
