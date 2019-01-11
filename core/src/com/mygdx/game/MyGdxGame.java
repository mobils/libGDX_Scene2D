package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class MyGdxGame extends Game {
	static public Skin gameSkin;

	@Override
	public void create () {

		gameSkin = new Skin(Gdx.files.internal("skin/glassy-ui.json"));

		//Pasar a primer screen
		this.setScreen(new MenuScreen(this));

	}

	@Override
	public void render () {
		super.render();

	}
	
	@Override
	public void dispose () {

	}
}
