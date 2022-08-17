package calcu;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Miniproject2 {
	public static void main(String args[]) {
		JFrame frame=new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		
		JTable table=new JTable();
		frame.setLayout(null);
		frame.setLocation(600,100);
		frame.setTitle("VIGNESHKUMAR'S HOSPITAL");
		frame.setSize(500,500);
		frame.setVisible(true);
		
		JLabel label=new JLabel("MANAGEMENT RECORDS");
		label.setBounds(170,20,450,200);
		frame.add(label);
		
		JButton patient=new JButton("PATIENT");
		patient.setBounds(90,200,100,25);
		frame.add(patient);
		patient.setBackground(Color.cyan);
		
		JButton doctor=new JButton("DOCTOR");
		doctor.setBounds(90,250,100,25);
		frame.add(doctor);
		doctor.setBackground(Color.green);
		
		JButton other=new JButton("OTHER EMPLOYEES");
		other.setBounds(90,300,180,25);
		frame.add(other);
		other.setBackground(Color.yellow);
		
		patient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f1=new JFrame();
				f1.setLocation(400,50);
				f1.setTitle("  PATIENT INFO");
				f1.getContentPane().setBackground(Color.yellow);
				f1.setLayout(null);
				f1.setSize(900,700);
				f1.setVisible(true);
		JLabel l2=new JLabel("ID");
		l2.setBounds(20,220,100,25);
		JLabel l3=new JLabel("NAME");
		l3.setBounds(20,250,100,25);
		JLabel l4=new JLabel("APNT TIME");
		l4.setBounds(20,280,100,25);
		JLabel l5=new JLabel("DISEASE");
		l5.setBounds(20,310,100,25);
		JLabel l1=new JLabel("ADMI DATE");
		l1.setBounds(20,340,100,25);
		JLabel l9=new JLabel("BILL");
		l9.setBounds(20,370,100,25);
		
		JTextField id=new JTextField();
		id.setBounds(100,220,100,25);
		JTextField name=new JTextField();
		name.setBounds(100,250,100,25);
		JTextField time=new JTextField();
		time.setBounds(100,280,100,25);
		JTextField disease=new JTextField();
		disease.setBounds(100,310,100,25);
		JTextField date=new JTextField();
		date.setBounds(100,340,100,25);
		JTextField bill=new JTextField();
		bill.setBounds(100,370,100,25);
		
		JButton add=new JButton("ADD");
		add.setBounds(250,220,100,25);
		add.setBackground(Color.orange);
		JButton update=new JButton("UPDATE");
		update.setBounds(250,270,100,25);
		update.setBackground(Color.pink);
		
		JScrollPane pane=new JScrollPane(table);
		pane.setBounds(0,0,880,200);
		
		f1.add(l1);
		f1.add(l2);
		f1.add(l3);
		f1.add(l4);
		f1.add(l5);
		f1.add(l9);
		f1.add(pane);
		f1.add(date);
		f1.add(id);
		f1.add(name);
		f1.add(time);
		f1.add(disease);
		f1.add(bill);
		f1.add(add);
		f1.add(update);
		
		DefaultTableModel model=new DefaultTableModel();
		table.setModel(model);
		table.setBackground(Color.cyan);
		table.setRowHeight(40);

		Object[] row =new Object[6];
		Object[] columns= {"Id","Name","APNT TIME","DISEASE","DATE","BILL"};
		model.setColumnIdentifiers(columns);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				row[0]=id.getText();
				row[1]=name.getText();
				row[2]=time.getText();
				row[3]=disease.getText();
				row[4]=date.getText();
				row[5]=bill.getText();
				model.addRow(row);
			}
		});
		 
		table.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();
				id.setText(model.getValueAt(i,0).toString());
				name.setText(model.getValueAt(i,1).toString());
				time.setText(model.getValueAt(i,2).toString());
				disease.setText(model.getValueAt(i,3).toString());
				date.setText(model.getValueAt(i,4).toString());
				bill.setText(model.getValueAt(i,5).toString());
			}
		});
		
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				model.setValueAt(id.getText(), i, 0);
				model.setValueAt(name.getText(), i, 0);
				model.setValueAt(time.getText(), i, 0);
				model.setValueAt(disease.getText(), i, 0);
				model.setValueAt(date.getText(), i, 0);
				model.setValueAt(bill.getText(), i, 0);
			}
		});
	};
});
		
	doctor.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			DefaultTableModel m=new DefaultTableModel();
			table.setModel(m);
			table.setBackground(Color.cyan);
			table.setRowHeight(30);
			JFrame f=new JFrame();
			f.setLocation(400,50);
			f.setTitle("  DOCTOR'S INFO");
			f.getContentPane().setBackground(Color.yellow);
			f.setLayout(null);
			f.setSize(899,750);
			f.setVisible(true);
	JLabel l2=new JLabel("ID");
	l2.setBounds(20,220,100,25);
	JLabel l3=new JLabel("NAME");
	l3.setBounds(20,250,100,25);
	JLabel l6=new JLabel("SPECIALIST");
	l6.setBounds(20,280,100,25);
	JLabel l7=new JLabel("QUALIF");
	l7.setBounds(20,310,100,25);
	JLabel l8=new JLabel("SALARY");
	l8.setBounds(20,340,100,25);
	
	JTextField id=new JTextField();
	id.setBounds(100,220,100,25);
	JTextField name=new JTextField();
	name.setBounds(100,250,100,25);
	JTextField specialist=new JTextField();
	specialist.setBounds(100,280,100,25);
	JTextField qualification=new JTextField();
	qualification.setBounds(100,310,100,25);
	JTextField salary=new JTextField();
	salary.setBounds(100,340,100,25);
	
	JButton add=new JButton("ADD");
	add.setBounds(250,220,100,25);
	add.setBackground(Color.orange);
	JButton update=new JButton("UPDATE");
	update.setBounds(250,270,100,25);
	update.setBackground(Color.pink);
	JScrollPane pane=new JScrollPane(table);
	pane.setBounds(0,0,880,200);
	
	f.add(l2);
	f.add(l3);
	f.add(l6);
	f.add(l7);
	f.add(l8);
	f.add(pane);
	f.add(specialist);
	f.add(id);
	f.add(name);
	f.add(qualification);
	f.add(salary);
	f.add(add);
	f.add(update);
	

	Object[] row =new Object[6];
	Object[] column= {"Id","Name","SPECIALIST","QUALIFICATION","SALARY"};
	m.setColumnIdentifiers(column);
	add.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			row[0]=id.getText();
			row[1]=name.getText();
			row[2]=specialist.getText();
			row[3]=qualification.getText();
			row[4]=salary.getText();
			m.addRow(row);
		}
	});
	
	table.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e) {
			int i=table.getSelectedRow();
			id.setText(m.getValueAt(i,0).toString());
			name.setText(m.getValueAt(i,1).toString());
			specialist.setText(m.getValueAt(i,2).toString());
			qualification.setText(m.getValueAt(i,3).toString());
			salary.setText(m.getValueAt(i,4).toString());
			
		}
	});
	
	update.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int i=table.getSelectedRow();
			m.setValueAt(id.getText(), i, 0);
			m.setValueAt(name.getText(), i, 0);
			m.setValueAt(specialist.getText(), i, 0);
			m.setValueAt(qualification.getText(), i, 0);
			m.setValueAt(salary.getText(), i, 0);
			
			}
		});
	};
});
	other.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			DefaultTableModel m1=new DefaultTableModel();
			table.setModel(m1);
			table.setBackground(Color.cyan);
			table.setRowHeight(30);
			JFrame f=new JFrame();
			f.setLocation(400,50);
			f.setTitle("  OTHER EMPLOYEE'S INFO");
			f.setLayout(null);
			f.setSize(894,750);
			f.getContentPane().setBackground(Color.YELLOW);
			f.setVisible(true);
	JLabel l2=new JLabel("ID");
	l2.setBounds(20,220,100,25);
	JLabel l3=new JLabel("NAME");
	l3.setBounds(20,250,100,25);
	JLabel l6=new JLabel("EMPLOYEE AS");
	l6.setBounds(20,280,100,25);
	JLabel l7=new JLabel("SALARY");
	l7.setBounds(20,310,100,25);
	JLabel l8=new JLabel("AGE");
	l8.setBounds(20,340,100,25);
	
	JTextField id=new JTextField();
	id.setBounds(100,220,100,25);
	JTextField name=new JTextField();
	name.setBounds(100,250,100,25);
	JTextField emp=new JTextField();
	emp.setBounds(100,280,100,25);
	JTextField salary=new JTextField();
	salary.setBounds(100,310,100,25);
	JTextField age=new JTextField();
	age.setBounds(100,340,100,25);
	
	JButton add=new JButton("ADD");
	add.setBounds(250,220,100,25);
	add.setBackground(Color.orange);
	JButton update=new JButton("UPDATE");
	update.setBounds(250,270,100,25);
	update.setBackground(Color.pink);
	JScrollPane pane=new JScrollPane(table);
	pane.setBounds(0,0,880,200);
	
	f.add(l2);
	f.add(l3);
	f.add(l6);
	f.add(l7);
	f.add(l8);
	f.add(pane);
	f.add(emp);
	f.add(id);
	f.add(name);
	f.add(age);
	f.add(salary);
	f.add(add);
	f.add(update);
	

	Object[] row =new Object[6];
	Object[] column= {"Id","Name","EMPLOYEE AS","AGE","SALARY"};
	m1.setColumnIdentifiers(column);
	add.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			row[0]=id.getText();
			row[1]=name.getText();
			row[2]=emp.getText();
			row[3]=age.getText();
			row[4]=salary.getText();
			m1.addRow(row);
		}
	});
	
	table.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e) {
			int i=table.getSelectedRow();
			id.setText(m1.getValueAt(i,0).toString());
			name.setText(m1.getValueAt(i,1).toString());
			emp.setText(m1.getValueAt(i,2).toString());
			age.setText(m1.getValueAt(i,3).toString());
			salary.setText(m1.getValueAt(i,4).toString());
			
		}
	});
	
	update.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int i=table.getSelectedRow();
			m1.setValueAt(id.getText(), i, 0);
			m1.setValueAt(name.getText(), i, 0);
			m1.setValueAt(emp.getText(), i, 0);
			m1.setValueAt(age.getText(), i, 0);
			m1.setValueAt(salary.getText(), i, 0);
			
			}
		});
	};
});
}
}
