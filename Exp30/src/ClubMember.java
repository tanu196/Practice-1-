public class ClubMember {
	private String name;
	private int money;

	private static String clubName = "情報システム研究会";
	private static int clubFund = 0;
	private static int memberCount;

	public ClubMember(String name, int money) {
		this.name = name;
		this.money = money;
		memberCount++;
	}

	public void showInfo() {
		System.out.println("名前：" + name + "所持金：" + money);
	}

	public void payClubFee(int amount) {
		money -= amount;
		clubFund -= amount;
	}

	public static void showClubInfo() {
		System.out.println("部活の名前：" + clubName + "部費残高：" + clubFund + "部員数" + memberCount);
	}

	public static void setClubName(String newName) {
		clubName = newName;
	}

}
