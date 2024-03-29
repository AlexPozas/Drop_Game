package com.apozasmoyano.dropgame.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.apozasmoyano.dropgame.dropgame;

public class HtmlLauncher extends GwtApplication {

        @Override
        public GwtApplicationConfiguration getConfig () {
                // Resizable application, uses available space in browser
                return new GwtApplicationConfiguration(800, 480);
                // Fixed size application:
                //return new GwtApplicationConfiguration(800, 480);
        }

        @Override
        public ApplicationListener createApplicationListener () {
                return new dropgame();
        }
}