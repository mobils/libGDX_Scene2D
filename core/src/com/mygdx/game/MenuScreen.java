package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

/**
 * Created by Eva on 11/01/2019.
 */

public class MenuScreen implements Screen {

    public Stage stage;

    public MenuScreen(Game game) {

        Skin mySkin = new Skin(Gdx.files.internal("skin/glassy-ui.json"));
        stage = new Stage();


        Label label3 = new Label("Menu Screen",mySkin,"black");
        label3.setSize(Gdx.graphics.getWidth()/3,100);
        label3.setFontScale(1.1f);

        label3.setPosition(50*2,Gdx.graphics.getHeight()-100*6);
        stage.addActor(label3);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        stage.draw();
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

    }
}
