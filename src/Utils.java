public class Utils {
	// Return the reverse of s without changing s.
	public static <U extends Separable<U>> U reverse(U s) {
		U tum = s;
		U x = tum.first();
		for (int i = 0; i < s.length(); i++) {
			tum = reverse(s, s, i);

			if (i > 0) {
				x = x.concat(x, tum.first());

			}

			else {
				x = tum;
			}
		}
		return x;

	}

	private static <U extends Separable<U>> U reverse(U s, U s1, int curent) {
		if (curent == s1.length() - 1)
			return s;
		return reverse(s.rest(), s1, curent + 1);

	}

	// Return the last part of s without changing s.
	public static <U extends Separable<U>> U last(U s) {

		U tum = s;
		for (int i = s.length(); i > 1; i--) {
			tum = tum.rest();
		}
		return tum;

	}

}
