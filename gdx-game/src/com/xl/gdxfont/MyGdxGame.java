package com.xl.gdxfont;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;

public class MyGdxGame extends Game
{
	Screen mainScreen;
	int SCREEN_WIDTH,SCREEN_HEIGHT;

	@Override
	public void create()
	{
		this.SCREEN_WIDTH = Gdx.graphics.getWidth();
		this.SCREEN_HEIGHT = Gdx.graphics.getHeight();
		mainScreen = new MainScreen(SCREEN_WIDTH,SCREEN_HEIGHT);
		setScreen(mainScreen);
	}

	@Override
	public void render()
	{        
	    Gdx.gl.glClearColor(0.5f, 1, 1, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		super.render();
	}

	@Override
	public void dispose()
	{
		super.dispose();
	}

	@Override
	public void resize(int width, int height)
	{
		super.resize(width,height);
	}

	@Override
	public void pause()
	{
		super.pause();
	}

	@Override
	public void resume()
	{
		super.resume();
	}
}
