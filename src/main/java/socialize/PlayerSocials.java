package socialize;

import java.util.UUID;

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
import socialize.util.Builder;

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
 * Shells - 
 */
public class PlayerSocials {
	
	/**
	 * Gets the player socials builder
	 */
	public static PlayerSocialsBuilder builder(UUID uuid) {
    	return new PlayerSocialsBuilder(uuid);
    }
	
	private SetDatabase<MailData> mail;
	private SetDatabase<GiftData> gift;
	private SetDatabase<BadgeData> badge;
	private SetDatabase<FriendData> friend;
	private CurrencyDatabase<ShellsData> shell;
	private SelectedSetDatabase<BioData> bio;
	private SelectedSetDatabase<BackgroundData> background;
	
	private PlayerSocials(UUID uuid,
			SetDatabase<MailData> mail,
			SetDatabase<GiftData> gift,
			SetDatabase<BadgeData> badge,
			SetDatabase<FriendData> friend,
			CurrencyDatabase<ShellsData> shell,
			SelectedSetDatabase<BioData> bio,
			SelectedSetDatabase<BackgroundData> background
	) {
		this.mail = mail;
		this.gift = gift;
		this.badge = badge;
		this.friend = friend;
		this.shell = shell;
		this.bio = bio;
		this.background = background;
	}
	
	public SetDatabase<MailData> getMail() {
		return mail;
	}

	public SetDatabase<GiftData> getGifts() {
		return gift;
	}
	
	public SetDatabase<BadgeData> getBadges() {
		return badge;
	}
	
	public SetDatabase<FriendData> getFriends() {
		return friend;
	}
	
	public CurrencyDatabase<ShellsData> getShells() {
		return shell;
	}

	public SelectedSetDatabase<BioData> getBios() {
		return bio;
	}

	public SelectedSetDatabase<BackgroundData> getBackgrounds() {
		return background;
	}
	
	public static class PlayerSocialsBuilder implements Builder<PlayerSocials> {
		UUID uuid;
		
		// Databases
		private SetDatabase<MailData> mail;
		private SetDatabase<GiftData> gift;
		private SetDatabase<BadgeData> badge;
		private SetDatabase<FriendData> friend;
		private CurrencyDatabase<ShellsData> shell;
		private SelectedSetDatabase<BioData> bio;
		private SelectedSetDatabase<BackgroundData> background;
		
		private PlayerSocialsBuilder(UUID uuid) {
			this.uuid = uuid;
		}

		@Override
		public PlayerSocials build() {
			return new PlayerSocials(uuid, mail, gift, badge, friend, shell, bio, background);
		}

		public PlayerSocialsBuilder setMailDatabase(SetDatabase<MailData> mail) {
			this.mail = mail;
			return this;
		}

		public PlayerSocialsBuilder setGiftDatabase(SetDatabase<GiftData> gift) {
			this.gift = gift;
			return this;
		}
		
		public PlayerSocialsBuilder setBadgeDatabase(SetDatabase<BadgeData> badge) {
			this.badge = badge;
			return this;
		}
		
		public PlayerSocialsBuilder setFriendDatabase(SetDatabase<FriendData> friend) {
			this.friend = friend;
			return this;
		}
		
		public PlayerSocialsBuilder setShellDatabase(CurrencyDatabase<ShellsData> shell) {
			this.shell = shell;
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
	}
}
