package spring.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.di.CDPlayer;
import spring.di.CDPlayerConfig;
import spring.di.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={CDPlayerConfig.class})
public class CDPlayerTest {
	@Autowired
	private CompactDisc cd;
	@Autowired
	private CDPlayer player;
	@Test
	public void cdShouldNotBeNull(){
		/*assertNotNull(cd);*/
		System.out.println(cd+"\n"+player.getCd());
		
		cd.play();
		player.play();
	}
}
