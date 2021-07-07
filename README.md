# Javapackage novelReader;

import Day06.testWindow;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;

class MyFrame{
    File file0 = new File("D:\\novel");
    File file1 = new File("D:\\myNovel");
    File files0[]=file0.listFiles();
    File files1[]=file1.listFiles();
    JFrame jf1=new JFrame();
    JFrame jf2=new JFrame();
  public MyFrame() {
      jf1.setLayout(new FlowLayout());
      jf1.setBounds(400,300,300,100);
      jf2.setLayout(new FlowLayout());
      jf2.setBounds(400,300,900,900);

      /*JScrollPane jScrollPane = new JScrollPane();
      Object[] columnNames = {"选择","书名","作者","出版社"};
      JTable jTable = new JTable(new DefaultTableModel(null, columnNames));
      DefaultTableModel tableModel = (DefaultTableModel)jTable.getModel();
      for (int i = 0; i < 50; i++) {
          tableModel.addRow(new String[]{null,"鬼吹灯"+i,"天下霸唱","长江出版社"});
      }


      ArrayList<Integer> indexArray = new ArrayList<>();
      //给表格加监听   MouseAdapter适配器模式
      jTable.addMouseListener(new MouseAdapter() {

          @Override
          public void mouseClicked(MouseEvent e) {
              if(e.getButton()!=1) {
                  return;
              }

              int column = jTable.getSelectedColumn();

              if(column!=0) {
                  return;
              }

              int row = jTable.getSelectedRow();

              System.out.println(row+"   "+column);

              //原来的值是 null 或者 false   --------> true
              //原来是true   ------->    false
              Boolean oldValue = (Boolean) jTable.getValueAt(row, column);
              if(oldValue == null || oldValue == false) {
                  jTable.setValueAt(true, row, column);
                  indexArray.add(row);
              }else {
                  jTable.setValueAt(false, row, column);
                  indexArray.remove(Integer.valueOf(row));
              }


          }

      });*/
      JComboBox box = new JComboBox();
      JTextArea area=new JTextArea(50,50);
      area.getText();
      JTextField text =new JTextField("",1000);
      box.addItem("---请选择小说---");
      for (int i = 0; i < files1.length; i++) {
          box.addItem(files1[i].getName());
          box.getSelectedItem();
    }
            jf1.add(box);
            jf2.add(area);
}
}
class MyDialog {
     JFrame jd1=new JFrame();
     JFrame jd2=new JFrame();
     MyFrame myFrame=new MyFrame();
     public MyDialog(){
        //JDialog jd1=new JDialog();
        //JDialog jd2=new JDialog();
        jd1.setLayout(new GridLayout());
        jd2.setLayout(new GridLayout());
        jd1.setBounds(0,0,500,500);
        jd2.setBounds(0,0,500,500);
        JButton b4=new JButton("添加小说");
        JButton b5=new JButton("阅读小说");//做一个下拉式的阅读和删除
        JButton b6=new JButton("删除小说");
        JButton b7=new JButton("我的书架");//表格式罗列
        JButton b8=new JButton("查看书库");
        JButton B1=new JButton("编写小说");
        JButton B2=new JButton("删除小说");
        JButton B3=new JButton("查看小说");
        jd1.add(b4);
        jd1.add(b5);
        jd1.add(b6);
        jd1.add(b7);
        jd1.add(b8);
        jd2.add(B1);
        jd2.add(B2);
        jd2.add(B3);



        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
         b5.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

                 myFrame.jf1.setVisible(true);

             }
         });
        //下拉框的监听事件
         // box.addItemListener(new ItemListener()){


         b6.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 myFrame.jf1.setVisible(true);
             }
         });
         b7.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

             }
         });
         b8.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

             }
         });
         B1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 myFrame.jf2.setVisible(true);
             }
         });
         B2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

             }
         });
         B3.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

             }
         });
    }
}
public class NovelReader extends JFrame {
    public NovelReader(){
        MyDialog myDialog=new MyDialog();
        setTitle("小说阅读器");
        setBounds(0,0,500,500);
        BorderLayout borderLayout=new BorderLayout();
        CardLayout cardLayout = new  CardLayout();
        JPanel centerPanle = new JPanel(cardLayout);
        JPanel southPanle = new JPanel(new FlowLayout());
        JLabel jLabel=new JLabel();
        URL url= testWindow.class.getResource("1.jpg");
        Icon icon=new ImageIcon(url);
        jLabel.setIcon(icon);
        jLabel.setOpaque(true);//
        JButton b1=new JButton("读者操作");
        JButton b2=new JButton("创作操作");
        JButton b3=new JButton("退出系统");
        b1.setBounds(100,0,400,300);
        b2.setBounds(100,200,400,300);
        b3.setBounds(100,400,400,300);
        centerPanle.add(jLabel);
        southPanle.add(b1);
        southPanle.add(b2);
        southPanle.add(b3);
        add(BorderLayout.CENTER,centerPanle);
        add(BorderLayout.SOUTH,southPanle);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myDialog.jd1.setVisible(true);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myDialog.jd2.setVisible(true);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            System.exit(0);
            }
        });
    }
    public static void main(String[]args){
        new NovelReader();
    }
}
