package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class cont {
	
	String str = "0";
	
	double n1;
	double n2;
	double re = 0;
	
	char op ;
	
	double ans;
	@FXML
	private Label label;


	

	
		public void on0(){
			
			if (!label.getText().equals("0"))
				str += "0";
			
		
			label.setText(str);

			 
			
			
	}
	
		public void on1(){
			
			if (str.equals("0"))
				str = "1";
			else 
				str += "1";
			
			
			label.setText(str);

		
	}

		public void on2(){
			
			if (str.equals("0"))
				str = "2";
			else 
				str += "2";
			
			
			label.setText(str);
			
	}		
		public void on3(){
			
			if (str.equals("0"))
				str = "3";
			else 
				str += "3";
			
			
			label.setText(str);
		
	}
		
		public void on4(){
			
			if (str.equals("0"))
				str = "4";
			else 
				str += "4";
			
			
			label.setText(str);
		
	}
		public void on5(){
			
			if (str.equals("0"))
				str = "5";
			else 
				str += "5";
			
			
			label.setText(str);
		
	}

		public void on6(){
			
			if (str.equals("0"))
				str = "6";
			else 
				str += "6";
			
			
			label.setText(str);
		
	}
		
		public void on7(){
			
			if (str.equals("0"))
				str = "7";
			else 
				str += "7";
			
			
			label.setText(str);
			
	}
		
		public void on8(){
			
			if (str.equals("0"))
				str = "8";
			else 
				str += "8";
			
			
			label.setText(str);
			
	}
	
		
		public void on9(){
			
			if (str.equals("0"))
				str = "9";
			else 
				str += "9";
			
			
			label.setText(str);
			
	}
		
		
		

		public void onp(){
			
			
			getn1();
			
		
			str = "0";
			label.setText(str);
			op = '+';
			
			
		    

			
			
			
			}
			
			
	
	
		public void onm(){
			
			getn1();
			
			
			str = "0";
			label.setText(str);
			op = '-';
			
			
			
			
		}
		
		public void onmu(){
			
			getn1();
			
			
			str = "0";
			label.setText(str);
			op = '*';
			
			
			
			
			
		}
		
		public void ond(){
			
			
			getn1();
			
			
			str = "0";
			label.setText(str);
			op = '/';
			
			
			
			
		}
		
		
		public void onc() {
			
			str = "0";
			
			label.setText(str);
		}
		
		
		public void once() {
			
			str = "0";
			
			label.setText(str);
			op = ' ';
			
		}

		
		public void ondot() {
			
			
			str += ".";
			
			
		}
		
		
		public void ondel() {
			
			String string = label.getText();
			
			label.setText("");
			
			for(int i = 0; i<string.length() -1; i++) {
				str = (label.getText() + string.charAt(i));
				
				label.setText(str);
				
				
			}
			
			
		}
		
		public void oe(){
			
			
			getn2();
			
				
			switch (op) {
			
			case '+' : ans = n1+n2; break;
				
			case '*' : ans = n1*n2; break;
			
			case '/' : ans = n1/n2; break;
			
			case '-' : ans = n1-n2; break;
			
			}
			
			
			
			str = String.valueOf(ans);
			
			
			label.setText(str);
			
			
			
			
		
		
		
		
			
		}
		
		
		public void getn1(){
			
			n1 = Double.parseDouble(str);
			
		}
		
		
		
		public void getn2(){
			
			n2 = Double.parseDouble(str);
			
		}
		
		
		
	

}
