package socialize;

import java.util.UUID;

import socialize.data.BackgroundData;
import socialize.data.BadgeData;
import socialize.data.BioData;
import socialize.data.CoinsData;
import socialize.data.CooldownData;
import socialize.data.GiftData;
import socialize.data.MailData;
import socialize.data.ShellsData;
import socialize.database.CurrencyDatabase;
import socialize.database.FriendDatabase;
import socialize.database.IDatabase;
import socialize.database.MapDatabase;
import socialize.database.SelectedSetDatabase;

/*
 * This class is used to retrieve the data related to player socials
 * <br><br>
 * There is no promise when the data will be obtained, it could be instantly or 10ms later.
 *
 * Gifts - Done
 * Mailbox - Done
 * Bio - Done
 * Backgrounds - Done
 * Badges - Done
 * Friends - Done
 * Shells - Done
 */
public class PlayerSocials {

	/**
	 * Gets the player socials builder
	 */
	public static PlayerSocialsBuilder builder(UUID uuid) {
		return new PlayerSocialsBuilder(uuid);
	}

	private final MapDatabase<String, CooldownData> cooldown;
	private final IDatabase<MailData> mail;
	private final IDatabase<GiftData> gift;
	private final IDatabase<BadgeData> badge;
	private final CurrencyDatabase<ShellsData> shell;
	private final CurrencyDatabase<CoinsData> coin;
	private final FriendDatabase friend;
	private final SelectedSetDatabase<BioData> bio;
	private final SelectedSetDatabase<BackgroundData> background;

	private PlayerSocials(UUID uuid, IDatabase<MailData> mail, IDatabase<GiftData> gift, IDatabase<BadgeData> badge,
			CurrencyDatabase<ShellsData> shell, CurrencyDatabase<CoinsData> coin, FriendDatabase friend,
			SelectedSetDatabase<BioData> bio, SelectedSetDatabase<BackgroundData> background,
			MapDatabase<String, CooldownData> cooldown) {
		this.mail = mail;
		this.gift = gift;
		this.badge = badge;
		this.friend = friend;
		this.shell = shell;
		this.coin = coin;
		this.bio = bio;
		this.background = background;
		this.cooldown = cooldown;
	}

	public IDatabase<MailData> getMail() {
		return mail;
	}

	public IDatabase<GiftData> getGifts() {
		return gift;
	}

	public IDatabase<BadgeData> getBadges() {
		return badge;
	}

	public CurrencyDatabase<ShellsData> getShells() {
		return shell;
	}

	public CurrencyDatabase<CoinsData> getCoins() {
		return coin;
	}

	public FriendDatabase getFriends() {
		return friend;
	}

	public SelectedSetDatabase<BioData> getBios() {
		return bio;
	}

	public SelectedSetDatabase<BackgroundData> getBackgrounds() {
		return background;
	}

	public MapDatabase<String, CooldownData> getCooldowns() {
		return cooldown;
	}

	public static class PlayerSocialsBuilder {
		private final UUID uuid;

		// Databases
		private IDatabase<MailData> mail;
		private IDatabase<GiftData> gift;
		private IDatabase<BadgeData> badge;
		private CurrencyDatabase<ShellsData> shell;
		private CurrencyDatabase<CoinsData> coin;
		private FriendDatabase friend;
		private SelectedSetDatabase<BioData> bio;
		private SelectedSetDatabase<BackgroundData> background;
		private MapDatabase<String, CooldownData> cooldown;

		private PlayerSocialsBuilder(UUID uuid) {
			this.uuid = uuid;
		}

		public PlayerSocials build() {
			return new PlayerSocials(uuid, mail, gift, badge, shell, coin, friend, bio, background, cooldown);
		}

		public PlayerSocialsBuilder setMailDatabase(IDatabase<MailData> mail) {
			this.mail = mail;
			return this;
		}

		public PlayerSocialsBuilder setGiftDatabase(IDatabase<GiftData> gift) {
			this.gift = gift;
			return this;
		}

		public PlayerSocialsBuilder setBadgeDatabase(IDatabase<BadgeData> badge) {
			this.badge = badge;
			return this;
		}

		public PlayerSocialsBuilder setShellDatabase(CurrencyDatabase<ShellsData> shell) {
			this.shell = shell;
			return this;
		}

		public PlayerSocialsBuilder setCoinDatabase(CurrencyDatabase<CoinsData> coin) {
			this.coin = coin;
			return this;
		}

		public PlayerSocialsBuilder setFriendDatabase(FriendDatabase friend) {
			this.friend = friend;
			return this;
		}

		public PlayerSocialsBuilder setBioDatabase(SelectedSetDatabase<BioData> bio) {
			this.bio = bio;
			return this;
		}

		public PlayerSocialsBuilder setBackgroundDatabase(SelectedSetDatabase<BackgroundData> background) {
			this.background = background;
			return this;
		}

		public PlayerSocialsBuilder setCooldownDatabase(MapDatabase<String, CooldownData> cooldown) {
			this.cooldown = cooldown;
			return this;
		}
	}
}
