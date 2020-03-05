package gdxtest;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;


public class Game extends ApplicationAdapter {

	@Override
	public void create() {
		Gdx.graphics.setWindowedMode(256, 540);
		var tiledMap = new TmxMapLoader().load("assets/tilemap_overworld.tmx");
		for(var lay : tiledMap.getLayers())
		{
			for(var obj : lay.getObjects())
			{
				System.out.println(obj);
				System.out.println(obj);
			}
		}
		System.out.println();
	}

	@Override
	public void render() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

}
