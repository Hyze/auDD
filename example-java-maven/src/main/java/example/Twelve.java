package example;

public class Twelve extends Thread {
	Thread thread = null;

	public Twelve(Runnable runnable) {
		thread = new Thread(runnable);
		thread.start();
	}

	@Override
	public void run() {
		super.run();
		arret();

	}

	public void arret() {
		if (thread.isAlive()) {
			synchronized (thread) {
				notifyAll();
			}
			thread.interrupt();
		}
	}

}
