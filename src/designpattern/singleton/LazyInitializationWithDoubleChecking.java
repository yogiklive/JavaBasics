package designpattern.singleton;

public final class LazyInitializationWithDoubleChecking {

	private static volatile LazyInitializationWithDoubleChecking instance = null;

	private LazyInitializationWithDoubleChecking() {
	}

	private static LazyInitializationWithDoubleChecking getInstance() {
		if (instance == null) {
			synchronized (LazyInitializationWithDoubleChecking.class) {

				if (instance == null) {
					instance = new LazyInitializationWithDoubleChecking();
				}
			}
		}
		return instance;

	}

}
