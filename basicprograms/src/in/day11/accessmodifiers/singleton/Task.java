package in.day11.accessmodifiers.singleton;

public class Task {
	
		private int var1;
		private int var2;
		
		private static Task instance;
		
		private Task() {
			var1 = 1;
			var2 = 1;
			
		}
		
		public static Task getInstance(int var1, int var2) {
	        if (instance == null) {
	            instance = new Task();
	        }
	        if (var1 >= 0 && var2 >= 0) {
	            instance.var1 = var1;
	            instance.var2 = var2;
	        }
	        return instance;
	    }
		
		@Override
		public String toString() {
			return "Task [var1=" + var1 + ", var2=" + var2 + "]";
		}
		
		
}



