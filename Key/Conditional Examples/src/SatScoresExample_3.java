public class SatScoresExample_3 {
    public static void main(String[] args) {
		System.out.println("200: " + rating(200));
		System.out.println("600: " + rating(600));
		System.out.println("1000: " + rating(1000));
		System.out.println("1400: " + rating(1400));
		System.out.println("1800: " + rating(1800));
    }

	public static String rating (int totalSAT) {
		if (totalSAT < 800) {  // assumes that all totalSAT values > 400
			return "not competitive";
		} else if (totalSAT >= 1200) {  // move simpler test up
			return "highly competitive";
		} else {  // 800 <= totalSAT < 1200 (handle most complex test last)
			return "competitive";
		}
	}

}