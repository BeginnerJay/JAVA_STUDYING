package chapter15;

class StringDate {
	public static void main(String[] args) {
		String korea = "대한민국";
		String korea2 = new String("대한민국");
		
		System.out.println("== 비교 : " + (korea == korea2 ? "같다":"다르다"));
		System.out.println("equals 비교: " + (korea.equals(korea2) ? "같다":"다르다"));
	}
}