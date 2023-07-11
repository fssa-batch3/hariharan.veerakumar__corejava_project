package day02.practice;

public class Logger {


		public String debug (String msg) {
			System.out.println("DEBUG: " + msg);
			return msg;
			
		}
		public String info (String msg) {
			System.out.println("INFO: " + msg);
			return msg;
		}
		
		public String error (String msg) {
			System.out.println("ERROR: " + msg);
			return msg;
		}
		
		public int debug (int num) {
			System.out.println("DEBUG: " + num);
			return num;
		}
		public int info (int num) {
			System.out.println("INFO: " + num);
			return num;
		}
		public int error (int num) {
			System.out.println("ERROR: " + num);
			return num;
		}
		public float debug (float number) {
			System.out.println("DEBUG: " + number);
			return number;
		}
		public float info (float number) {
			System.out.println("INFO: " + number);
			return number;
		}
		public float error (float number) {
			System.out.println("ERROR: " + number);
			return number;
		}
		public boolean debug (boolean match) {
			System.out.println("DEBUG: " + match);
			return match;
			
		}
		public boolean info (boolean match) {
			System.out.println("INFO: " + match);
			return match;
		}
		public boolean error (boolean match) {
			System.out.println("ERROR: " + match);
			return match;
		}
		
		public static void main(String[] args) {
			
			Logger logger = new Logger();
			logger.error("occured");
			logger.error(100);
			logger.error(20.5f);
			logger.error(true);
			
			
		}

	

}
