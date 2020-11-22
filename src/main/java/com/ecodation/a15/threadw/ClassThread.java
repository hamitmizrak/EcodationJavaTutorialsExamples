package com.ecodation.a15.threadw;

public class ClassThread extends Thread {
//public class ClassThread extends deneme  implements Serializable,Runnable{

	// run ile kodlarımızı yazıyoruz.
	@Override
	public void run() {
		try {
			// kodlar buraya örneğin: for döngüsü
			System.out.println("1.deneme");
			Thread.sleep(5000);
			System.out.println("2.deneme");
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// metot düzeyinde
	/*
	 * public void methodThread( { Thread thread2=new Thread(new Runnable(){ public
	 * void run(){ method2(); }} );
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		ClassThread classThread = new ClassThread();
		classThread.start();
		classThread.wait(); // uyuma
		classThread.notify(); // kaldırmak
	}
}
