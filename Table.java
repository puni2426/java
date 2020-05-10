import javax.swing.*;    
public class TableExample {    
    JFrame f;    
    TableExample(){    
    f=new JFrame();    
    String data[][]={ {"4AL18CS064","PUNITH","4","CSE","B"},    
                          {"4AL18CS068","RAMESH","4","CSR","B"},    
                          {"4AL18CS072","HARIN","4","CSE","B"};    
    String column[]={"USN","NAME","SEM","BRANCH","SECTION"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
}     
public static void main(String[] args) {    
    new TableExample();    
}    
} 
