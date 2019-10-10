public interface Venenoso {

	public void envenenar();

	default String morder() {
		return null;
	}
}
