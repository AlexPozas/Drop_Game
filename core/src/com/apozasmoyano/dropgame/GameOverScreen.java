package com.apozasmoyano.dropgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;

public class GameOverScreen implements Screen {

    final dropgame game;
    int score=0;

    OrthographicCamera camera;

    public GameOverScreen(final dropgame game,  int score) {
        this.game = game;
        this.score = score;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
    }



    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        ScreenUtils.clear(0, 0, 0.2f, 1);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);


        game.batch.begin();
        game.font.getData().setScale(2);
        game.font.setColor(1, 0, 0, 1);
        game.font.draw(game.batch, "Game Over !!!! ", 250, 300);
        game.font.draw(game.batch, "Your Score: "+score, 250, 250);
        game.font.getData().setScale(1);
        game.font.draw(game.batch, "Tap anywhere to restart!", 250, 200);
        game.batch.end();

        if (Gdx.input.isTouched()) {
            game.setScreen(new GameScreen(game));
            dispose();
        }

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