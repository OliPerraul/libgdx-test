package gdxtest;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;


public class Game extends ApplicationAdapter {

	@Override
	public void create() {
		Gdx.graphics.setWindowedMode(256, 540);
	}

	@Override
	public void render() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

}
