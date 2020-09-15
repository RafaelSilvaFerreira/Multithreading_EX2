package EX;

public class Main {

public static void main(String[] args) {
	Thread thread1 = new Thread();
	Thread thread2 = new Thread();
	Thread thread3 = new Thread();
	Thread thread4 = new Thread();
	Thread thread5 = new Thread();
	
	System.out.println(thread1.getId()+
	" "+
	thread2.getId()+
	" "+
	thread3.getId()+
	" "+
	thread4.getId()+
	" "+
	thread5.getId()
	);
	
}




}
