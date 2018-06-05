package com.xl.gdxfont;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import javax.microedition.khronos.opengles.GL10;

/*
 游戏主画面
 在屏幕上绘制文字
 */
public class MainScreen implements Screen
{
	
	SpriteBatch batch;
	OrthographicCamera camera;
    BitmapFont font;
	Viewport stretchViewport;
	
	



	
	
	public MainScreen(int width,int height)
	{
		super();
		
		camera = new OrthographicCamera();
		camera.setToOrtho( false, width, height);
		
        create();

	}



	


	public void create() {

		stretchViewport = new StretchViewport(480, 800);
		//
		batch = new SpriteBatch();
        //创建BitmapFont类 用于画文字
		font = new BitmapFont(Gdx.files.internal("fonts/font32.fnt"),Gdx.files.internal("fonts/font32.png"), false);
		//设置文字颜色
		font.setColor(0.1f,0.1f,0.1f,1f);
		//字体比例
		font.setScale(1.0f);
	
	}
	
	


	@Override
	public void render(float p1)
	{
		// TODO: Implement this method
		
		
		Gdx.gl.glClearColor(0.8f, 0.8f, 0.8f, 1f);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		batch.setProjectionMatrix( camera.combined );

		batch.begin();
		
		//画文字
		font.draw(batch, "风的影子", 100,100);
		batch.end();
	}

	@Override
	public void resize(int width, int height)
	{
		camera.setToOrtho( false, width, height);
	}

	@Override
	public void show()
	{
		// TODO: Implement this method
		//FileLog.e("show");
	}

	@Override
	public void hide()
	{
		//FileLog.e("hide");

		// TODO: Implement this method
	}

	@Override
	public void pause()
	{
		// TODO: Implement this method
		//FileLog.e("pause");
	}

	@Override
	public void resume()
	{
		// TODO: Implement this method
		
	}

	@Override
	public void dispose()
	{
		//释放资源
		batch.dispose();
		font.dispose();
		
	}

}

