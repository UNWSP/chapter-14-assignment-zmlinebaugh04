import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
  
class JVacationRental extends JFrame {

    JRadioButton parkside, poolside, lakeside, oneRoom, twoRoom, threeRoom, food;

    ButtonGroup G1, G2;
  
    JLabel total, totalPrint;
    
    String charge;
    
    int totalCharge, viewCharge, roomCharge;
    final int ROOMCHARGE = 75;
  
    public JVacationRental()
    {
  
        // Setting layout as null of JFrame.
        this.setLayout(null);
  
        
        // Initialization of object of "JRadioButton" class.
        parkside = new JRadioButton("parkside");
  
        // Initialization of object of "JRadioButton" class.
        poolside = new JRadioButton("poolside");
        
        lakeside = new JRadioButton("lakeside");
  
  
        // Initialization of object of "ButtonGroup" class.
        G1 = new ButtonGroup();
  
        total = new JLabel("Total");
        
        total.setBounds(67, 100, 50,50);
        
        totalPrint = new JLabel();
        
        totalPrint.setBounds(100,100, 50, 50);
  
        parkside.setText("Parkside");
  
        // Setting text of "jRadioButton4".
        poolside.setText("Poolside");
        
        lakeside.setText("Lakeside");
  
        // Setting Bounds of "jRadioButton2".
        parkside.setBounds(50, 20, 95, 43);
  
        // Setting Bounds of "jRadioButton4".
        poolside.setBounds(150, 20, 95, 43);
        
        lakeside.setBounds(250, 20, 95, 43);
  
        this.add(totalPrint);
        this.add(total);
  
        // "this" keyword in java refers to current object.
        // Adding "jRadioButton2" on JFrame.
        this.add(parkside);
  
        // Adding "jRadioButton4" on JFrame.
        this.add(poolside);
        
        this.add(lakeside);

        
        parkside.addActionListener(new ActionListener() {
            // Anonymous class.
  
            public void actionPerformed(ActionEvent e) {

                // If condition to check if jRadioButton2 is selected.
                if (parkside.isSelected()) {
  
                    totalCharge += 600;
            		charge = String.valueOf(totalCharge);
            		totalPrint.setText(charge); 
                } 
            }
        });
  
        poolside.addActionListener(new ActionListener() {
            // Anonymous class.
  
            public void actionPerformed(ActionEvent e) {
            	
            	if (poolside.isSelected()) {
  
                	totalCharge += 750;
            		charge = String.valueOf(totalCharge);
            		totalPrint.setText(charge);
            	}       
            }
        });
        
        lakeside.addActionListener(new ActionListener() {
            // Anonymous class.
  
            public void actionPerformed(ActionEvent e) {
            	if (lakeside.isSelected()) {
  
                	totalCharge += 825;
            		charge = String.valueOf(totalCharge);
            		totalPrint.setText(charge);
            	}
            }
        });
        
        // Adding "jRadioButton1" and "jRadioButton3" in a Button Group "G2".
        G1.add(parkside);
        G1.add(poolside);
        G1.add(lakeside);
        
        
  //Create Room Selection ButtonGroup
        
        G2 = new ButtonGroup();
        
        oneRoom = new JRadioButton("oneRoom");
        twoRoom = new JRadioButton("twoRoom");
        threeRoom = new JRadioButton("threeRoom");
        food = new JRadioButton("food");
        
        oneRoom.setBounds(50,50,80,50);
        twoRoom.setBounds(150,50,80,50);
        threeRoom.setBounds(250,50,80,50);
        food.setBounds(150, 95, 80, 50);
        
        oneRoom.setText("One Rooms");
        twoRoom.setText("Two Rooms");
        threeRoom.setText("Three Rooms");
        food.setText("Food?");
        
        this.add(oneRoom);
        this.add(twoRoom);
        this.add(threeRoom);
        this.add(food);
        
        food.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	if(food.isSelected()) {
        		totalCharge += 200;
        		charge = String.valueOf(totalCharge);
        		totalPrint.setText(charge);
        	}
        	}
        });
		
		
        oneRoom.addActionListener(new ActionListener() {
            // Anonymous class.
  
            public void actionPerformed(ActionEvent e) {
            	if(oneRoom.isSelected()) {
            		totalCharge += 0;
            	}
            }
        });
        
        twoRoom.addActionListener(new ActionListener() {
            // Anonymous class.
  
            public void actionPerformed(ActionEvent e) {
            	if(twoRoom.isSelected()) {
            		totalCharge += ROOMCHARGE;
            		charge = String.valueOf(totalCharge);
            		totalPrint.setText(charge);
            	}
            }
        });
        
        threeRoom.addActionListener(new ActionListener() {
            // Anonymous class.
  
            public void actionPerformed(ActionEvent e) {
            	if(threeRoom.isSelected()) {
            		totalCharge += ROOMCHARGE * 2;
            		charge = String.valueOf(totalCharge);
            		totalPrint.setText(charge);
            	}
            }
        });
        
        G2.add(oneRoom);
        G2.add(twoRoom);
        G2.add(threeRoom);
        
    }
    public static void main(String args[]) { 
        JVacationRental f = new JVacationRental();
  
        // Setting Bounds of JFrame.
        f.setBounds(100, 100, 400, 200);
  
        // Setting Title of frame.
        f.setTitle("Vacation Planner");
  
        // Setting Visible status of frame as true.
        f.setVisible(true);
    	
    }
        }
    



       
