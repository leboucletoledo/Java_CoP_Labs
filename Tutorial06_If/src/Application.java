public class Application {
	public static void main(String[] args) {
		
		boolean cond = 1 != 1;
		boolean cond1 = 1 == 1;
		System.out.println(cond);
		System.out.println(cond1);
		
		int num = 5;
		if(num<=4){
			System.out.println("¡A huevo, pollo!");
		}
		else if(cond){
			System.out.println("¿Qué haces, wey?");
		}
		else{
			System.out.println("Me la pelas");
		}
		
		int loop = 0;
		
		while(true){
			loop++;
			System.out.println("Looping: " + loop);
			
			if(loop==5)
				break;
			
			System.out.println("Running");
		}
	}
}
