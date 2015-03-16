package com.gr8bitsoftware.scaredycat;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Alan on 3/15/2015.
 */
public class MainMenuScreen implements Screen{
    public SpriteBatch batch;
    public BitmapFont font;
    public ScaredyCatGame game;

    public MainMenuScreen(ScaredyCatGame gm){
        game = gm;
        batch = new SpriteBatch();
        font = new BitmapFont();
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.camera.update();
        batch.setProjectionMatrix(game.camera.combined);
        batch.begin();

        font.draw(batch, "Scaredy Cat", 100,150);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
    }
}