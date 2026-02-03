public class SatScoresExample_4 {
    public static void main(String[] args) {
//		System.out.println("200: " + rating(200));
		System.out.println("600: " + rating(600));
		System.out.println("1000: " + rating(1000));
		System.out.println("1400: " + rating(1400));
//		System.out.println("1800: " + rating(1800));
    }

	public static String rating (int totalSAT) {
		if (totalSAT < 400 || totalSAT > 1600) {
			throw new IllegalArgumentException("invalid total SAT score: " + totalSAT);
		} else if (totalSAT < 800) {
			return "not competitive";
		} else if (totalSAT >= 1200) {
			return "highly competitive";
		} else { // 800 <= totalSAT < 1200
			return "competitive";
		}
	}
}