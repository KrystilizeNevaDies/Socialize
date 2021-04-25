package main;
import java.util.Date;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import socialize.PlayerSocials;
import socialize.data.BackgroundData;
import socialize.data.BadgeData;
import socialize.data.BioData;
import socialize.data.FriendData;
import socialize.data.GiftData;
import socialize.data.MailData;
import socialize.data.ShellsData;
import socialize.database.CurrencyDatabase;
import socialize.database.SelectedSetDatabase;
import socialize.database.SetDatabase;
import socialize.database.implementations.CurrencyDatabaseImpl;
import socialize.database.implementations.SelectedSetDatabaseImpl;
import socialize.database.implementations.SetDatabaseImpl;
import socialize.tracing.AnonymousOrigin;
import socialize.tracing.Origin;
import socialize.tracing.PlayerInteractionOrigin;
/**
 * Primitive tests used to ensure the integrity of the codebase
 * 
 * @author Krystilize
 *
 */
public class TestPlayerSocials {
	
	static Random random = new Random();
	
	private static final Origin TEST_ORIGIN_A = new AnonymousOrigin(Origin.ROOT, new Date());
	private static final Origin TEST_ORIGIN_B = new PlayerInteractionOrigin(Origin.ROOT, new Date(random.nextInt()), UUID.randomUUID(), UUID.randomUUID());
	
	@Test
	public void doTests() {
		
		// Create PlayerSocials object
		PlayerSocials socials = PlayerSocials.builder(UUID.randomUUID())
			.setBackgroundDatabase(getBackgroundDatabase())
			.setBadgeDatabase(getBadgeDatabase())
			.setFriendDatabase(getFriendDatabase())
			.setGiftDatabase(getGiftDatabase())
			.setMailDatabase(getMailDatabase())
			.setShellDatabase(getShellDatabase())
			.setBioDatabase(getBioDatabase())
			.build();
		
		// Print everything
		System.out.println("\nBackgrounds: {");
		socials.getBackgrounds().getAll().forEach((data) -> {
			System.out.print(data.getID() + ", ");
			System.out.println(data.getOrigin().getOriginNotes());
		});
		
		System.out.println("}\nBadges: {");
		socials.getBadges().getAll().forEach((data) -> {
			System.out.print(data.getID() + ", ");
			System.out.println(data.getOrigin().getOriginNotes());
		});
		
		System.out.println("}\nBios: {");
		socials.getBios().getAll().forEach((data) -> {
			System.out.print(data.getBio() + ", ");
			System.out.println(data.getOrigin().getOriginNotes());
		});
		
		System.out.println("}\nFriends: {");
		socials.getFriends().getAll().forEach((data) -> {
			System.out.print(data.getUUID() + ", ");
			System.out.println(data.getOrigin().getOriginNotes());
		});
		
		System.out.println("}\nGifts: {");
		socials.getGifts().getAll().forEach((data) -> {
			System.out.print(data.getID() + ", ");
			System.out.println(data.getOrigin().getOriginNotes());
		});
		
		System.out.println("}\nMail: {");
		socials.getMail().getAll().forEach((data) -> {
			System.out.print(data.getMail() + ", ");
			System.out.println(data.getOrigin().getOriginNotes());
		});
		
		System.out.println("}\nShells: {");
		socials.getShells().getAll().forEach((data) -> {
			System.out.print(data.getAmount() + ", ");
			System.out.println(data.getOrigin().getOriginNotes());
		});
		System.out.println("}");
		
		// Predicate tests
		System.out.println("");
		System.out.println("Running prdicate tests...");
		
		
		// SetDatabase
		{
			BadgeData data = socials.getBadges().get((badgeData) -> {
				return badgeData.getID() == 123432;
			});
			Assert.assertNotNull(data);
		}
		
		// CurrencyDatabase
		{
			ShellsData data = socials.getShells().get((shellsData) -> {
				return shellsData.getAmount() == 8745;
			});
			
			Assert.assertNotNull(data);
		}
		
		{
			ShellsData data = socials.getShells().get((shellsData) -> {
				return shellsData.getAmount() == 874235;
			});
			
			Assert.assertNull(data);
		}
		
		{
			double total = socials.getShells().getTotal();
			
			Assert.assertTrue(total == (8745 + 142));
		}
		
		// SelectedSetDatabase
		
		{
			BackgroundData selected = socials.getBackgrounds().getSelected();
			
			Assert.assertTrue(selected.getID() == 3212323);
		}
		
		System.out.println("Testing complete!");
	}
	
	public static SetDatabase<BadgeData> getBadgeDatabase() {
		return new SetDatabaseImpl<BadgeData>(
			Set.of(
				BadgeData.from(
					123432,
					TEST_ORIGIN_A
				),
				BadgeData.from(
					random.nextInt(),
					TEST_ORIGIN_B
				)
			)
		);
	}
	
	public static SetDatabase<FriendData> getFriendDatabase() {
		return new SetDatabaseImpl<FriendData>(
			Set.of(
				FriendData.from(
					new UUID(1, 0),
					TEST_ORIGIN_A
				),
				FriendData.from(
					new UUID(2, 0),
					TEST_ORIGIN_B
				)
			)
		);
	}
	
	public static SetDatabase<GiftData> getGiftDatabase() {
		return new SetDatabaseImpl<GiftData>(
			Set.of(
				GiftData.from(
					random.nextInt(),
					TEST_ORIGIN_A
				),
				GiftData.from(
					random.nextInt(),
					TEST_ORIGIN_B
				)
			)
		);
	}
	
	public static SetDatabase<MailData> getMailDatabase() {
		return new SetDatabaseImpl<MailData>(
			Set.of(
				MailData.from(
					"Test Mail A",
					TEST_ORIGIN_A
				),
				MailData.from(
					"Test Mail B",
					TEST_ORIGIN_B
				)
			)
		);
	}
	
	public static CurrencyDatabase<ShellsData> getShellDatabase() {
		return new CurrencyDatabaseImpl<ShellsData>(
			Set.of(
				ShellsData.from(
					8745,
					TEST_ORIGIN_A
				),
				ShellsData.from(
					142,
					TEST_ORIGIN_B
				)
			)
		);
	}
	
	public static SelectedSetDatabase<BioData> getBioDatabase() {
		BioData data = BioData.from(
			"Test Bio A",
			TEST_ORIGIN_A
		);
		
		return new SelectedSetDatabaseImpl<BioData>(
			Set.of(
				data,
				BioData.from(
					"Test Bio B",
					TEST_ORIGIN_B
				)
			),
			data
		);
	}
	
	public static SelectedSetDatabase<BackgroundData> getBackgroundDatabase() {
		BackgroundData data = BackgroundData.from(
			3212323,
			TEST_ORIGIN_A
		);
		
		return new SelectedSetDatabaseImpl<BackgroundData>(
			Set.of(
				data,
				BackgroundData.from(
					random.nextInt(),
					TEST_ORIGIN_B
				)
			),
			data
		);
	}
}
