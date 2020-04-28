package designpattern.singleton;

public class EagerInitialisation {

	private static volatile EagerInitialisation instance = new EagerInitialisation();

	private EagerInitialisation() {
	}

	private static EagerInitialisation getInstance() {
		return instance;
	}
}
