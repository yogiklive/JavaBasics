package designpattern.singleton;

public final class LazyInitialization {

	private static volatile LazyInitialization instance = null;

	private LazyInitialization() {
	}

	private static LazyInitialization getInstance() {
		if (instance == null) {
			synchronized (LazyInitialization.class) {
				instance = new LazyInitialization();
			}
		}
		return instance;
	}

}
