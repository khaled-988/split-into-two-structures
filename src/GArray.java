
class GArray<T> implements Separable<GArray<T>> {
	private T[] data;

	@SuppressWarnings("unchecked")
	public GArray(int n) {
		data = (T[]) new Object[n];
	}

	// Return the element at position i
	public T get(int i) {
		return data[i];
	}

	// Set the element at position i
	public void set(int i, T e) {
		data[i] = e;
	}

	@Override
	public int length() {
		return data.length; // Change this
	}

	@Override
	public GArray<T> first() {

		GArray<T> tum = new GArray<T>(1);
		if (this.get(0) != null) {
			tum.set(0, this.get(0));
			return tum;
		}
		return null;
	}

	@Override

	public GArray<T> rest() {
		if (data.length > 1) {
			GArray<T> tum = new GArray<T>(data.length - 1);
			int x = 0;
			for (int i = 1; i < data.length; i++) {
				tum.set(x++, this.get(i));
			}
			return tum;
		} else if (data.length == 1)
			return this.first();
		return null;
	}

	
	public GArray<T> concat(GArray<T> s1, GArray<T> s2) {
		GArray<T> tum = new GArray<T>(s1.length()+1);
		for (int i = 0; i < tum.length()-1; i++) {
			tum.set(i, s1.get(i));
		}
		tum.set(tum.length ()- 1, s2.get(s2.length()-1));

		return tum; 
	}
	
}
