import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestComposit {

	@Test
	void testPlaylist() {
		Playlist testPlaylist = new Playlist("Test");
		assertNotNull(testPlaylist);
		assertEquals("Test", testPlaylist.playlistName);
	}

	@Test
	void testAddtoPlaylist() {
		Playlist testPlaylist = new Playlist("Test");
		Song testSong = new Song("Girl Like You", "Toro Y Moi" );
		testPlaylist.add(testSong);
		assertNotNull(testPlaylist.playlist.get(0));
		assertEquals("Girl Like You", testPlaylist.playlist.get(0).getName());
	}
	
	@Test
	void testSong() {
		Song testSong = new Song("Girl Like You", "Toro Y Moi" );
		testSong.setPlaybackSpeed(2);
		assertNotNull(testSong);
		assertEquals("Girl Like You", testSong.getName());
		assertEquals("Toro Y Moi", testSong.getArtist());
		assertEquals(2, testSong.speed);
	}

}
