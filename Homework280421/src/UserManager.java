//All users have an ID Card
public class UserManager {
	public void printIDCardforEntry(User user) {
		System.out.println("Sayın "+user.getTamAdSoyad()+" Giriş kartınız basıldı.");
	}
	
	public void printIDCardforEntryMultiple(User[] users)
	{
		for (User user : users) {
			System.out.println("Sayın "+user.getTamAdSoyad()+" Giriş kartınız basıldı.");
		}
	}
	public void document()
	{
			System.out.println("Belgeleri öğrenci işlerinden alınız.");
	}
}
